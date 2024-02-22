package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{Axis => GAxis}

@native
trait Yaxis extends js.Object :
  val title: Optjon[Title] = native
  val show: Boolean        = native
  val showAlways: Boolean  = native
  val opposite: Boolean    = native
  val logaritmic: Boolean  = native

object Yaxis :
  def apply(
      show: Boolean            = true,
      showAlways: Boolean      = true,
      title: Optjon[Title]     = nyet,
      opposite: Boolean        = false,
      logaritmic: Boolean      = false
      ): Yaxis =
    literal(
      show       = show,
      showAlways = showAlways,
      title      = title,
      opposite   = opposite,
      logaritmic = logaritmic
      ).asInstanceOf[Yaxis]

  def apply(axis: GAxis): Yaxis =
    val logaritmic = axis.kind     == GAxis.Kind.Log
    val opposite   = axis.position == GAxis.Position.Right
    apply(
      show       = axis.show,
      title      = Title(axis.title),
      opposite   = opposite,
      logaritmic = logaritmic
      ).asInstanceOf[Yaxis]
