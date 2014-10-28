class ChecksumCalculator {
 private  var sum = 0
 def getSum(num : Int) = sum + num
// def add(b: Byte): Unit = {
//  sum += b
// }
// procedure example
 def add(b : Byte) { sum += b }
 def checksum: Int = {
  ~(sum & 0xFF) + 1
 }
 def dispSum = sum

}
 
object ChecksumCalculator {
  def calcChecksum(s : String) : Int = {
   val cc = new ChecksumCalculator
   for ( c ← s) {
     cc.add(c.toByte)
     println(c)
     println(cc.dispSum)
   }
   cc.checksum
  }
  //ChecksumCalculator.calcChecksum("Every value is an object")
}
//object ChecksumCalculatorObj extends App {
//println(ChecksumCalculator.calcChecksum("Every value is an object"))
//}
