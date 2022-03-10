package u02.tasks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.tasks.Es1.{parityFun, parityMethod}

class Es1Test:

  @Test def testParityFun(): Unit =
    testParity(parityFun)

  @Test def testParityMethod(): Unit =
    testParity(parityMethod)

  private def testParity(f: Int => String): Unit =
    assertEquals("even", f(2))
    assertEquals("odd", f(3))
