package u02.tasks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.tasks.Es6.fib

class Es6Test:

  @Test def fibonacciTest(): Unit = 
    assertEquals((0, 1, 1, 2, 3), (fib(0), fib(1), fib(2), fib(3), fib(4)))
