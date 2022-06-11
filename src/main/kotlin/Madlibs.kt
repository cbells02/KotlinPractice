fun main () {

    val costOfGas = 2.28
    val mileage = 25
    // Declare the variable distance below

    println("What's your name?")
    var name = readLine()
    // Write your code below
    println("What is your friend's name")
    var friendsName = readLine()
    println("What is the adjective")
    var adjective = readLine()
    println("City?")
    var city = readLine()
    println("What is the band name?")
    var bandName = readLine()
    println("What job does $friendsName have?")
    var work = readLine()

    val distance : Int
    println("Choose a integer between 400 and 600")
    distance = Integer.valueOf(readLine())

    val totalForGas = costOfGas / mileage * distance
    val totalMoneySaved = totalForGas + 200

    println("""
    A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $ $totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $ $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}