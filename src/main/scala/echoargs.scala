object EchoArgs extends App {
var i = 0
//this is example for imperative style of code
while (i < args.length) {
   if (i != 0) print(" ")
   print(args(i))
  i += 1
 }

 //foreach statements
 args.foreach(arg => println(arg))

 args.foreach(println)
 val ar = Array(1, 3, 4, 5)
 def display(a : Int) = println(a )
 ar.foreach(display )

 //for statements and this is an example for functional style
 for (num <- ar )
   println(num + 10)
}

