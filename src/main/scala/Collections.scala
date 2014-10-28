object Collections extends App {
 // Using Map collection
 val feeds = Map("Andy Hunt" -> "blog.toolshed.com", "Dave Thomas" -> "pragdave.pragprog.com", "Dan Steinberg" -> "dimsumthiking.com/blog")
 //filter feeds whose name starts with "D" 
 val filterNameStartWithD = feeds filterKeys( _ startsWith "D")
 println("# of Filtered: " + filterNameStartWithD.size)
 //filter feeds whose name starts with "D" and blog in URL
 val nameStartWithDAndBlogInFeed = feeds filter { element ⇒ println(element)}
}
