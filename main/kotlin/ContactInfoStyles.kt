package cxx

import kotlinx.css.*
import cxx.StyleSheet as StyleSheet
internal object ContactInfoStyles : StyleSheet() {
    val bbody by classname {
        display=Display.flex
        justifyContent=JustifyContent.center
    }
    val infowrapper by classname {
        display=Display.flex
        flexDirection=FlexDirection.column
        alignItems=Align.center
        justifyContent=JustifyContent.center
        borderRadius=12.px
        backgroundColor=Color("#f1e9f1")
        media(onlyScreenMaxWidth(940.px)){
            width=100.pct
        }
        media(onlyScreenMinWidth(940.px)){
            width=80.pct
        }
    }
    val mainheading by classname {
        display=Display.flex
        color=Color("#6e1f73")
        fontFamily="Markpro"
    }
    val ContactAddressSocial by classname {
        display = Display.flex
        borderRadius = 12.px
        justifyContent=JustifyContent.center
        backgroundColor= Color.white
        marginTop=1.1.vw
        marginBottom=3.2.vw
        padding=Padding(3.13.vw)
        media(onlyScreenMaxWidth(767.98.px)){
            flexDirection=FlexDirection.column
            width=90.pct
        }

    }
    val contact by classname {
        display = Display.flex
        flexDirection = FlexDirection.column
        marginLeft = 1.04.vw
        paddingLeft = 1.04.vw
        fontFamily="Markpro"
    }
    val whatsapiconparagraph by classname {
        color=Color("#88488c")
        fontFamily="Markpro"
        display=Display.flex
        gap=8.px
        media(onlyScreenMinWidth(768.98.px)){
            width=18.vw
        }
    }
    val paragraph by classname {
        color=Color("#b7b7b7")
        marginBottom=0.px
        display=Display.flex
        gap=8.px 
    }
    val contactheading by classname {
        fontSize=20.px
        fontWeight= FontWeight.w500
    }
    val separatingline by classname {
        width = 2.px
        backgroundColor = Color("#cccccc")
        height = 50.pct
        margin= Margin(20.px)
        media("(width < 767.98px)"){
            width=50.pct
            height=2.px
        }
    }
    val socialicons by classname {
        display = Display.flex
        flexDirection = FlexDirection.column
        fontFamily="Markpro"
        marginRight=20.px
        paddingRight= 20.px
    }
}