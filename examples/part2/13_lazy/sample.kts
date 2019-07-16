fun compute(n: Int): Int {
  println("called...")
  return n * 2
}

val x = 4    //4 to 14
val temp by lazy { compute(x) }

if(x > 5 && temp > 7)
  println("Path 1 with ${temp}")
else
  println("Path 2")