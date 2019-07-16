fun process(input: Any) = when(input) {
  1 -> "got one"
  in 13..19 -> "got a teen"
  is String -> "got a string of length ${input.length}" //we even used smart cast
  else -> "whatever"
}

println(process(1))
println(process(14))
println(process("hello"))

