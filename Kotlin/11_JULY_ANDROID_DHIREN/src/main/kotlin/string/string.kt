package string

fun main() {

    var name = "Tops Technologies"  // String or char array

    // length
    println("length of a string : ${name.length}")

    for(ch in name){
        print("$ch  ")
    }

    // equals
    if(name == "Tops technologies"){
        println("\nboth are equals")
    }else{
        println("\nboth are different")
    }

    if(name.equals("tops technologies", ignoreCase = true)){
        println("both are equals")
    }else{
        println("both are different")
    }

    // trim
    var s1 = " India  "
    var s2 = "India"

    println("trim : ${s1.trim() == s2}")

    // plus
    var s3 = s2.plus(" is my country")
    println(s3)
    println("value of s2 : $s2")

    println("char at index 8 : ${name[8]}")

    // lower and uppercase
    println("lowercase : ${name.lowercase()}")
    println("uppercase : ${name.uppercase()}")

    // replace
    println("replace : ${name.replace("tops", "Hops", ignoreCase = true)}")
    println("replace : ${name.replace('t', 'H', ignoreCase = true)}")

    // substring
    println("substring : ${name.substring(6)}")
    println("substring : ${name.substring(6, 15)}")
    println("substring : ${name.substring(4..10)}")

    // startsWith
    println("startsWith : ${name.startsWith("top", ignoreCase = true)}")

    name = "Tops Technologies"

    // contains
    println("contains : ${name.contains("gie ".trim())}")



}