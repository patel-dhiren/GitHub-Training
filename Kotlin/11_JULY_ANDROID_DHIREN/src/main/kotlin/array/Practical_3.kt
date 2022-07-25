package array


fun main() {


    var nums = IntArray(5)

    for(i in nums.indices){
        print("enter value at index-$i : ")
        var num = readLine()!!.toInt()

        nums[i] = num
    }

    for(num in nums){
        if(num%2 ==0){
            println("$num = even")
        }else{
            println("$num = odd")
        }
    }

}