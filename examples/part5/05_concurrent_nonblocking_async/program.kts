import kotlinx.coroutines.*

fun work1(): Int {
  println("work1 in thread ${Thread.currentThread()}")
  return 1
}

fun work2(): Int {
  println("work2 in thread ${Thread.currentThread()}")
  return 2
}

runBlocking {
  val resultOf1 = async { work1() } //Deferred<T>
  val resultOf2 = async { work2() }
  
  println("fired off two calls")
  
  println(resultOf1.await() + resultOf2.await())
}