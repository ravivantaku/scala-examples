class Vehicle(id: Int, year: Int) {
  println(id + " " + year)
 override def toString: String = "ID: " + id + " Year: " + year
}

class Jeep(id: Int, year: Int, fuelLevel: Int) extends Vehicle(id, year) {
  println("Jeep derived class")
//  override def toString: String = "ID: " + id + " Year: " + year 
 override def toString: String = super.toString + " Fuel Level " + fuelLevel

}

object Vehicles extends App {
 val jeep = new Jeep(10, 2009, 80)
println(jeep)
}
