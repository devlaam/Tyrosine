package s2a.tyrosine.chartjs

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}

import s2a.tyrosine.chartjs.basic.*
import s2a.tyrosine.toUnit

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


object Demo :
  private def p(x: Double, y: Double): DataPoint = DataPoint(x,y)
  private val xyValues = Arraj(p(50,7),p(60,8),p(70,8),p(80,9),p(90,9),p(100,9),p(110,10),p(120,11),p(130,14),p(140,14),p(150,15))
  private val dataSet = DataSet(pointRadius=4,pointBackgroundColor="rgb(0,0,255)",data=xyValues)
  private val legend = Legend(display=true)
  private val xScale = Scale(`type`="linear", position="bottom")
  private val scales = Scales(x=xScale)
  private val options = Options(legend=legend, scales=scales)
  private val config = Config(`type`="line", data=Data(Arraj(dataSet)), options=options)

  def firstPlot(root: String): Unit = new Chart(root,config).toUnit
