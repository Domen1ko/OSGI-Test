<h1><img src="http://enroute.osgi.org/img/enroute-logo-64.png" witdh=40px style="float:left;margin: 0 1em 1em 0;width:40px">
OSGi enRoute Archetype - Bundle Version Example</h1>

This project done by BndTools. If you want to get started with enRoute, then follow the steps in the [quick-start guide][1].

<h2>SPECIFICATION</h2>
This project show how is possibile work with different version of Adapter of same interface service.

In release we have 2 adapter bundle of single Anagrafe Api, the running one is anagrafe.adapter version 1.0.1.

<h2>HOW TO</h2>
1) Go into "it.quid.esa.business.bureau.application" and click on it.quid.esa.business.bureau.bndrun and click Resolve

2) Now click on Run OSGi

3) On browser : [Index][4]

4) Click on Try It! and see "@ version" number

5) Go in xray console: [console][5]

6) Now click on Install/update button and search it.quid.esa.integration.bureau.anagrafe.adapter into Relese of your workspace version: 1.0.0 and flag "start bundle", "update"

7) Click on reload (now the version of anagrafe.adapter should be changed) just go back and click Try It!

8) Now version it should changed!

[1]: http://enroute.osgi.org/quick-start.html
[2]: http://enroute.osgi.org/tutorial_base/800-ci.html
[3]: https://www.gradle.org/
[4]: http://localhost:8080/it.quid.esa.business.bureau/index.html#
[5]: http://localhost:8080/system/console/bundles


