package app.bessppl.com

import grails.gorm.services.Service

@Service(Events)
interface EventsService {

    Events get(Serializable id)

    List<Events> list(Map args)

    Long count()

    Events delete(Serializable id)

    Events save(Events events)

}
