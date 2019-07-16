data class Book(val year: Int)

val book1 = Book(2019)
val book2 = Book(2019)
val book3 = Book(2020)

println(book1 == book2) // == in Kotlin ===> .equals in Java
println(book1 == book3)

println(book1)
println(book2)
println(book3)