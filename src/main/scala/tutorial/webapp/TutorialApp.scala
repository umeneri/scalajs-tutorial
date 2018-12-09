package tutorial.webapp

import org.querki.jquery._
import org.scalajs.dom
import org.scalajs.dom.document

object TutorialApp {
  def main(args: Array[String]): Unit = {
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    $("body").append("<p>Hello World!!</p>")
    val buttonString = """<button id="click-me-button" type="button">Click me!</button>"""
    $(buttonString)
      .click(() => addClickedMessage())
      .appendTo($("body"))
  }

  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
}
