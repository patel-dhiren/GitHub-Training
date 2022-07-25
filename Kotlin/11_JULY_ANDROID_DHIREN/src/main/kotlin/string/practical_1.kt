package string

fun main() {

    var languages = arrayOf("Java", "Kotlin", "Dart", "Java Script", "C language", "C#", "Python")

    for(value in languages){

        if(value.startsWith("Ja", ignoreCase = true)){
            println(value)
        }

    }

}