package cxx.ContactandAdress

import cxx.ContactInfoStyles
import kotlinx.html.*

internal fun DIV.ContactandAdress(head:String,numberorpobx:String,emailorcontry:String,imagepath:String,whatspnoormap:String,){
    div(classes = ContactInfoStyles.contact){
        span(classes = ContactInfoStyles.contactheading) { +head }
        p (classes = ContactInfoStyles.paragraph){ +numberorpobx }
        p(classes = ContactInfoStyles.paragraph){ +emailorcontry }
        p(classes= ContactInfoStyles.whatsapiconparagraph) {
            img(src = imagepath, alt = "WhatsApp")
            +whatspnoormap
        }
    }
}