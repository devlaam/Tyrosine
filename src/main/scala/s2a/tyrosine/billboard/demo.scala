package s2a.tyrosine.billboard

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}

import s2a.tyrosine.billboard.basic.*


/**
  var bbchart = bb.generate({
  data:
  { columns:
    [ [ "data1", 30, 200, 100, 400, 150, 250],
      [ "data2", 50, 20, 10, 40, 15, 25] ],
    type: "line" },
  bindto: "#billboard" });
*/

object Demo :
  private val d1 = Arraj[Any]("data1", 30, 200, 100, 400, 150, 250)
  private val d2 = Arraj[Any]("data2", 50, 20, 10, 40, 15, 25)
  private val data = Data("line",Arraj(d1,d2))

  def firstPlot(root: String): Unit =
    val config = Config(s"#$root",data)
    bb.generate(config)

