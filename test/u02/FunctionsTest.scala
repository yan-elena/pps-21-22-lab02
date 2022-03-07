package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.TaskFunctions.{negFun, p1, p2, p3, p4, parityFun, parityMethod}

class FunctionsTest {

  @Test def testParityFun(): Unit = {
    assertEquals("even", parityFun(2))
    assertEquals("odd", parityFun(3))
  }

  @Test def testParityMethod(): Unit = {
    assertEquals("even", parityMethod(2))
    assertEquals("odd", parityMethod(3))
  }

  @Test def testCurrying(): Unit = {
    assertTrue(p1(1)(2)(3))
    assertTrue(p2(1,2,3))
    assertTrue(p3(1)(2)(3))
    assertTrue(p4(1,2,3))

    assertFalse(p1(3)(2)(3))
    assertFalse(p2(3,2,3))
    assertFalse(p3(3)(2)(3))
    assertFalse(p4(3,2,3))
  }
}
