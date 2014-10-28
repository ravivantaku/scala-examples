class WorldlyGreeter(greeting : String) {
  val name = "Ravi"
  def greet() {
  val worldlyGreeting = WorldlyGreeter.worldify(greeting) 
   println(worldlyGreeting)
  } 
}

object WorldlyGreeter {
 def worldify(s : String) = s + ", world"
}

