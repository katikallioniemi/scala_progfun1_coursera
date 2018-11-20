package forcomp

import forcomp.Anagrams._

object Main {

  def sentence(str: String): Sentence = str.split(" ").toList

  def main(args: Array[String]): Unit = {

   println(sentenceAnagrams(sentence("i love you")))

 //   println("sentenceOccurrences(sentence(\"I love you\"))"+ sentenceOccurrences(sentence("I love you")))

 //   println(subtract(sentenceOccurrences(List("Hello", "hello", "you")), sentenceOccurrences(List("you"))))


    class Occ(val terms: Map[Char, Int]) {
      def this(bindings: (Char, Int)*) = this(bindings.toMap withDefaultValue 0)
      def this(occList: List[(Char, Int)]) = this(occList.toMap)

      override def toString = {
        (for ((merkki, numero) <- terms.toList.sorted)
          yield merkki + "-->" + numero + ", ") mkString

      }

      def + (other: Occ) = new Occ((other.terms foldLeft terms) (adjust))

      def adjust(terms: Map[Char, Int], term: (Char, Int)): Map[Char, Int] = {
        val (character: Char, occurrence: Int) = term
        terms + (character -> (occurrence + terms(character)))
        }

      def - (other: Occ) = new Occ((other.terms foldLeft terms) (readjust))

      def readjust(terms: Map[Char, Int], term: (Char, Int)): Map[Char, Int] = {
        val (character: Char, occurrence: Int) = term

        if (terms(character) - occurrence > 0) terms + (character -> (terms(character) - occurrence))
        else terms - character


      }

      }


    val wut = new Occ(sentenceOccurrences(List("Hello", "who", "are", "you")))
    val who = new Occ(sentenceOccurrences(List("who")))

//   println (wut - who)

//printAnagrams("late")


  }
  def printAnagrams(word: Word): Unit = {
    println("your word: " + word + ": anagrams: " + wordAnagrams(word).toString())
  }
}
