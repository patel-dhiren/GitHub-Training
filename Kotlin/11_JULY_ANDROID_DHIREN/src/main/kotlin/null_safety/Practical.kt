package null_safety

fun main() {

    var email: String = "abc@gmail.com"        // non-nullable
    var name: String? = "tops"        // nullable

    println("length (non-nullable) : ${email.length}")

  /*  var result = if (name != null)
        name.length
    else
        null*/

    println("length (nullable) : ${name?.length}")      // ?. Safe call operator


}