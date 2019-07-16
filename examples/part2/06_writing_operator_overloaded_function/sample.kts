class Complex(val real: Int, val img: Int) {
  operator fun plus(other: Complex): Complex {
    println("called...with $other")
    return this //not the right implement, but...
  }
}
  
val c1 = Complex(1, 2)
val c2 = Complex(1, 3)

println(c1 + c2)