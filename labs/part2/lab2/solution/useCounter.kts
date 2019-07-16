import kotlin.properties.Delegates.vetoable

class Counter(initial: Int) {
  val value = initial
  
  operator fun inc() = Counter(value + 1)
  operator fun dec() = Counter(value - 1)
}
  
var counter by vetoable(Counter(3)) { _, old, new -> new.value > old.value }

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
