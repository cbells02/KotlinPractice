fun getListOfNumbers(): List<Int>{
    val myList = mutableListOf<Int>()
    for (i in 1..7){
        println("Enter a year: ")
        val answer = Integer.valueOf(readLine())
        myList.add(answer)
    }
    return myList
}

fun findMax(myList: List<Int>):Int {
    var largestNumber = myList[0]
    for (i in myList){
        if (i > largestNumber){
            largestNumber = i
        }
    }
    return largestNumber
}

fun findMin(myList: List<Int>):Int{
    val smallestNumber = myList[0]
    for(i in myList){
        if(i < smallestNumber){

        }
    }
    return smallestNumber
}

fun findAverage(myList: List<Int>):Int{
    var sum = 0
    for(i in myList){
        sum += i
    }
    return sum/myList.size
}

fun checkIfListContains(myList: List<Int>,intArg:Int): Boolean{
    for(i in myList){
        if(i == intArg){
            return true
        }
    }
    return false
}


fun main() {
    // Write more code below
    val values = getListOfNumbers()
    println(values)
    val largestValue = findMax(values)
    println("The largest number is $largestValue.")
    val smallestValue = findMin(values)
    println("The smallest number is $smallestValue")
    val average = findAverage(values)
    println("The average is $average")
    println("Enter a number to check for")
    val numToFind = Integer.valueOf(readLine())
    val containsValue = checkIfListContains(values, numToFind)
    if (containsValue == true){
        println("The number exists in the list.")
    }else{
        println("the value does not exist within the list.")
    }


}

