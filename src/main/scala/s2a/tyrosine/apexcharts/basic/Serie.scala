package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{DataSerie => GDataSerie}

@native
trait Serie extends js.Object :
  val name: String           = native
  val data: Arraj[DataPoint] = native
  val color: Optjon[String]  = native

object Serie :
  def apply(
      name: String,
      data: Arraj[DataPoint],
      color: Optjon[String] = nyet
      ): Serie =
    literal(
      name  = name,
      data  = data,
      color = color
      ).asInstanceOf[Serie]

  def apply(serie: GDataSerie): Serie = apply(data=serie.points.map(DataPoint(_)),name=serie.name,color=serie.color)
