package s2a.tyrosine.generic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}

import s2a.tyrosine.generic.basic.*


object Demo :
   import s2a.tyrosine.{Engine, apexcharts, billboard, chartjs, echarts, plotly}

   private val xVals = Arraj[Double](-1,0,1,2,3,4,5,6,7,8,9)
   private val yVal1 = Arraj[Double](7,2,14,4,5,9,12,0,4,27,13)
   private val yVal2 = Arraj[Double](16,12,4,12,3,14,11,11,6,19,18)
   private val ser1  = DataSerie("first",DataPoint.merge(xVals,yVal1),"#F00")
   private val ser2  = DataSerie("second",DataPoint.merge(xVals,yVal2),"#0F0")
   private val serN  = Seq(ser1,ser2)
   private val xAxis = Axis(Axis.Kind.Linear,Axis.Position.Bottom,"control")
   private val yAxis = Axis(Axis.Kind.Linear,Axis.Position.Left,"result")
   private val chart = Chart(serN,xAxis,yAxis,"Generic",true)

   def test(root: String, engine: Engine): Unit = engine match
     case Engine.ApexCharts => apexcharts.Demo.chart(root,chart)
     case Engine.BillBoard  => billboard.Demo.chart(root,chart)
     case Engine.ChartJS    => chartjs.Demo.chart(root,chart)
     case Engine.ECharts    => echarts.Demo.chart(root,chart)
     case Engine.Plotly     => plotly.Demo.chart(root,chart)
