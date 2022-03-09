package u02.tasks

object Es3:
  
  def negGeneric[X](p: X => Boolean): X => Boolean = x => !p(x)
  