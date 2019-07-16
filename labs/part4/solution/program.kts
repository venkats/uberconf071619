object Truck {
  val left = "left"  
  val straight = "straight"
  val right = "right"
  
  val result = StringBuilder("Truck ")
  
  infix fun operate(func: Truck.(Truck) -> Unit) {
    Truck.func(Truck)
    println(result)
  }
  
  infix fun turns(dir: String) {
    result.append("turned $dir ")
  }

  infix fun drives(where: String) {
    result.append("went $where ")
  }
}

Truck operate {
  it turns left
  it drives straight
  it turns right
}
