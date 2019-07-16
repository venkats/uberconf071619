package com.agiledeveloper

class Counter(val value: Int) {
  operator fun inc() = Counter(value + 1)
  
  operator fun dec() = if(value > 0) Counter(value - 1) else this
  
  init {
    if(value < 0) throw RuntimeException("Invalid value")
  }
}