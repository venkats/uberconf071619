//val greet : (String) -> String = { name -> "Hello $name" }
//
//println(greet("Jane"))

val greet : String.(String, Int) -> String = 
  { name, age -> "${this.toUpperCase()} $name you are $age today" }

//println(greet("Hello", "Jane", 2)) //this works
println("Hello".greet("Jane", 2))     
println("howdy".greet("Jane", 4))
println(1.greet("Jane", 6))