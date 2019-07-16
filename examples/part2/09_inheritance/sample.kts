open class Person(val name: String) {
  override fun toString() = name
}

class CoolPerson(name: String, val index: Int) : Person(name) {
  override fun toString() = "${super.toString()} -- ${index}"
}

val jake = Person("Jake")
val alan = CoolPerson("Alan", 10)
                       
println(jake)
println(alan)