import ChecksumCalculator.calcChecksum
object Summer {
 def main(args : Array[String]) {
  for (arg ← args)
    println(arg + " : " + calcChecksum(arg))
 }
}
