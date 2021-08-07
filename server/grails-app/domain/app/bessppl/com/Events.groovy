package app.bessppl.com

import org.bson.types.ObjectId

class Events {

    SlugUrl slugUrl

    ObjectId id
    String avatar
    String name
    String slug=""
    String description
    String fee
    String currency
    Date date
    Date dateCreated
    Date lastUpdated

    def beforeInsert() {
        slug = name.toLowerCase().replace(" ","-")
    }
    def beforeUpdate() {
        slug = name.toLowerCase().replace(" ","-")
    }


        static constraints = {
        avatar nullable:true, blank:true
        name unique:true ,matches: "[a-zA-Z]+"
        slug unique:true ,nullable:true, blank:true
        description nullable: true, blank: true
    }
}
