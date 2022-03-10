package u02.tasks

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.tasks.Es2.{negFun, negMethod}

class Es2Test:

  val empty: String => Boolean = _ == "" // predicate on strings

  @Test def testNegFunction(): Unit =
    testNeg(negFun(empty))

  @Test def testNegMethod(): Unit = 
    testNeg(negMethod(empty))

  private def testNeg(notStringEmpty: String => Boolean): Unit =
    assertTrue(notStringEmpty("foo")) // true
    assertFalse(notStringEmpty("")) // false
    assertTrue(notStringEmpty("foo") && !notStringEmpty("")) // true.. a comprehensive test
