package u02.tasks

object Es1:

  val parityFun = (_: Int) % 2 match
    case 0 => "even"
    case 1 => "odd"

  def parityMethod(x: Int) = x % 2 match
    case 0 => "even"
    case 1 => "odd"

