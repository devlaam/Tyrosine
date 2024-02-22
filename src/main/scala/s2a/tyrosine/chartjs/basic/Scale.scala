package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic
import s2a.tyrosine.generic.basic.{Axis => GAxis}
@native
trait Scale extends js.Object :
  val `type`: String           = native
  val position: Optjon[String] = native
  val title: Optjon[Title]     = native

object Scale :
  def apply(
      `type`: String,
      title: Optjon[Title]     = nyet,
      position: Optjon[String] = nyet
      ): Scale =
    literal(
      `type`   = `type`,
      title    = title,
      position = position
      ).asInstanceOf[Scale]

  def apply(axis: GAxis): Scale =
    val kind = axis.kind match
      case GAxis.Kind.Linear => "linear"
      case GAxis.Kind.Log    => "log"
    val position = axis.position match
      case GAxis.Position.Bottom  => "bottom"
      case GAxis.Position.Top     => "top"
      case GAxis.Position.Left    => "left"
      case GAxis.Position.Right   => "right"
    val title = Title(axis.title)
    apply(
      `type`   = kind,
      title    = title,
      position = position
      ).asInstanceOf[Scale]


