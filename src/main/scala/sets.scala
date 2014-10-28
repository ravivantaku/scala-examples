object JetSets extends App {
 import scala.collection.mutable.HashSet
 val jetSet = new HashSet[String]
 jetSet += "Lear"
 jetSet += ("Boeing", "Airbus")
 println(jetSet.contains("Cessna"))
 println(jetSet)
 println(HashSet(4, 5, 1, 0, 8))
}
