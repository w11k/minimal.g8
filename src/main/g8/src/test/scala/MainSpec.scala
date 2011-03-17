package $organization$

import java.io._
import org.specs2._

/**
  * Specification for Runner for $name$.
  */
class MainSpec extends Specification { def is =

  "This is a specification to check that Main prints correctly to System.out:" ^
                                                                               p^
  "Calling Main.main (with any arguments) should"                              ^
    "print 'Welcome to $name$!\n' to System.out"                               ! printWelcome

  def printWelcome = {
    val oldOut = System.out
    try {
      val bytes = new ByteArrayOutputStream
      System.setOut(new PrintStream(bytes))
      Main.main(null)
      bytes.toString must_== "Welcome to $name$!\n"
    } finally {
      System.setOut(oldOut)
    }
  }
}
