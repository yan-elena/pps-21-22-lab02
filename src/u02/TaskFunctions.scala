package u02

object TaskFunctions extends App:

  //es3
  val parityFun: Int => String = {
    case i if i%2==0 => "even"
    case _ => "odd"
  }
  
  def parityMethod(x: Int): String = x match
    case i if i%2==0 => "even"
    case _ => "odd"

  val negFun: (String => Boolean) => String => Boolean = p=>s => !p(s)
  def negMethod(p: String => Boolean): String => Boolean = s => !p(s)
  def negGeneric[X](p: X => Boolean): X => Boolean = x => !p(x)

  //es4
  val p1: Int => Int => Int => Boolean = x => y => z => x<=y && y<=z
  val p2: (x: Int, y: Int, z: Int) => Boolean = (x,y,z) => x<=y && y<=z
  def p3(x: Int)(y: Int)(z: Int): Boolean = x<=y && y<=z
  def p4(x: Int, y: Int, z: Int): Boolean = x<=y && y<=z

  //es5
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
  println(compose(_ - 1, _ * 2)(5))

  //es6
  def fib(n: Int): Int =
    def _fib(n: Int): Int = n match {
      case 0 => 0
      case 1 => 1
      case _ => _fib(n-1) + _fib(n-2)
    }
    _fib(n)

  println((fib(0), fib(1), fib(2), fib(3), fib(4)))
  


//estendere modulo Option = aggiungere altri metodi