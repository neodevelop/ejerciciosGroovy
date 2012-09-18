
def fizzBuzz(n){
  if (!(n % 3) && !(n % 5)) {
    "fizz buzz"
  }else if (!(n % 3 )) {
    "fizz"
  }else if (!(n % 5)) {
    "buzz"
  }else{
    n
  }
}

(1..100).each{
  println fizzBuzz(it)
}
