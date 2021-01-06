package com.sctele.demo.domain

object HelloWorld {

  override def toString: String = "demo_override_to_string"
  val final_value : String = "final_value"


  def main(args: Array[String]): Unit = {
    print("hello world!")
    var int_demo : Integer = 0
    var string_demo : String = "string_demo"
    string_demo = "String_demo_change"
    println(string_demo)
    println(final_value)

    def add_function(x: Int) = x + 1

    val f = (t : Int) => t + 1

    var a = Array.ofDim()

    var long_demo = 10l
    var list_dic = (1, "2", 3)
    for (item <- list_dic.productIterator ) {
      println(item)
    }

    var num_list = List(1,2,3,5)
    for (x <- num_list) {
        println("value : %s".format(x))
    }

    var item_ = for{
      a <- num_list
      if a > 0;
      if a < 5
    }yield a

    for (x <- item_) {
      println("item_num : %s".format(x+))
    }

    def add_demo(x: Int) = x + 1
    println(add_demo(1))

    var set_list = Set(1,2,3,6)
    for (t <- 0 to set_list.size) {
      println(t)
    }

  }





  class inside_class{

    def inside_on_class_def(): String ={
      return "inside_on_class_def"
    }

    private def inside_off_class_def(): String ={
      return "inside_off_class_def"
    }
  }



}
