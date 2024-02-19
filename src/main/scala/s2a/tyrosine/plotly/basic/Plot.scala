package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj, native}
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}


@native
trait Plot extends js.Object :
  val x: Arraj[Double] = native
  val y: Arraj[Double] = native
  val connectgaps: Optjon[Boolean] = native

object Plot :
  def apply(x: Arraj[Double], y: Arraj[Double], connectgaps: Optjon[Boolean] = nyet) =
    literal(x = x, y = y, connectgaps = connectgaps).asInstanceOf[Plot]

