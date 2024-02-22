package s2a.tyrosine.echarts

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import org.scalajs.dom.document
import scala.scalajs.js.JSConverters._

import s2a.tyrosine.echarts.basic.*
import s2a.tyrosine.generic.basic.{Chart => GChart}

/**
  var chartDom = document.getElementById('echarts');
  var myChart = echarts.init(chartDom);
  var option1 =
  { xAxis:
    { type: 'category',
      data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'] },
    yAxis:
    { type: 'value' },
    series:
    [ { data: [350, 130, 224, 70, 135, 14,  200],
        type: 'line' },
      { data: [150, 230,  24, NaN, 35, 147, 260],
        type: 'line' } ] };
  myChart.setOption(option);

  var option2 =
  { xAxis: {},
    yAxis: {},
    series:
    [ { data: [[10, 40],[50, 100],[40, 20]],
        type: 'line' } ] };
*/

object Demo extends s2a.tyrosine.Demo :
  //private val xStr  = Arraj("Mon","Tue","Wed","Thu","Fri","Sat","Sun")
  private val xNum  = Arraj(10.0,20,30,40,50,60,70)
  private val y1 = Arraj(350.0, 130, 224, 70, 135,  14, 200)
  private val y2 = Arraj(150.0, 230,  24, Double.NaN, 35, 147, 260)
  private val p1: Arraj[Arraj[Double]] = (xNum zip y1).map((x,y) => Arraj(x,y))
  private val p2: Arraj[Arraj[Double]] = (xNum zip y2).map((x,y) => Arraj(x,y))
  //private val s11 = Serie("line",y1)
  //private val s21 = Serie("line",y2)
  private val s12 = Serie("line",p1)
  private val s22 = Serie("line",p2)
  //private val option1 = Option(Arraj(s11,s21),Axis("category",data=xStr),Axis("value"))
  val title  = Title("Native/ECharts")
  private val option2 = Option(Arraj(s12,s22),Axis("value"),Axis("value"),title)

  def test(root: String): Unit =
    val elem = document.querySelector(s"#$root")
    val chart = echarts.init(elem)
    chart.setOption(option2)

  def chart(root: String, chart: GChart): Unit =
    val elem   = document.querySelector(s"#$root")
    val series = chart.series.map(Serie(_)).toJSArray
    val title  = Title(chart.title + "/ECharts")
    val option = Option(series=series,xAxis=Axis(chart.xAxis),yAxis=Axis(chart.yAxis),title=title, legend=Legend())
    echarts.init(elem).setOption(option)


