interface Worker {
  fun work()
  fun takeVacation()
}

class Programmer : Worker {
  override fun work() { println("coding all day") }
  override fun takeVacation() { println("code at the beach") }
}

class Tester : Worker {
  override fun work() { println("break that code") }
  override fun takeVacation() { println("thinking of breaking...") }
}


class Manager(val victim: Worker) : Worker by victim {
  override fun takeVacation() { println("all year long") }
}

val bob = Manager(Tester())
bob.work()
bob.takeVacation()

val sara = Manager(Programmer())
sara.work()
sara.takeVacation()