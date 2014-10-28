object PrintMultiTable extends App {
// def printMultiTable = {
//   var i = 1 
//   // only i in scope here
//   while (i <= 10) {
//    var j = 1
//    // both i and j in scope here
//    while (j <= 10) {
//     val prod = (i * j).toString
//     // i, j and prod in scope here
//    var k = prod.length
//    // i, j, prod and k in scope here
//    while ( k < 4) {
//     print(" ")
//     k += 1
//    }
//     print(prod)
//     j += 1
//    }
//    // i and j still in scope; prod and k out of scope
//    println()
//    i += 1
//   }
//   // i still in scope; j, prod and k out of scope
// }
def printMultiTable = {
  for (i ← 1 to 10) {
    for (j ← 1 to 10) {
     val prod = (i * j).toString
     print(String.format("%4s", prod))
    }
    println()
  }
}
printMultiTable
}
