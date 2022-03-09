package u02.tasks

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.tasks.Es4.{p1, p2, p3, p4}

class Es4Test {

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
