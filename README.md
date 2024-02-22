# Tyrosine

Tyrosine is a charting library for [Scala JS](https://www.scala-js.org), where the primary
target is the browser for now. The plotting itself is done making use of one of the popular
and mature [JavaScript](https://www.w3schools.com/js/) libraries:
[apexcharts.js](https://github.com/apexcharts/apexcharts.js),
[billboard.js](https://github.com/naver/billboard.js),
[chart.js](https://github.com/chartjs/Chart.js),
[ECharts](https://github.com/apache/echarts) and
[plotly.js](https://github.com/plotly/plotly.js).
You are able to switch between the libraries with little effort.

## Motivation
Some time ago I made the choice to use [nvd3](https://github.com/novus/nvd3) for charting in
one of my projects. The project was already stalled at that time, but i did not notice it.
The underlying library evolved further and after a few years, I could not solve the bugs anymore.

This project is an attempt to solve the problem in a generic way. Making use of an abstraction
layer it is possible to choose one (or more) of the currently existing and popular
charting libraries as engine. If one of the projects should stall, or change its license,
you should be able to switch easily.

## Status
At the moment, this project is in its infancy, so there has not yet been a release of the
library yet. This is just a proof of concept; expect that everything will change.
To explore what the possibilities are it is best to clone the repository:
```
$ git clone https://github.com/devlaam/Tyrosine
$ cd tyrosine
$ sbt fastLinkJS
```
which will produce the "main.js". Subsequently point your web server to the directory "tyrosine"
and load the main page: "index.html" in the browser. This should bring up 10 graphs. The top
five are generated from a generic structure:
```scala
val xVals = Arraj[Double](-1,0,1,2,3,4,5,6,7,8,9)
val yVal1 = Arraj[Double](7,2,14,4,5,9,12,0,4,27,13)
val yVal2 = Arraj[Double](16,12,4,12,3,14,11,11,6,19,18)
val ser1  = DataSerie("first",DataPoint.merge(xVals,yVal1),"#F00")
val ser2  = DataSerie("second",DataPoint.merge(xVals,yVal2),"#0F0")
val serN  = Seq(ser1,ser2)
val xAxis = Axis(Axis.Kind.Linear,Axis.Position.Bottom,"control")
val yAxis = Axis(Axis.Kind.Linear,Axis.Position.Left,"result")
val chart = Chart(serN,xAxis,yAxis,"Generic",true)

def test(root: String, engine: Engine): Unit = engine match
  case Engine.ApexCharts => apexcharts.Demo.chart(root,chart)
  case Engine.BillBoard  => billboard.Demo.chart(root,chart)
  case Engine.ChartJS    => chartjs.Demo.chart(root,chart)
  case Engine.ECharts    => echarts.Demo.chart(root,chart)
  case Engine.Plotly     => plotly.Demo.chart(root,chart)


```
whereas the bottom five are directly programmed to each facade.


## Future
This may become a big project and it will take some time before this will be usable in a production
environment. Until that time, you can have a look at: [scala-js-plotlyjs](https://github.com/openmole/scala-js-plotlyjs)
(facade for [plotly.js](https://github.com/plotly/plotly.js)) or [nspl](https://github.com/pityka/nspl)
(native Scala, also usable for the JVM) as examples for libraries that can plot directly using Scala.

At the moment we have support for five libraries. This is already a lot, other possible libraries are:
[EvilPlot](https://github.com/cibotech/evilplot),
[Nivo](https://github.com/plouc/nivo),
[Recharts](https://github.com/recharts/recharts) and
[Victory](https://github.com/FormidableLabs/victory). For these there are no plans yet, but who knows.

Feature requests are welcome if motivated, and of course, bug reports. Please do not send a PR without consultation.


