package app.bessppl.com

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import org.grails.datastore.mapping.core.Datastore
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
@Rollback
class EventsServiceSpec extends Specification {

    EventsService eventsService
    @Autowired Datastore datastore

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Events(...).save(flush: true, failOnError: true)
        //new Events(...).save(flush: true, failOnError: true)
        //Events events = new Events(...).save(flush: true, failOnError: true)
        //new Events(...).save(flush: true, failOnError: true)
        //new Events(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //events.id
    }

    void cleanup() {
        assert false, "TODO: Provide a cleanup implementation if using MongoDB"
    }

    void "test get"() {
        setupData()

        expect:
        eventsService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Events> eventsList = eventsService.list(max: 2, offset: 2)

        then:
        eventsList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        eventsService.count() == 5
    }

    void "test delete"() {
        Long eventsId = setupData()

        expect:
        eventsService.count() == 5

        when:
        eventsService.delete(eventsId)
        datastore.currentSession.flush()

        then:
        eventsService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Events events = new Events()
        eventsService.save(events)

        then:
        events.id != null
    }
}
