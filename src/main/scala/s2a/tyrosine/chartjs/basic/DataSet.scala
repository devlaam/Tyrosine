package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{DataSerie => GDataSerie}

@native
trait DataSet extends js.Object :
  val label: Optjon[String]                = native
  val data: Arraj[DataPoint]               = native
  val borderColor: Optjon[String]          = native
  val pointRadius: Optjon[Int]             = native
  val pointBackgroundColor: Optjon[String] = native

object DataSet :
  def apply(
      data: Arraj[DataPoint],
      label: Optjon[String]                = nyet,
      borderColor: Optjon[String]          = nyet,
      pointRadius: Optjon[Int]             = nyet,
      pointBackgroundColor: Optjon[String] = nyet
      ): DataSet =
    literal(
      data                 = data,
      label                = label,
      borderColor          = borderColor,
      pointRadius          = pointRadius,
      pointBackgroundColor = pointBackgroundColor
      ).asInstanceOf[DataSet]

  def apply(serie: GDataSerie): DataSet = apply(
    data        = serie.points.map(DataPoint(_)),
    label       = serie.name,
    borderColor = serie.color)

