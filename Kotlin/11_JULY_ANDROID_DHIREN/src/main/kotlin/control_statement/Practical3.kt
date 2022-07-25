package control_statement

// else if ladder

fun main() {

    var marks = 232         // total marks = 500
    var subject = 5

    var avg = marks.toFloat() / subject
    //println("average mark : $avg")

    var grade = if (avg >= 70) {
        "A Grade"
    } else if (avg >= 60 && avg < 70) {
        "B Grade"
    } else if (avg >= 45 && avg < 60) {
        "C Grade"
    } else {
        "Fail"
    }

    println(grade)

}