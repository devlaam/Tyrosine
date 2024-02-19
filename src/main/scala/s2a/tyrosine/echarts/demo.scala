package s2a.tyrosine.echarts

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import org.scalajs.dom.document

import s2a.tyrosine.echarts.basic.*

/**
  var chartDom = document.getElementById('echarts');
  var myChart = echarts.init(chartDom);
  var option =
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
*/

object Demo :
  private val x  = Arraj("Mon","Tue","Wed","Thu","Fri","Sat","Sun")
  private val y1 = Arraj(350.0, 130, 224, 70, 135,  14, 200)
  private val y2 = Arraj(150.0, 230,  24, Double.NaN, 35, 147, 260)
  private val s1 = Serie("line",y1)
  private val s2 = Serie("line",y2)
  private val xa = Axis("category",x)
  private val ya = Axis("value")
  private val option = Option(xa,ya,Arraj(s1,s2))

  def firstPlot(root: String): Unit =
    val elem = document.querySelector(s"#$root")
    val chart = echarts.init(elem)
    chart.setOption(option)

