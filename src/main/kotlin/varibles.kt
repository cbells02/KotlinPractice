fun main(){
    var todaysDate: String = "06/07/2022";
    println(todaysDate)

    var currentWeather: String = "Sunny";
    println(currentWeather)

    val pi: Double = 3.14;
    println(pi)

    //pi = 6.28 give a error can't reassign

    val typeTest = "6";

    // Declare your variable above ⬆️
    print("${typeTest::class.simpleName}")

    // prints the type of typeTest

}