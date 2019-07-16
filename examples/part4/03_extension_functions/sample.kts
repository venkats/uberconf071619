val greet = "hello"

fun String.shout() = toUpperCase() //they create a static function
//which takes String as its first parameter

println(greet)
println(greet.javaClass)

println(greet.shout()) //rewrite this as shout(greet)