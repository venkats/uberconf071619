open class Person(val name: String) {
  fun play() { println("playing") }
  override fun toString() = name
}

class CoolPerson(name: String, val index: Int) : Person(name) {
//  /* override */ fun play() { println("cool person playing") } //ERROR, base play not open
  override fun toString() = "${super.toString()} -- ${index}"
}

val jake = Person("Jake")
val alan = CoolPerson("Alan", 10)
                       
println(jake)
println(alan)
alan.play()