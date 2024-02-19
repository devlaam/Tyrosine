package s2a.tyrosine.apexcharts

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import org.scalajs.dom.{document}

import s2a.tyrosine.apexcharts.basic.*

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
      labels: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16],
      title: { text: 'Missing data (null values)' } };
  var chart = new ApexCharts(document.querySelector("#apexchart"), options);
  chart.render();
*/

object Demo :
  private val d1 = Arraj(5.0, 5, 10.0, 8.0, 7.0, 5.0, 4.0, null, 0.0, 0.0, 10.0, 10.0, 7.0, 8.0, 6.0, 9.0)
  private val s1 = Serie("Jan",d1)
  private val d2 = Arraj(10.0, 15, 0, 12, 0, 10, 12, 15, null, null, 12, 0, 14, 0, 0, 0)
  private val s2 = Serie("Piet",d2)
  private val zoom = Zoom(true)
  private val animations = Animations(false)
  private val stroke = Stroke(Arraj(5,2,2),"Straight")
  private val labels = Arraj(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
  private val title = Title("ApexCharts Demo")
  private val chart = Chart(350,"line",zoom,animations,stroke,labels,title)
  private val options = Options(Arraj(s1,s2),chart)

  def firstPlot(root: String): Unit =
    val elem = document.querySelector(s"#$root")
    new ApexCharts(elem,options).render()


