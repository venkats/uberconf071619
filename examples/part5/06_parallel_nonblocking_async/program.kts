import kotlinx.coroutines.*

suspend fun work1(): Int {
  println("work1 in thread ${Thread.currentThread()}")
  delay(1000)
  return 1
}

suspend fun work2(): Int {
  println("work2 in thread ${Thread.currentThread()}")
  return 2
}

runBlocking {
  withContext(Dispatchers.IO) {
    val resultOf1 = async { work1() }
    val resultOf2 = async { work2() }
    
    println("fired off two calls ${Thread.currentThread()}")

    println(resultOf1.await() + resultOf2.await())    
  }
}