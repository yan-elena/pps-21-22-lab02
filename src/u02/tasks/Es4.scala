package u02.tasks

object Es4:

  val p1: Int => Int => Int => Boolean = x => y => z => x<=y && y<=z
  val p2: (x: Int, y: Int, z: Int) => Boolean = (x,y,z) => x<=y && y<=z
  def p3(x: Int)(y: Int)(z: Int): Boolean = x<=y && y<=z
  def p4(x: Int, y: Int, z: Int): Boolean = x<=y && y<=z

