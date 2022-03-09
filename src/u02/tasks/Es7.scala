package u02.tasks

object Es7:

  enum Shape:
    case Rectangle(length: Double, width: Double)
    case Circle(radius: Double)
    case Square(length: Double)
    
  object ShapeOperations:

    def perimeter(s: Shape): Double = s match {
      case Shape.Rectangle(l, w) => (l + w) * 2
      case Shape.Circle(r) => 2 * math.Pi * r
      case Shape.Square(l) => 4 * l
    }
  
    def area(s: Shape): Double = s match {
      case Shape.Rectangle(l, w) => l * w
      case Shape.Circle(r) => math.Pi * math.pow(r, 2)
      case Shape.Square(l) => math.pow(l, 2)
    }

