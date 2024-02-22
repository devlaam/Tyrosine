package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj, native}
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{DataSerie => GDataSerie}


@native
trait Plot extends js.Object :
  val x: Arraj[Double]             = native
  val y: Arraj[Double]             = native
  val connectgaps: Optjon[Boolean] = native
  val mode: Optjon[String]         = native
  val line: Optjon[Line]           = native
  val name: Optjon[String]         = native

object Plot :
  def apply(
      x: Arraj[Double],
      y: Arraj[Double],
      connectgaps: Optjon[Boolean] = nyet,
      mode: Optjon[String]         = nyet,
      line: Optjon[Line]           = nyet,
      name: Optjon[String]         = nyet
      ): Plot =
    literal(
      x           = x,
      y           = y,
      connectgaps = connectgaps,
      mode        = mode,
      line        = line,
      name        = name
      ).asInstanceOf[Plot]

  def apply(serie: GDataSerie): Plot = apply(
    x    = serie.xs,
    y    = serie.ys,
    line = Line(color=serie.color),
    name = serie.name)

