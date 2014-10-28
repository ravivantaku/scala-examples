class Car(year: Int) {
 private var milesDriven: Int = 0
 def getMiles = milesDriven
 def getYear = year
 def drive(distance: Int) {
  milesDriven += Math.abs(distance)
 }
}
 object Car extends App {
val car = new Car(2009)
println("Car made in year" + car.getYear)
 println("Miles Driven " + car.getMiles) 
 println("Drive for 10 miles")
 car.drive(10)
 println("Miles driven" + car.getMiles)
 }
