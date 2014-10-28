object ParameterizeArrays extends App {
 val greetings = new Array[String](3)
 greetings(0) = "Hello"
 greetings(1) = ", "

 for (i <- 0 to 2)
   print(greetings(i))
}

