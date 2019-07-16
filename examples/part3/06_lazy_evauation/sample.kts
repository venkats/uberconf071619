val numbers = listOf(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)

fun isEven(n: Int): Boolean {
  println("isEven called for $n")
  return n % 2 == 0
}

fun isGT(n: Int): Boolean {
  return n > 3
}

fun doubleIt(n: Int) = n * 2

println(
  numbers
    .asSequence()       //lazy evaluation
    .filter(::isEven)
    .filter(::isGT)
    .map(::doubleIt)
    .first())
    
    
    
    
    
    