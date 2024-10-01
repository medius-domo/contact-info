package cxx.Socialicons

import cxx.ContactInfoStyles
import kotlinx.html.DIV
import kotlinx.html.img
import kotlinx.html.p

internal fun DIV.Socialicons(imagepath:String,socialname:String){
    p(classes = ContactInfoStyles.paragraph){
        img(src = imagepath, alt = "socialmediaacount")
        +socialname
    }
}