package u02.tasks

object Es1:

  val parityFun: Int => String = _ % 2 match {
    case 0 => "even"
    case 1 => "odd"
  }

  def parityMethod(x: Int): String = x % 2 match
    case 0 => "even"
    case 1 => "odd"

