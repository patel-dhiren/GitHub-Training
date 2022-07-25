package control_statement

import kotlin.math.roundToInt

fun main() {

    var marks = 232         // total marks = 500
    var subject = 5

    var avg = marks.toFloat() / subject
    println("$avg")
    var temp = avg / 10     //  45

    var result = when (temp.roundToInt()) {
        7 -> {
            "A grade"           // for multiline statement
        }
        6 -> "B grade"
        5 -> "C Grade"
        else -> "Fail"
    }

    println(result)

}