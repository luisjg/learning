package main

import "fmt"

func main() {

  // another way to declare `var a string = "initial"`
  var a = "initial"
  fmt.Println(a)

  var b, c int = 1, 2
  fmt.Println(b, c)

  var d = true
  fmt.Println(d)

  var e int
  fmt.Println(e)

  // this is shorthand for `var f string = "apple"`
  f := "apple"
  fmt.Println(f)
}
