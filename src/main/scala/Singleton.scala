class Marker private (color: String) {
  println("Creating " + this)
  override def toString: String = "marker color " + color
}
object Marker {
  private val markers = Map("red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "gree" -> new Marker("green")
    )
  def primaryColors = "red, blue ,green"
  def apply(color: String) =  if (markers.contains(color)) markers(color) else null 
  def getMarker(color: String) = 
    if (markers.contains(color)) markers(color) else null
// println(MarkerFactroy getMarker "blue") 
}

object Factory extends App {
 println(Marker.getMarker("blue"))
 println("Primary colors are : " + Marker.primaryColors)
  println(Marker("blue"))  
  println(Marker("red")) 
   println(Marker("yellow"))  
}
