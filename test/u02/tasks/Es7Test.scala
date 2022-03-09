package u02.tasks

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.tasks.Es7.ShapeOperations.{area, perimeter}
import u02.tasks.Es7.Shape

class Es7Test {

  @Test def testRectangle(): Unit = {
    val l = 2
    val w = 3
    val rectangle = Shape.Rectangle(l, w)
    assertEquals((l + w) * 2,  perimeter(rectangle))
    assertEquals(l * w, area(rectangle))
  }

  @Test def testCircle(): Unit = {
    val r = 3
    val circle = Shape.Circle(r)
    assertEquals(2 * math.Pi * r,  perimeter(circle))
    assertEquals(math.Pi * math.pow(r, 2), area(circle))
  }

  @Test def testSquare(): Unit = {
    val l = 2
    val square = Shape.Square(l)
    println(perimeter(square))
    println(area(square))
    assertEquals(4 * l,  perimeter(square))
    assertEquals(math.pow(l, 2), area(square))
  }
}