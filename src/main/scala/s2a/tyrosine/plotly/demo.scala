package s2a.tyrosine.plotly

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}

import s2a.tyrosine.plotly.basic.*


object Demo :
  private val layout = Layout(width = 800, height = 500, title = "First Plot")
  private val config = Config(displaylogo = false)
  private val xs1 = Arraj( 2.0,  3,  4,          5, 6,  7,  8, 9)
  private val ys1 = Arraj(12.0, 13, 10, Double.NaN, 7, 11, 16, 3)
  private val pl1 = Plot(x = xs1, y = ys1, connectgaps = false)
  private val xs2 = Arraj( 1.0,  2,          3,  4, 5, 6, 7, 8)
  private val ys2 = Arraj(16.0,  8, Double.NaN, 11, 2, 1, 4, 1)
  private val pl2 = Plot(x = xs2, y = ys2, connectgaps = true)

  def firstPlot(root: String): Unit = Plotly.newPlot(root,Arraj(pl1,pl2),layout,config)

