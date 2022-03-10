package u02.tasks

object Es2:

  val negFun: (String => Boolean) => String => Boolean = p => s => !p(s)
  def negMethod(p: String => Boolean): String => Boolean = s => !p(s)
