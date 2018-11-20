package recfun

import recfun.Main.pascal

object printPascal{
  println("Pascal's Triangle")
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }
}
object Main {
  def main(args: Array[String]) {
    println(countChange(14, List(5, 2, 1)))
  }




  /**
   * Exercise 1
   */
  //c column, r row
  def pascal(c: Int, r: Int): Int = {
    if (c==0 || c==r) 1
    else pascal(c, r-1) + pascal(c-1, r-1)
  }
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def getBracketBalance(stuff: List[Char], currentBracketDepth: Int): Int = {
          if (currentBracketDepth < 0) -1 //if more ')' than '(' --> fail
          else {
            if (stuff.isEmpty) currentBracketDepth
            else {
              if (stuff.head == '(') getBracketBalance(stuff.tail, currentBracketDepth + 1)  //Opening parenthesis: +1
              else if (stuff.head == ')') getBracketBalance(stuff.tail, currentBracketDepth - 1) //Closing parenthesis: -1
              else getBracketBalance(stuff.tail, currentBracketDepth)
             }
            }
      }
      getBracketBalance(chars, 0) == 0
    }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0 || (money > 0 && coins.isEmpty))  0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
