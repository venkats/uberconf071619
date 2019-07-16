import kotlinx.coroutines.*

fun task1() {
  println("entering task1 in ${Thread.currentThread()}")
  println("exiting task1 in ${Thread.currentThread()}")
}

fun task2() {
  println("entering task2 in ${Thread.currentThread()}")
  println("exiting task2 in ${Thread.currentThread()}")
}

runBlocking {
  launch { task1() }
  launch { task2() }
  println("called the two tasks")
}