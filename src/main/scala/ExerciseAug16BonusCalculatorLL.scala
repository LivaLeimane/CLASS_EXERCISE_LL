import scala.io.StdIn.readLine

object ExerciseAug16BonusCalculatorLL extends  App {
  println("Xmas bonus calculator")
  //TODO
  //Ask for person's name
  //Ask for how long they have worked at the firm
  //Ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus (3 years * 150)

  //if they are not eligible for bonus you should say so


  val userName = readLine("What is your name, sir/madam?")
  val yearsWorked = readLine(s"Dear $userName, how long have you been worked at the firm?").toInt
  if (yearsWorked > 2) {
    println("Great! Let's calculate your Christmas bonus!")
    val userMonthlySalary = readLine(s"Dear $userName, what is your monthly salary?").toDouble
    val bonusPerYear = userMonthlySalary*0.15
    val xmasBonusTotal = (yearsWorked-2)*bonusPerYear.round
    println(s"Dear $userName, your Christmas bonus is $xmasBonusTotal eur")
  }
  else println(s"Sorry! $userName, you are not eligible for bonus yet! Prerequisite for bonus calculation is that you should be worked at the company at least 2 years!")

}
