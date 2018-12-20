package app

import kotlinx.css.Color
import kotlinx.css.LinearDimension
import logo.logo
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.code
import react.dom.div
import react.dom.h2
import styled.css
import styled.styledDiv
import styled.styledP
import ticker.ticker


class MyApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div() {
            styledDiv {
                css {
                    backgroundColor = Color("#000")
                    height = LinearDimension("160px")
                    padding = "20px"
                    color = Color.white
                }

                logo()
                h2 {
                    +"Welcome to React with Kotlin"
                }
            }
            styledP {
                css {
                    fontSize = LinearDimension("large")
                }
                +"To get started, edit "
                code { +"app/App.kt" }
                +" and save to reload."
            }
            styledP {
                css {
                    fontSize = LinearDimension("medium")
                }
                ticker()
            }
        }
    }
}


fun RBuilder.app() = child(MyApp::class) {}
