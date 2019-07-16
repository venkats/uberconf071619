import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

val urls = listOf("http://www.google.com", "http://www.yahoo.com", "http://www.bing.com")

fun getResponseSize(url: String) : Int = java.net.URL(url).readText().length

val timeSequential = measureTimeMillis {
//your code goes here  
}

println("Time taken for sequential run ${timeSequential} milliseconds")

val timeParallel = measureTimeMillis {
//your code goes here
}

println("Time taken for sequential run ${timeParallel} milliseconds")
