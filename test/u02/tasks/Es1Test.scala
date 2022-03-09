package u02.tasks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.tasks.Es1.{parityFun, parityMethod}

class Es1Test {

  @Test def testParityFun(): Unit = {
    assertEquals("even", parityFun(2))
    assertEquals("odd", parityFun(3))
  }

  @Test def testParityMethod(): Unit = {
    assertEquals("even", parityMethod(2))
    assertEquals("odd", parityMethod(3))
  }
}