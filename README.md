
# Scala and Lucene example

How to use Scala and Lucene to create a basic search application. One of the powerful benefits of Scala is that it has full access to any Java libraries; giving you a tremendous number of available resources and technology. This example doesn't tap into the full power of Lucene, but highlights how easy it is to incorporate Java libraries into a Scala project.

This example is based off a Twitter analysis app I've been noodling on; which I am utilizing Lucene. The code below takes a list of tweets from a text file; creates an index and then you can search and extract info from.

# Run Example

This application assumes you already have scala and sbt setup. My setup was built with scala 2.8.1, sbt 0.7.7 and Lucene 3.2.0 but I don't see why any version wouldn't work.

If you aren't interested in using sbt, you can browse the source and see how it's all done.

If you aren't interested in scala, well then you're in the wrong spot.

```
  $ sbt

	// create index
  > run index

	// see popular terms
	> run terms
	
	// perform search
	> run query plat 
```
