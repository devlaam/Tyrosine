package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}


@native
trait Layout extends js.Object :
  val height: Optjon[Double] = native
  val title: Optjon[String] = native
  val width: Optjon[Double] = native

object Layout :
  def apply(height: Int, width: Int, title: Optjon[String] = nyet): Layout =
    literal(width = width, height = height, title = title).asInstanceOf[Layout]
