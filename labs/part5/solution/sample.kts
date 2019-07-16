import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

val urls = listOf("http://www.google.com", "http://www.yahoo.com", "http://www.bing.com")

fun getResponseSize(url: String) : Int = java.net.URL(url).readText().length

val timeSequential = measureTimeMillis {
  for(url in urls) {
    println("$url --- ${getResponseSize(url)}")
  }
}

println("Time taken for sequential run ${timeSequential} milliseconds")

val timeParallel = measureTimeMillis {
  runBlocking {
    withContext(Dispatchers.IO) {
      val responses = urls.map {
        async { "$it --- ${getResponseSize(it)}" }
      }

      responses.map { it.await() }
        .forEach(::println)
    }
  }
}

println("Time taken for sequential run ${timeParallel} milliseconds")
