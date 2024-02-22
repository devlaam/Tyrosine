package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Axes extends js.Object :
  val rotated: Boolean = native
  val x: Optjon[Axis]  = native
  val y: Optjon[Axis]  = native
  val y2: Optjon[Axis] = native

object Axes :
  def apply(
      rotated: Boolean = false,
      x: Optjon[Axis]  = nyet,
      y: Optjon[Axis]  = nyet,
      y2: Optjon[Axis] = nyet
      ): Axes =
    literal(
      rotated = rotated,
      x       = x,
      y       = y,
      y2      = y2
      ).asInstanceOf[Axes]
