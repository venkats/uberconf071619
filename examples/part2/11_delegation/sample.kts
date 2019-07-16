interface Worker {
  fun work()
  fun takeVacation()
}

class Programmer : Worker {
  override fun work() { println("coding all day") }
  override fun takeVacation() { println("code at the beach") }
}

class Manager : Worker by Programmer() {
  override fun takeVacation() { println("all year long") }
}

val joe = Programmer()
joe.work()

val bob = Manager()
bob.work()
bob.takeVacation()