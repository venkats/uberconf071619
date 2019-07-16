fun process(n: Int, action: (Int) -> Unit) {
  action(n * 2)
}

process(5, { value -> println(value) })