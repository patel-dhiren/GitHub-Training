package array

fun main() {

    var nums = intArrayOf(23,56,12,56,12)

    //var numbers = floatArrayOf(34.5f, 12.3f)

    println("size : ${nums.size}")

    var sum = 0
    for(num in nums){
        sum+=num    // sum = sum+num
    }

    // sum of array elements
    println("sum of array element : $sum")
}