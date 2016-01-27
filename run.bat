@echo off
cd src
javac algorithms\FordFulkerson.java
javac algorithms\PreflowPush.java
javac algorithms\ScalingFordFulkerson.java

javac algorithms\Edge.java
javac algorithms\GraphInput.java
javac algorithms\InputLib.java
javac algorithms\KeyboardReader.java
javac algorithms\SimpleGraph.java
javac algorithms\Vertex.java

javac graphGenerate\BipartiteGraph.java
javac graphGenerate\FixedDegreeGenerator.java
javac graphGenerate\GraphGenerate.java
javac graphGenerate\MeshGenerator.java
javac graphGenerate\RandomGenerator.java

javac residualgraph\ResidualEdge.java
javac residualgraph\ResidualGraph.java
javac residualgraph\ResidualVertex.java

javac tcss543\tcss543.java