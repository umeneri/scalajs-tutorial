package tutorial.webapp

import org.querki.jquery._
import utest._

object TutorialTest extends TestSuite {
  TutorialApp.setupUI()

  def tests = Tests {
    'HelloWorld - {
      assert($("p:contains('Hello World')").length == 1)
    }

    'ButtonClick - {
      def messageCount = $("p:contains('You clicked the button!')").length

      val button = $("button:contains('Click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  }
}
