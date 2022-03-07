package u02

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.TaskFunctions.{negFun, negGeneric, negMethod}

class NegTest {

  val empty: String => Boolean = _ == "" // predicate on strings

  @Test def testNegFunction(): Unit = {
    val notStringEmpty = negFun(empty)
    assertStringEmpty(notStringEmpty)
  }

  @Test def testNegMethod(): Unit = {
    val notStringEmpty = negMethod(empty)
    assertStringEmpty(notStringEmpty) // true
  }

  @Test def testGenericString(): Unit = {
    val notStringEmpty = negGeneric[String](empty)
    assertStringEmpty(notStringEmpty) // true
  }

  @Test def testGenericInt(): Unit = {
    val positive: Int => Boolean = _ >= 0 // predicate on strings
    val negative = negGeneric[Int](positive)
    assertTrue(negative(-1)) // true
    assertFalse(negative(1)) // false
    assertTrue(negative(-1) && !negative(1)) // true.. a comprehensive test
  }

  private def assertStringEmpty(notStringEmpty: String => Boolean): Unit = {
    assertTrue(notStringEmpty("foo")) // true
    assertFalse(notStringEmpty("")) // false
    assertTrue(notStringEmpty("foo") && !notStringEmpty("")) // true.. a comprehensive test
  }
}
