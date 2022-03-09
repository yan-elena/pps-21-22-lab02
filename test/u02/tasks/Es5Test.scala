package u02.tasks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.tasks.Es5.{compose, composeGeneric}

class Es5Test {

  @Test def composeTest(): Unit = {
    assertEquals(9, compose(_ - 1, _ * 2)(5))//(5*2)-1
  }

  @Test def composeTestGeneric(): Unit = {
    assertEquals(9, composeGeneric[Int](_ - 1, _ * 2)(5))//(5*2)-1
    assertEquals("foo", composeGeneric[String](_ + "o", _ + "o")("f"))
  }
}
