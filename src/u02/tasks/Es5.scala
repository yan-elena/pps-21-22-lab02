package u02.tasks

object Es5:

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
  def composeGeneric[X](f: X => X, g: X => X): X => X = x => f(g(x))
