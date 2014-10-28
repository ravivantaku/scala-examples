object Sample extends App {
class Counter {
 private var value: Int = 0
 def increment() { value += 1}
 def current = value
}
 var co = new Counter
 co.increment()
 println(co.current)
 
 class Person {
  private var age: Int = 0
  private var name: String = ""
  def comesBefore(otherPerson : Person) = name < otherPerson.name
  def this(name: String) {
   this()
   this.name = name
  }
  def this(name: String, age: Int) {
   this(name)
   this.age = age
  }
 }
 val fred = new Person
} 
