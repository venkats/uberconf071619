package com.agiledeveloper

fun main() {
  var counter = Counter(3)
  
  println(counter.value) //3

  for(i in 1..3) {
    counter++
  }

  println(counter.value) //6

  for(i in 1..5) {
    counter--
  }

  println(counter.value) //1

  counter--
  counter--

  println(counter.value) //0

  try {
    Counter(-1)
  } catch(ex: RuntimeException) {
    println(ex) //java.lang.RuntimeException: Invalid value
  }
}