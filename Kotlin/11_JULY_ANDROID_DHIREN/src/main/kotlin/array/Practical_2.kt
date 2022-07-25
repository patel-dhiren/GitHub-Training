package array

import org.intellij.lang.annotations.Language

fun main() {

    var languages = arrayOf("Java", "Python", "Kotlin", "Dart", "PHP")

    //var numbers = arrayOf(23,45,12,56,12)

    // get value using index
    println("value at index 3 = ${languages[3]}")

    // get index based on value
    println("index of Kotlin : ${languages.indexOf("Kotlin")}")

    // set value to a particular index
    languages[3] = "C language"

    // reverse
    languages.reverse()

    languages.shuffle()

    languages.sortDescending()

    // contains
    if(languages.contains("Java")){
        println("array contains this value")
    }else{
        println("array does not contains this value")
    }

    for(index in languages.indices)
    {
        //println(languages[index])
        println(languages[index])
    }



}