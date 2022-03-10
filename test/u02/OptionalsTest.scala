package u02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import u02.Optionals.Option
import u02.Optionals.Option.{Some, None, filter, map, map2}

class OptionalsTest:

  @Test def testFilter(): Unit =
    val s5: Option[Int] = Some(5)
    assertEquals(s5, filter(s5)(_ > 2))
    assertEquals(None(), filter(s5)(_ > 8))
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap(): Unit =
    val s5: Option[Int] = Some(5)
    assertEquals(Some(true), map(s5)(_ > 2))
    assertEquals(Some(false), map(s5)(_ > 8))
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap2(): Unit =
    val s1: Option[Int] = Some(1)
    val s2: Option[Int] = Some(2)
    assertEquals(Some(3), map2(s1, s2)(_ + _))
    assertEquals(Some(false), map2(s1, s2)(_ > _))

  @Test def testMap2None(): Unit =
    val s1: Option[Int] = Some(1)
    val s2: Option[Int] = Some(2)
    assertEquals(None(), map2(s1, None())(_ > _))
    assertEquals(None(), map2(None(), s2)(_ > _))
    assertEquals(None(), map2(None[Int](), None[Int]())(_ > _))
