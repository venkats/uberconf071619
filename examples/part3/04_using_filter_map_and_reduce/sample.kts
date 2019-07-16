val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

println(
  numbers.filter { it % 2 == 0 }
         .map { it * 2 }
         .reduce { a, b -> a + b }
  )