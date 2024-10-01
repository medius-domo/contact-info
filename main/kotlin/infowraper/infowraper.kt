package cxx.infowraper

import cxx.ContactInfoStyles
import cxx.ContactandAdress.ContactandAdress
import cxx.Mainheading.Mainheading
import cxx.Separatingline.Separatingline
import cxx.Socialicons.Socialicons
import kotlinx.html.BODY
import kotlinx.html.div

internal fun BODY.infowraper(){
    div(classes = ContactInfoStyles.infowrapper) {
        Mainheading()
        div(classes = ContactInfoStyles.ContactAddressSocial) {
            ContactandAdress(
                "Contact",
                "+255753218865",
                "info@swillaschool.academia.co.tz",
                "/static/images/whatsapicon.svg",
                "+255758606572"
            )
            Separatingline()
            ContactandAdress(
                "Address",
                "Mbalizi Mbeya, P.O.Box 1787",
                "Tanzania.",
                "/static/images/locationicon.svg",
                "View on Map",
            )
            Separatingline()
            div(classes = ContactInfoStyles.socialicons) {

                Socialicons("/static/images/instagramicon.svg", "@swillaschools")
                Socialicons("/static/images/twittericon.svg", "@swillasecschools")
                Socialicons("/static/images/facebookicon.svg", "@swillasecondaryschools")
            }
        }
    }
}