package app.bessppl.com

import org.bson.types.ObjectId

class Events {

    ObjectId id
    String avatar
    String name
    String slug
    String description
    String fee
    String currency
    Date date
    Date dateCreated
    Date lastUpdated

    static constraints = {
        avatar nullable:true, blank:true
        name unique:true
        slug unique:true
        description nullable: true, blank: true
    }
}
