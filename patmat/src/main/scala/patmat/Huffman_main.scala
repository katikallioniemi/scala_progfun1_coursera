package patmat

import common._
import Huffman._


object Huffman_main {

  def main(args: Array[String]) = {
    val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
    val t2 = Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9)


    // val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))

    // println(createCodeTree(string2Chars("Hello hello who are you")))
    //val seccret = List(1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1)
    //   println(decode(frenchCode, encode(frenchCode)(string2Chars("Hello who are you"))))


//    println(convert(frenchCode))
    println(quickEncode(frenchCode)(string2Chars("whoaaa")))

  }
}
