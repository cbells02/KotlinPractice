fun main() {
    // Write your code below 🏞
    var responsibilites = listOf("feed the chimps", "play a random game", "conduct a health check on foxie")

    var responsibilitiesComplete = 0
    var timeSpent = 0
    var totalShiftTime = 4

    var foxiesHealthCheck = mutableMapOf<String, Any?>()
    var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("First, ${responsibilites[0]}.")
    println("Feeding Bonnie....")
    chimpsHaveEaten["Bonnie"] = true
    println("Feeding Jubilee....")
    chimpsHaveEaten["Jubilee"] = true
    println("Feeding Frodo....")
    chimpsHaveEaten["Frodo"] = true
    println("Feeding Foxie....")
    chimpsHaveEaten["Foxie"] = true
    println(chimpsHaveEaten)
    timeSpent +=1
    responsibilitiesComplete +=1
    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilites.size} responsibilities.")

    //The second task

    println("Next, ${responsibilites[1]}")
    var games = setOf("tug-of-war with a blanket", "catch and throw", "number game")
    var randomGame = games.random()
    println(randomGame)
    timeSpent +=1
    responsibilitiesComplete +=1
    println("You've completed $responsibilitiesComplete / ${responsibilites.size} responsibilities.")

// third to do list
    println("Next, ${responsibilites[2]}")
    foxiesHealthCheck["temperature"] = 32.7
    foxiesHealthCheck["mood"] = "happy"


    println(foxiesHealthCheck)

    timeSpent +=1
    responsibilitiesComplete +=1
    println("You've completed $responsibilitiesComplete / ${responsibilites.size} responsibilities.")

    if (timeSpent <= totalShiftTime){
        println("Congraulations!!!! Great Job")
    }
    else if(timeSpent >= totalShiftTime){
        println("All tasks completed with overtime :(")
    }
    else{
        println("Tasks not completed and took overtime you are fired")
    }





}