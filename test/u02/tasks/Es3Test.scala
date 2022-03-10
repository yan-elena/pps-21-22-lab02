package u02.tasks

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.tasks.Es3.negGeneric

class Es3Test:

  @Test def testGenericString(): Unit =
    val empty: String => Boolean = _ == ""
    val notStringEmpty = negGeneric[String](empty)
    assertTrue(notStringEmpty("foo"))
    assertFalse(notStringEmpty(""))
    assertTrue(notStringEmpty("foo") && !notStringEmpty(""))

  @Test def testGenericInt(): Unit = 
    val positive: Int => Boolean = _ >= 0
    val negative = negGeneric[Int](positive)
    assertTrue(negative(-1))
    assertFalse(negative(1))
    assertTrue(negative(-1) && !negative(1))
