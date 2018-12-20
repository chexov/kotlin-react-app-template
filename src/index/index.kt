package index

import app.app
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {

//    requireAll(kotlinext.js.require.context(".",
//            true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        app()
//        hello("asdf")
    }
}
