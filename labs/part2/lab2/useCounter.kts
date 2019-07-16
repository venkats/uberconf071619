//Let's make this code work to get the specified output

class Counter(initial: Int) {
  val value = initial
  
  operator fun inc() = Counter(value + 1)
  operator fun dec() = Counter(value - 1)
}
  
var counter //define here...

println(counter.value) //3

for(i in 1..2) {
  counter++
}

println(counter.value) //5

for(i in 1..5) {
  counter--
}

println(counter.value) //5

counter--
println(counter.value) //5

counter--
println(counter.value) //5
