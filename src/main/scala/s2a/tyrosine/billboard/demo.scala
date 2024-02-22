package s2a.tyrosine.billboard

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}

import s2a.tyrosine.billboard.basic.*
import s2a.tyrosine.generic.basic.{Chart => GChart}


/**
  var bbchart = bb.generate({
  data:
  { columns:
    [ [ "data1", 30, 200, 100, 400, 150, 250],
      [ "data2", 50, 20, 10, 40, 15, 25] ],
    type: "line" },
  bindto: "#billboard" });
*/

object Demo extends s2a.tyrosine.Demo :
  private val d1 = Arraj[Any]("data1", 30, 200, 100, 400, 150, 250)
  private val d2 = Arraj[Any]("data2", 50, 20, 10, 40, 15, 25)
  private val data = Data("line",Arraj(d1,d2))
  private val title = Title("Native/BillBoard")

  def test(root: String): Unit =
    val chart = Chart(s"#$root",data,title)
    bb.generate(chart)

  def chart(root: String, gchart: GChart): Unit =
    val title = Title(gchart.title + "/BillBoard")
    val data  = Data(gchart.series)
    val axes  = Axes(x=Axis(gchart.xAxis),y=Axis(gchart.yAxis))
    val chart = Chart(s"#$root",data,title,axes)
    bb.generate(chart)

