package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{Axis => GAxis}

@native
trait Axis extends js.Object :
  val `type`: String         = native
  val title: Optjon[Title]   = native
  val visible: Boolean       = native
  val side: Optjon[String]   = native
  val anchor: String         = native

object Axis :
  def apply(
      `type`: String       = "linear",
      visible: Boolean     = true,
      title: Optjon[Title] = nyet,
      side: Optjon[String] = nyet
      ): Axis =
    literal(
      `type`  = `type`,
      visible = visible,
      title   = title,
      side    = side,
      anchor  = "free"
      ).asInstanceOf[Axis]

  def apply(axis: GAxis): Axis =
    val kind = axis.kind match
      case GAxis.Kind.Linear => "linear"
      case GAxis.Kind.Log    => "log"
    val side = axis.position match
      case GAxis.Position.Bottom  => "bottom"
      case GAxis.Position.Top     => "top"
      case GAxis.Position.Left    => "left"
      case GAxis.Position.Right   => "right"
    apply(
      `type`  = kind,
      visible = axis.show,
      title   = Title(axis.title),
      side    = side
      ).asInstanceOf[Axis]
