object ListCat extends App {
println( Nil) //it will display empty list
val nums = "one" :: "two" :: "three" :: Nil  //it's create a list using corns operator
println(nums ::: List("four")) //nums prepend to the List("four") and returns
println(List("four") ::: nums) //List("four") prepend to the nums and returns

println( 1 :: nums) //1 prepend to the nums list
// println( 1 ::: nums) this will through type error
// println( nums :: 1) this will through an error
val thrill = List("one", "two", "three", "four", "five")
println(thrill.count( s => s.length == 4))  //find no.of words have length 4
println(thrill.drop(2)) //It drops the list elements from 0th - 2nd position
//It drops right side elements from given index values to end of the list
println(thrill.dropRight(2))

//find the given word is exists in list
println(thrill.exists(s => s == "three"))

// filter words have length 4
println(thrill.filter(s => s.length == 4))
println(thrill.head) // returns the first element from the  list
println(thrill.init) // returns the last element from the list
println(thrill.isEmpty)
println(thrill.last)
println(thrill.map(s => s.toUpperCase))
// remove all elements which have length 4
}
