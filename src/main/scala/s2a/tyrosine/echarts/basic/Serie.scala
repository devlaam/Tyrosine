package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal


import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic.basic.{DataSerie => GDataSerie}

@native
trait Serie extends js.Object :
  val `type`: String                             = native
  val data: Arraj[Double] | Arraj[Arraj[Double]] = native
  val name: Optjon[String]                       = native
  val lineStyle: Optjon[LineStyle]               = native
  val itemStyle: Optjon[ItemStyle]               = native
  val symbol: Optjon[String]                     = native
  val symbolSize: Optjon[Int]                    = native

object Serie :
  def apply(
      `type`: String,
      data: Arraj[Double] | Arraj[Arraj[Double]],
      name: Optjon[String]         = nyet,
      lineStyle: Optjon[LineStyle] = nyet,
      itemStyle: Optjon[ItemStyle] = nyet,
      symbol: Optjon[String]       = nyet,
      symbolSize: Optjon[Int]      = nyet
      ): Serie =
    literal(
      `type`     =`type`,
      data       = data,
      name       = name,
      lineStyle  = lineStyle,
      itemStyle  = itemStyle,
      symbol     = symbol,
      symbolSize = symbolSize
      ).asInstanceOf[Serie]

  def apply(serie: GDataSerie): Serie = apply(
    `type`     = "line",
    symbol     = "circle",
    symbolSize = 8,
    data       = serie.da,
    name       = serie.name,
    lineStyle  = LineStyle(color=serie.color),
    itemStyle  = ItemStyle(color=serie.color))


