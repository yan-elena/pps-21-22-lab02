package u02.tasks

object Es6:

  /*
  la funzione non è una ricorsione tail perchè il risultato che mi ritorna dalla chiamata non è il risultato finale che
  restituisco, infatti lo devo ancora sommare a fib(n-2) per avere il risultato complessivo
   */
  def fib(n: Int): Int =
    def _fib(n: Int): Int = n match
      case 0 => 0
      case 1 => 1
      case _ => _fib(n - 1) + _fib(n - 2)

    _fib(n)
