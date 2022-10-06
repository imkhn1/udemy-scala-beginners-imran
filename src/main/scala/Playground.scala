package  playground

import java.io.Writer
import scala.annotation.tailrec

object Playground {

  def main(args: Array[String]): Unit = {
    print("hello")

    def aGreeting(name: String, age: Int): String = {
      "hi my name is " + name + " and I am " + age + " years old"
    }

    println(aGreeting("john", 8))

    def factorial(n: Int): Int = {
      if (n <= 0) 1
      else n * factorial(n - 1)
    }

    println(factorial(3))

    def fact(n: Int): Int = {
      if (n == 1) 1
      else n * fact(n - 1)
    }

    println(fact(4))

    /* factorial(4)
    if (4 == 0) 1 else 4 * factorial(4 - 1)
    4 * factorial(3)
    4 * (3 * factorial(2))
    4 * (3 * (2 * factorial(1)))
    4 * (3 * (2 * (1 * factorial(0)))
    4 * (3 * (2 * (1 * 1)))
    24
    */

    def joinWords(word: String, number: Int, acc: String): String = {
      if (number <= 0) acc
      else joinWords(word, number - 1, word + acc)
    }

    println(joinWords("hello ", 3, ""))

    def isPrime(n: Int): Boolean = {
      @tailrec
      def isPrimeUntil(t: Int): Boolean =
        if (t <= 1) true
        else n % t != 0 && isPrimeUntil(t - 1)

      isPrimeUntil(n / 2)
    }

    println(isPrime(37))

    /* def twoSum(nums: Array[Int], target: Int): Array[Int] = {
       Array(1,2,4)

    }

    println(twoSum(Array(2,3,4,9), 9))

   def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      for {
      x <- nums
        if x + x == target
        println(x)
      }

        println(twoSum((2,7,11,15), 9))
         test*/

    class Writer(first_name: String, surname: String, year: Int) {
      def full_name(fullname: String): Unit = println(s"full name is ${this.first_name} $surname")
    }
    val writer = new Writer("John", "Khan", 2003)
    writer.full_name("")
  
    class Novel(name: String, year_of_release: Int, author: String ) {
      def authorAge(Age: Int): Unit = println(s"")
      def isWrittenBy(author: String): Unit = println(s"author is $author")
      def copy(new_year_of_release: Int): Unit = println(s"")

    }
  }
}
