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

## Basic features
<TO BE COMPLETED>

### Getting started
<TO BE COMPLETED>

### Advanced features
<TO BE COMPLETED>

## Status
To explore what the possibilities are the best is to clone the repository:
```
$ git clone https://github.com/devlaam/Tyrosine
$ cd tryrosine
```
and run the demos first. In your project you may use
```
libraryDependencies += "com.sense2act" %% "tyrosine" % "<latest-version>"
```

### Demos
<TO BE COMPLETED>

#### Demo basic plotting
<TO BE COMPLETED>

## Future
This is a big project, and it will take some time before this will be usable in a production environment. Until
that time, you can have a look at: [scala-js-plotlyjs](https://github.com/openmole/scala-js-plotlyjs)
(facade for [plotly.js](https://github.com/plotly/plotly.js)) or [nspl](https://github.com/pityka/nspl)
(native Scala, also usable for the JVM) as examples for libraries that can plot directly using Scala.

At the moment we have support for five libraries. This is already a lot, other possible libraries are:
[EvilPlot](https://github.com/cibotech/evilplot),
[Nivo](https://github.com/plouc/nivo),
[Recharts](https://github.com/recharts/recharts) and
[Victory](https://github.com/FormidableLabs/victory). For these there are no plans yet, but who knows.

Feature requests are welcome if motivated, and of course, bug reports. Please do not send a PR without consultation.


