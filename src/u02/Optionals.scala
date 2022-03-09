package u02

object Optionals extends App:

  enum Option[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    //extended functionality

    def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match {
      case Some(opt) if f(opt) => Some(opt)
      case _ => None()
    }

    def map[A](opt: Option[A])(f: A => Boolean): Option[Boolean] = opt match {
      case Some(opt) => Some(f(opt))
      case _ => None()
    }

    def map2[A, B](a1: Option[A], a2: Option[A])(f: (A, A) => B): Option[B] = (a1, a2) match {
      case (Some(a1), Some(a2)) => Some(f(a1, a2))
      case _ => None()
    }

  import Option.*
  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = None()

  println(s1) // Some(1)
  println(orElse(s1, 0))
  println(orElse(s3, 0)) // 1,0
  println(flatMap(s1)(i => Some(i + 1))) // Some(2)
  println(flatMap(s1)(i => flatMap(s2)(j => Some(i + j)))) // Some(3)
  println(flatMap(s1)(i => flatMap(s3)(j => Some(i + j)))) // None
