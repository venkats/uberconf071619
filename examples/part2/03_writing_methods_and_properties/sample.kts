class Car(val year: Int, var color: String, initialMiles: Int) {
  var miles = initialMiles
    private set(value: Int) { field = value }
  
  fun drive(dist: Int) {
    println("driving $dist")
    miles += dist
  }
}

val car = Car(2019, "Blue", 0)
println(car.miles)
car.drive(10)
println(car.miles)

//car.miles = 20 //ERROR