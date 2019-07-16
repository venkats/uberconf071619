fun nickName(name: String): String? {
  if(name == "Robert")
    return "Bob"
  
  return null
}
           
fun use(name: String) {
  val result = nickName(name)
  val len = result?.length ?: 0 //Elvis gives value or a default
  //len is of type Int
  println("For $name, nick name is $result of length ${len}")
}

use("Robert")
use("Venkat")