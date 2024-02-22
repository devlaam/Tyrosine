package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Plugins extends js.Object :
  val title: Optjon[Title] = native

object Plugins :
  def apply(title: Optjon[Title] = nyet): Plugins =
    literal(title=title).asInstanceOf[Plugins]
