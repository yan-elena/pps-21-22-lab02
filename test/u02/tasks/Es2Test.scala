package u02.tasks

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.tasks.Es2.{negFun, negMethod}

class Es2Test {

  val empty: String => Boolean = _ == "" // predicate on strings

  @Test def testNegFunction(): Unit = {
    val notStringEmpty = negFun(empty)
    assertStringEmpty(notStringEmpty)
  }

  @Test def testNegMethod(): Unit = {
    val notStringEmpty = negMethod(empty)
    assertStringEmpty(notStringEmpty) // true
  }

  private def assertStringEmpty(notStringEmpty: String => Boolean): Unit = {
    assertTrue(notStringEmpty("foo")) // true
    assertFalse(notStringEmpty("")) // false
    assertTrue(notStringEmpty("foo") && !notStringEmpty("")) // true.. a comprehensive test
  }
}
