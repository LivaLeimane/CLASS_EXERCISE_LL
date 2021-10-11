import java.util.Calendar
import scala.io.StdIn.readLine

object ExerciseAug12Age100LL extends App{
  //TODO Ask user for the current Year
  //TODO ask user for their name
  //TODO ask user for their age...

  //TODO calculate and print the year when the user will be 100 years old

  val userName = readLine("What is your name?")
  println(s"Great! Nice to meet you $userName!")
  val yourAge = readLine("How old are you?").toDouble
  //val currentYear = readLine(s"Could you please tell me what is the current year, $userName?").toDouble
  val now = Calendar.getInstance()
  val currentYear = now.get(Calendar.YEAR) // so now I do not need to sk for year anymore
  val currentMonth = now.get(Calendar.MONTH)
  println(s"Current year is $currentYear and month is $currentMonth.") //months just like most things in programming start with 0
  val age = 100
  //  val yearWhen100 =(age-yourAge+currentYear).toInt //so similar to floor function in some languages
  val yearWhen100 = (currentYear+age-yourAge).round//another option, difference being this would round up from .5 to 1
  println(s"$userName, you would be 100 years old in $yearWhen100!")





}
