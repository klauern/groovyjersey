package com.klauer.groovy.groovyjersey;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces

@Path("/groovyTest")
class GroovyTestService {
    @GET 
    @Produces (value=["text/html"])
    String getHtmlResponse() {
        // Return some cliched textual content
        return getGroovyTest()
    }

    String getGroovyTest() {
        def writer = new StringWriter()
        def result = new groovy.xml.MarkupBuilder(writer);
        result.html {
            body {
                h1(align: "center", "As of ${date()}")
                p('TA DA!')
                br()
                p('From Groovy')
            }
        }
        return writer.toString()
    }
}