class Pizza {
  infix fun spread(topping: String): Pizza { 
    println("spread $topping") 
    return this
  }
}

val pizza = Pizza()
//pizza.spread("Olives")
//pizza.spread("onions")

pizza spread "Olives" spread "onions"