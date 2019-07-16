fun guess(target: Int, attempts: Int = 0) {
  print("guess:")
  System.out.flush()

  val input = readLine()?.toInt() ?: 0
  
  when {
    input < target -> println("Aim high")
    input > target -> println("Aim low")
    input == target -> println("You got it in $attempts attempts!")
  }
  
  if(input != target) {
    guess(target, attempts + 1)
  }
}

println("I have selected a number between 0 and 99, can you guess it?")
guess(java.util.Random().nextInt(100))