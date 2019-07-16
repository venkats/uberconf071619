val fruits = listOf("apple", "orange")

println(fruits)

println(fruits + "banana")
                           
//Kotlin compiler transforms the above code to the following:
println(fruits.plus("banana"))

