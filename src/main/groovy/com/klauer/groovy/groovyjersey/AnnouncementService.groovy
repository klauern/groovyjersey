package com.klauer.groovy.groovyjersey;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces

@Path("/announcements")
class AnnouncementService {
    def announcements = "announcements.txt"
    def errorReadingFileText = " - Error reading Announcements, Announcement File may not exist."
    def noAnnouncementsText = " - No Announcements for Today"

    @GET 
    @Produces (value=["text/html"])
    String getHtmlResponse() {
        // Return some cliched textual content
        return getAnnouncements()
    }

    String getAnnouncements() {
        def announcement = new File(System.getProperty("user.home") + File.separator + announcements)
        def writer = new StringWriter()
        def result = new groovy.xml.MarkupBuilder(writer);
        result.html {
            body {
                h1(align: "center", "As of ${date()}")
                table(width: "100%", height: "100%") {
                    td {
                        if (!announcement.exists()) {
                            tr(errorReadingFileText)
                        } else if (announcement.text.length() <= 0) {
                            tr(noAnnouncementsText)
                        } else {
                            announcement?.eachLine {
                                tr(" - $it")
                            }
                        }
                    }
                }
            }
        }
        return writer.toString()
    }
}