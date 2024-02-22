package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{Axis => GAxis}

@native
trait Xaxis extends js.Object :
  val `type`: String           = native
  val title: Optjon[Title]     = native
  val position: Optjon[String] = native

object Xaxis :
  def apply(
      `type`: String           = "numeric",
      title: Optjon[Title]     = nyet,
      position: Optjon[String] = nyet
      ): Xaxis =
    literal(
      `type`   = `type`,
      title    = title,
      position = position,
      anchor   = "free"
      ).asInstanceOf[Xaxis]

  def apply(axis: GAxis): Xaxis =
    val position = axis.position match
      case GAxis.Position.Bottom  => "bottom"
      case GAxis.Position.Top     => "top"
      case GAxis.Position.Left    => nyet
      case GAxis.Position.Right   => nyet
    apply(title=Title(axis.title),position=position).asInstanceOf[Xaxis]
