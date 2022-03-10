package u02

object BTrees extends App:

  // A custom and generic binary tree of elements of type A
  enum Tree[A]:
    case Leaf(value: A)
    case Branch(left: Tree[A], right: Tree[A])

  object Tree:

    def function[A, B](t: Tree[A])(b: (Tree[A], Tree[A]) => B)(l: A => B): B = t match
      case Branch(l, r) => b(l, r)
      case Leaf(e) => l(e)

    def size[A](t: Tree[A]): Int = function[A, Int](t)(size(_) + size(_))(_ => 1)

    def find[A](t: Tree[A], elem: A): Boolean = function[A, Boolean](t)(find(_, elem) || find(_, elem))(_ == elem)

    def count[A](t: Tree[A], elem: A): Int = function[A, Int](t)(count(_, elem) + count(_, elem))(e => if (e == elem) 1 else 0)

  import Tree.*
  val tree = Branch(Branch(Leaf(1), Leaf(2)), Leaf(1))
  println(tree) // Branch(Branch(Leaf(1),Leaf(2)),Leaf(1))
  println(size(tree)) // ..,3
  println(find(tree, 1)) // true
  println(find(tree, 4)) // false
  println(count(tree, 1)) // 2
