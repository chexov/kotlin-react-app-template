package logo

import kotlinx.css.Display
import kotlinx.css.LinearDimension
import kotlinx.css.Position
import react.RBuilder
import react.dom.jsStyle
import styled.css
import styled.keyframes
import styled.styledDiv
import styled.styledImg

val reactLogo = "react.svg"
val kotlinLogo = "kotlin.svg"

fun RBuilder.logo(lheight: Int = 100) {
    styledDiv {
        css {
            keyframes {

                //                @keyframes Logo-spin {
//                    from { transform: rotateY(-90deg); opacity: 1 }
//                    50% { transform: rotateY(90deg); opacity: 1 }
//                    51% { transform: rotateY(90deg); opacity: 0 }
//                    to { transform: rotateY(270deg); opacity: 0 }
//                }
            }
            position = Position.relative
            display = Display.inlineBlock
        }
        attrs.jsStyle.height = lheight
        styledImg(alt = "React logo.logo", src = reactLogo) {
            css {
                //                animation = "infinite 10s linear"
                height = LinearDimension("100%")
            }
        }
        styledImg(alt = "Kotlin logo.logo", src = kotlinLogo) {
            css {
                opacity = 0
//                animation: Logo-spin infinite 10s 5s linear;
                height = LinearDimension("72%")
                position = Position.absolute;
                top = LinearDimension("14%")
                right = LinearDimension("24%")
            }
        }
    }
}
