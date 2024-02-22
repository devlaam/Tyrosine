package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Chart extends js.Object :
  val bindto: String       = native
  val data: Data           = native
  val title: Optjon[Title] = native
  val axis: Optjon[Axes]   = native

object Chart :
  def apply(
      bindto: String,
      data: Data,
      title: Optjon[Title] = nyet,
      axis: Optjon[Axes]   = nyet
      ): Chart =
    literal(
      bindto = bindto,
      data   = data,
      title  = title,
      axis   = axis
      ).asInstanceOf[Chart]

