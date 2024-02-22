package s2a.tyrosine.plotly

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.JSConverters._

import s2a.tyrosine.plotly.basic.*
import s2a.tyrosine.generic.basic.{Chart => GChart}

/**
var trace1 =
{ x: [1, 2, 3, 4, 5, 6, 7, 8],
  y: [10, 15, null, 17, 14, 12, 10, null, 15],
  mode: 'lines+markers',
  connectgaps: true };

var trace2 =
{ x: [1, 2, 3, 4, 5, 6, 7, 8],
  y: [16, null, 13, 10, 8, null, 11, 12],
  mode: 'lines',
  connectgaps: true };

var data = [trace1, trace2];

var layout =
{ title: 'Connect the Gaps Between Data',
  showlegend: false };

Plotly.newPlot('myDiv', data, layout);
**/

object Demo extends s2a.tyrosine.Demo :
  private val layout = Layout(title = "Native/Plotly")
  private val config = Config(displaylogo = false)
  private val xs1 = Arraj( 2.0,  3,  4,          5, 6,  7,  8, 9)
  private val ys1 = Arraj(12.0, 13, 10, Double.NaN, 7, 11, 16, 3)
  private val pl1 = Plot(x = xs1, y = ys1, connectgaps = false)
  private val xs2 = Arraj( 1.0,  2,          3,  4, 5, 6, 7, 8)
  private val ys2 = Arraj(16.0,  8, Double.NaN, 11, 2, 1, 4, 1)
  private val pl2 = Plot(x = xs2, y = ys2, connectgaps = true)

  def test(root: String): Unit = Plotly.newPlot(root,Arraj(pl1,pl2),layout,config)

  def chart(root: String, chart: GChart): Unit =
    val layout = Layout(title = chart.title + "/Plotly",xaxis=Axis(chart.xAxis),yaxis=Axis(chart.yAxis))
    val config = Config(displaylogo = false)
    val plots  = chart.series.map(Plot(_)).toJSArray
    Plotly.newPlot(root,plots,layout,config)


