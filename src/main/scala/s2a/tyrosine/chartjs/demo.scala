package s2a.tyrosine.chartjs

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.JSConverters._
import org.scalajs.dom.{document, HTMLCanvasElement}

import s2a.tyrosine.chartjs.basic.*
import s2a.tyrosine.toUnit
import s2a.tyrosine.generic.basic.{Chart => GChart}

/**
  const xyValues =
  [ {x:50, y:7},
    {x:60, y:8},
    {x:70, y:8},
    {x:80, y:9},
    {x:90, y:9},
    {x:100, y:9},
    {x:110, y:10},
    {x:120, y:11},
    {x:130, y:14},
    {x:140, y:14},
    {x:150, y:15} ];

  new Chart('chartjs',
  { type: 'line',
    data:
    { datasets:
    [{  pointRadius: 4,
        pointBackgroundColor: 'rgb(0,0,255)',
        data: xyValues }] },
    options:
    { legend: {display: true},
      scales:
      { x:
        { type: 'linear',
          position: 'bottom' } } } });
*/


object Demo extends s2a.tyrosine.Demo :
  private def p(x: Double, y: Double): DataPoint = DataPoint(x,y)
  private val xyValues = Arraj(p(50,7),p(60,8),p(70,8),p(80,9),p(90,9),p(100,9),p(110,10),p(120,11),p(130,14),p(140,14),p(150,15))
  private val dataSet  = DataSet(pointRadius=4,pointBackgroundColor="rgb(0,0,255)",data=xyValues)
  private val legend   = Legend(display=true)
  private val xScale   = Scale(`type`="linear", position="bottom")
  private val yScale   = Scale(`type`="linear")
  private val scales   = Scales(x=xScale,y=yScale)
  private val options  = Options(legend=legend, scales=scales, plugins=Plugins(Title("Native/ChartJS")))
  private val config   = Config(`type`="line", data=Data(Arraj(dataSet)), options=options)

  private def createCanvas(parent: String): HTMLCanvasElement =
    val bareCanvas = document.createElement("canvas")
    val leafCanvas = document.querySelector(s"#$parent").appendChild(bareCanvas)
    leafCanvas.asInstanceOf[HTMLCanvasElement]


  def test(root: String): Unit = new Chart(createCanvas(root),config).toUnit

  def chart(root: String, chart: GChart): Unit =
    val datasets: Arraj[DataSet] = chart.series.map(DataSet(_)).toJSArray
    val legend  = Legend(display=true)
    val scales  = Scales(x=Scale(chart.xAxis),y=Scale(chart.yAxis))
    val plugins = Plugins(Title(chart.title + "/ChartJS"))
    val options = Options(legend=legend, scales=scales, plugins=plugins)
    val config  = Config(`type`="line", data=Data(datasets), options=options)
    new Chart(createCanvas(root),config).toUnit



