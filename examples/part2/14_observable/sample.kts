import kotlin.properties.Delegates.observable

var count: Int by observable(0) { name, old, new -> 
  println("$name $old $new")
}

println(count)

count = 1
println(count)

count = 2
println(count)