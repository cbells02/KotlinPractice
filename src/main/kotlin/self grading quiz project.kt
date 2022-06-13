fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47
    var points = 0

    // Write your code below
    println("What is 75 / 5?")
    val studentAnswer1 = Integer.valueOf(readLine())
    if (studentAnswer1 == quizAnswer1){
        points += 25
    }
    println("What is the value of y? : 6 * 2y = 36")
    var studentAnswer2 = Integer.valueOf(readLine())

    if(studentAnswer2 == quizAnswer2){
        points +=25
    }
    else if(studentAnswer2 ==quizAnswer2++ || studentAnswer2 == quizAnswer2--){
        points +=20
    }
    else{
        points +=1
    }

    println("What is the name of the triangle that has 2 equal sides?")
    val studentAnswer3 = readLine()

    if (studentAnswer3 == quizAnswer3){
        points +=25
    }
    else if(studentAnswer3 == "equilateral"){
        points +=1
    }

    println("what is 8 * 6 -(3 - 2)")
    val studentAnswer4 = Integer.valueOf(readLine())

    if (studentAnswer4 == quizAnswer4){
        points += 25
    }
    else if(studentAnswer4 in 44..54){
        points +=20
    }
    else{
        points +=1
    }

    if (points in 0..59){
        println("F")
    }
    else if(points in 60..69){
        println("D")
    }
    else if(points in 70..79){
        println("C")
    }
    else if(points in 80..89){
        println("B")
    }
    else if(points in 90..100){
        println("A")
    }
    else if(points in 101..110){
        println("A+")
    }
}