package s2a.tyrosine.apexcharts

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import org.scalajs.dom.{document}
import scala.scalajs.js.JSConverters._

import s2a.tyrosine.apexcharts.basic.*
import s2a.tyrosine.generic.basic.{Chart => GChart}

/**
  var options =
  { series:
    [ { name: 'Peter',
        data: [5, 5, 10, 8, 7, 5, 4, null, null, null, 10, 10, 7, 8, 6, 9] },
      { name: 'Johnny',
        data: [10, 15, null, 12, null, 10, 12, 15, null, null, 12, null, 14, null, null, null] } ],
    chart:
    { height: 350,
      type: 'line',
      zoom: { enabled: false },
      animations: { enabled: false } },
      stroke:
      { width: [5,5,4],
        curve: 'straight' },
      labels: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16] },
    title: { text: 'Missing data (null values)' } };
  var chart = new ApexCharts(document.querySelector("#apexchart"), options);
  chart.render();
*/

object Demo extends s2a.tyrosine.Demo :
  private val x  = Arraj[Double](1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
  private val y1 = Arraj[Double](5, 5, 10.0, 8.0, 7.0, 5.0, 4.0, Double.NaN, 0.0, 0.0, 10.0, 10.0, 7.0, 8.0, 6.0, 9.0)
  private val s1 = Serie(name="Jan",data=DataPoint.merge(x,y1))
  private val y2 = Arraj[Double](10, 15, 0, 12, 0, 10, 12, 15, Double.NaN, Double.NaN, 12, 0, 14, 0, 0, 0)
  private val s2 = Serie(name="Piet",data=DataPoint.merge(x,y2))
  private val zoom = Zoom(true)
  private val animations = Animations(false)
  private val title = Title("Native/ApexCharts")
  private val chart = Chart("line",zoom,animations)
  private val options = Options(title,Arraj(s1,s2),chart)

  def test(root: String): Unit =
    val elem = document.querySelector(s"#$root")
    new ApexCharts(elem,options).render()

  def chart(root: String, gchart: GChart): Unit =
    val elem = document.querySelector(s"#$root")
    val series = gchart.series.map(Serie(_)).toJSArray
    val title  = Title(gchart.title + "/ApexCharts")
    val chart  = Chart("line",zoom,Animations(false))
    val options = Options(title=title,series=series,chart=chart,xaxis=Xaxis(gchart.xAxis),yaxis=Yaxis(gchart.yAxis))
    new ApexCharts(elem,options).render()


