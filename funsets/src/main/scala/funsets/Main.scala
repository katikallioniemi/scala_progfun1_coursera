package funsets

object Main extends App {
  import FunSets._
//  println(contains(singletonSet(1), 1))

 // printSet(singletonSet(3))

  val setti =
    union(
      union(
        singletonSet(1),
        singletonSet(2)),
      union(
        singletonSet(3),
        singletonSet(4)))

  printSet(setti)

  println(exists(setti, x => x==2))

  printSet(map(setti, v => v + 10))
}
