import kotlinx.coroutines.*

suspend fun task1() {
  println("entering task1 in ${Thread.currentThread()}")
  yield()
  println("exiting task1 in ${Thread.currentThread()}")
}

suspend fun task2() {
  println("entering task2 in ${Thread.currentThread()}")
  yield()
  println("exiting task2 in ${Thread.currentThread()}")
}

runBlocking {
  launch { task1() }
  launch { task2() }
  println("called the two tasks")
}