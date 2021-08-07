package app.bessppl.com

class UrlMappings {

    static mappings = {


        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")


        //Events
        get "/api/events"(controller: "events",action:"index")
        get "/api/events/$slug?"(controller: "events",action:"show")
        post "/api/events?"(controller: "events",action:"save")
        put "/api/events/$slug?"(controller: "events",action:"update")
        patch "/api/events?"(controller: "events",action:"patch")


        "/"(uri: 'index.html')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
