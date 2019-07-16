val names = listOf("Tom", "Jerry")

names.forEach({ name -> println(name) })
println("---------")

names.forEach({ println(it) }) //if only one parameter
println("---------")

names.forEach { println(it) }
println("---------")

names.forEach(::println)
println("---------")