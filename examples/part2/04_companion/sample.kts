class Car {
  fun another() { println("another called...") }
  companion object {
    fun only() { println("only called...") }
  }
}

Car.only()
//Car.another() //ERROR

val car = Car()
car.another()
//car.only() //ERROR

//a companion is a singleton object
//that are attached to a class
//these hold class level methods while the class holds
//instance level methods.