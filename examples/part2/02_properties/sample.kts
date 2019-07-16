class Car(val year: Int, var color: String, initialMiles: Int) {
  val miles = initialMiles
}

val car = Car(2019, "Blue", 0)
println(car.year)        
println(car.color)

car.color = "Red"
println(car.color);

//year is a read-only property (not a field)
//color is a read-write property

//initialMiles is not a property. It is a parameter to the constructor
//println(car.initialMiles) //ERROR

//miles is a public property

println(car.miles)