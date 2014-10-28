class Decorator(left: String, right: String) {
def layout[A](x: A) = left + x.toString() + right
}

object FunTest extends App {
 def apply(f: Int ⇒ String, v: Int) = f(v)
}
