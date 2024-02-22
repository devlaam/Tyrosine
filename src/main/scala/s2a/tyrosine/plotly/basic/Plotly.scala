package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj, native}
import scala.scalajs.js.annotation.JSGlobal

import s2a.tyrosine.{Optjon, nyet}


@native
@JSGlobal
object Plotly extends js.Object :
  def newPlot(
    graphDiv: String,
    plotData: Arraj[Plot],
    layout: Optjon[Layout] = nyet,
    config: Optjon[Config] = nyet
    ): Unit = native
