class SquareMatrix(val values: List<List<Int>>) {
  override fun toString(): String =
    values.map { row -> row.joinToString(" ") }.joinToString("\n")
    
  operator fun times(other: SquareMatrix): SquareMatrix {
    val products = 
      (0 until values.size).map { i ->
        (0 until values.size).map { j ->
          (0 until values.size).map { k ->
            values[i][k] * other.values[k][j]
          }.sum()
        }
      }
    
    return SquareMatrix(products)
  }
  
  init {
    if(values.size != values[0].size) throw RuntimeException("Matrix should be square")
  }
}

val matrix1 = SquareMatrix(listOf(
  listOf(1, 2, 3),
  listOf(4, 5, 6),
  listOf(7, 8, 9)))

val matrix2 = SquareMatrix(listOf(
  listOf(1, 1, 1),
  listOf(2, 2, 2),
  listOf(3, 3, 3)))
               
println("Matrix 1:")
println(matrix1)

println("Matrix 2:")
println(matrix2)

println("Product:")
println(matrix1 * matrix2)

/*
Matrix 1:
1 2 3
4 5 6
7 8 9
Matrix 2:
1 1 1
2 2 2
3 3 3
Product:
14 14 14
32 32 32
50 50 50
*/