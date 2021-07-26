package app.bessppl.com

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

@ReadOnly
class EventsController {

    EventsService eventsService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond eventsService.list(params), model:[eventsCount: eventsService.count()]
    }

    def show(Long id) {
        respond eventsService.get(id)
    }

    @Transactional
    def save(Events events) {
        if (events == null) {
            render status: NOT_FOUND
            return
        }
        if (events.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond events.errors
            return
        }

        try {
            eventsService.save(events)
        } catch (ValidationException e) {
            respond events.errors
            return
        }

        respond events, [status: CREATED, view:"show"]
    }

    @Transactional
    def update(Events events) {
        if (events == null) {
            render status: NOT_FOUND
            return
        }
        if (events.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond events.errors
            return
        }

        try {
            eventsService.save(events)
        } catch (ValidationException e) {
            respond events.errors
            return
        }

        respond events, [status: OK, view:"show"]
    }

    @Transactional
    def delete(Long id) {
        if (id == null || eventsService.delete(id) == null) {
            render status: NOT_FOUND
            return
        }

        render status: NO_CONTENT
    }
}
