class Person(firstName: String, lastName: String) {
 private var position: String = "tester"

 println("Creating " + toString())
 def this(firstName: String, lastName: String, positionHelp: String) {
  this(firstName, lastName)
  position = positionHelp
 }
 override def toString: String = {
  firstName + " " + lastName + " holds " + position + " positioned"
 }

}
object Person extends App {
 val john = new Person("jhon", "smith", "Analyst")

 println(john)
 val bill = new Person("Bill", "Walker")
 println(john.position)
 john.position = "Progammer"
  println(john.position) 
}
