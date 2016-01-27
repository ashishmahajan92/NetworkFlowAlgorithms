package tcss543;
import graph.*;
import graphGenerate.*;
import algorithms.*;
import residualgraph.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        SimpleGraph g = new SimpleGraph();
        GraphInput graphInput = new GraphInput();
        graphInput.LoadSimpleGraph(g);
        long startTime = 0;
        
        startTime = System.currentTimeMillis();
        double preFlowMaxFlow = PreflowPush.PreflowPush(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("1st Preflow Push: MaxFlow = "+preFlowMaxFlow);
        
        
        startTime = System.currentTimeMillis();
        preFlowMaxFlow = PreflowPush.PreflowPush(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("2nd Preflow Push: MaxFlow = "+preFlowMaxFlow);
        
        startTime = System.currentTimeMillis();
        preFlowMaxFlow = PreflowPush.PreflowPush(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("3rd Preflow Push: MaxFlow = "+preFlowMaxFlow);
        
        startTime = System.currentTimeMillis();
        preFlowMaxFlow = PreflowPush.PreflowPush(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("4th Preflow Push: MaxFlow = "+preFlowMaxFlow);
        
        startTime = System.currentTimeMillis();
        preFlowMaxFlow = PreflowPush.PreflowPush(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("5th Preflow Push: MaxFlow = "+preFlowMaxFlow);
        
        

        ScalingFordFulkerson sf = new ScalingFordFulkerson();
        startTime = System.currentTimeMillis();
        double scalingFFMaxFlow = sf.ScalingFordFulkerson(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("1t Scaling Ford Fulkerson Push: MaxFlow = "+scalingFFMaxFlow);
        
        startTime = System.currentTimeMillis();
        sf = new ScalingFordFulkerson();
        scalingFFMaxFlow = sf.ScalingFordFulkerson(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("2nd Scaling Ford Fulkerson Push: MaxFlow = "+scalingFFMaxFlow);
        
        startTime = System.currentTimeMillis();
        sf = new ScalingFordFulkerson();
        scalingFFMaxFlow = sf.ScalingFordFulkerson(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("3rd Scaling Ford Fulkerson Push: MaxFlow = "+scalingFFMaxFlow);
        
        
        startTime = System.currentTimeMillis();
        double FFMaxFlow = FordFulkerson.FordFulkerson(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("1st Ford Fulkerson: MaxFlow = "+FFMaxFlow);
        
        startTime = System.currentTimeMillis();
        FFMaxFlow = FordFulkerson.FordFulkerson(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("2nd Ford Fulkerson: MaxFlow = "+FFMaxFlow);
        
        startTime = System.currentTimeMillis();
        FFMaxFlow = FordFulkerson.FordFulkerson(g);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("3rd Ford Fulkerson: MaxFlow = "+FFMaxFlow);
	}

}
