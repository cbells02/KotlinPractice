// Write your code here
class Calculator(val name: String){

    init{
        println("$name Calculator")
    }
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int{
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Any{
        if (num2 == 0){
            return "You can't divide by 0 fool!!"
        }else{
            return num1 / num2}
    }
    fun power(num1: Int, num2: Int): Int {
        var result = 1
        for(i in 1..num2){
            result *= num1
        }
        return result
    }
}

fun main(){
    var ti89 = Calculator("Toasty")
    println(ti89.add(5,7))
    println(ti89.subtract(99,44))
    println(ti89.divide(6666,3))
    println(ti89.power(2,3))
}