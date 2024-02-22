package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic
import s2a.tyrosine.generic.basic.{Axis => GAxis}

@native
trait Axis extends js.Object :
  val `type`: Optjon[String] = native
  val label: String          = native
  val show: Boolean          = native
  val tick: Tick             = native

object Axis :
  def apply(
      label: String,
      show: Boolean          = true,
      `type`: Optjon[String] = nyet
      ): Axis =
    literal(
      `type`  = `type`,
      label   = label,
      show    = show,
      tick    = Tick.default
      ).asInstanceOf[Axis]

  def apply(axis: GAxis): Axis =
    val `type` = if axis.kind == GAxis.Kind.Log then "log" else "indexed"
    apply(
      label  =  axis.title,
      show   =  axis.show,
      `type` = `type`
      ).asInstanceOf[Axis]
