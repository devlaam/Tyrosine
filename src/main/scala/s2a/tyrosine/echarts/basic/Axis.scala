package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{Axis => GAxis}

@native
trait Axis extends js.Object :
  val `type`: String              = native
  val data: Optjon[Arraj[String]] = native
  val name: Optjon[String]        = native
  val position: Optjon[String]    = native


object Axis :
  def apply(
      `type`: String,
      name: Optjon[String]         = nyet,
      data: Optjon[Arraj[String]]  = nyet,
      position: Optjon[String]     = nyet
      ): Axis =
    literal(
      `type`   = `type`,
      name     = name,
      data     = data,
      position = position
      ).asInstanceOf[Axis]

  def apply(axis: GAxis): Axis =
    val position = axis.position match
      case GAxis.Position.Bottom  => "bottom"
      case GAxis.Position.Top     => "top"
      case GAxis.Position.Left    => "left"
      case GAxis.Position.Right   => "right"
    apply(
      `type`   = "value",
      name     = axis.title,
      position = position
      ).asInstanceOf[Axis]
