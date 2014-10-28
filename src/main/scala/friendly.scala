trait Friendly {
 def greet = "hi"
}

class Dog extends Friendly {
 override def greet = "woof"
}

class HungryCat extends Friendly {
 override def greet = "Meow"
}

class HungryDog extends Dog {
 override def greet = "I'd like to eat my own dog food"
}

trait ExclamatoryGreeter extends Friendly {
 override def greet = super.greet + "!"
}

object Friend extends App {
var pet : Friendly = new Dog
println(pet.greet)

pet = new HungryCat
println(pet.greet)

pet = new HungryDog
println(pet.greet)

pet = new Dog with ExclamatoryGreeter
println(pet.greet)

pet = new HungryCat with ExclamatoryGreeter 
println(pet.greet)
pet = new HungryDog with ExclamatoryGreeter 
println(pet.greet) 

}
