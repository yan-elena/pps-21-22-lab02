package u02

object TaskFunctions extends App:

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

  val p1: Int => Int => Int => Boolean = x => y => z => x<=y && y<=z
  val p2: (x: Int, y: Int, z: Int) => Boolean = (x,y,z) => x<=y && y<=z
  def p3(x: Int)(y: Int)(z: Int): Boolean = x<=y && y<=z
  def p4(x: Int, y: Int, z: Int): Boolean = x<=y && y<=z




//estendere modulo Option = aggiungere altri metodi