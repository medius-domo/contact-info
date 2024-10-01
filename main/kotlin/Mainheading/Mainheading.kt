package cxx.Mainheading

import cxx.ContactInfoStyles
import kotlinx.html.DIV
import kotlinx.html.div
import kotlinx.html.h1

internal fun DIV.Mainheading(){
    div(classes = ContactInfoStyles.mainheading){
        h1 { +"Contact Information " }
    }
}