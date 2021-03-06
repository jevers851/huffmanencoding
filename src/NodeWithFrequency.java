
//public interface Comparable<T>
//This interface imposes a total ordering on the objects of each class that implements it. This ordering is referred to 
//as the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.
//Lists (and arrays) of objects that implement this interface can be sorted automatically
//by Collections.sort (and Arrays.sort). Objects that implement this interface can be used as
//keys in a sorted map or as elements in a sorted set, without the need to specify a comparator.
//
//The natural ordering for a class C is said to be consistent with equals if and only if e1.compareTo(e2) == 0 has the same boolean value as e1.equals(e2) 
//for every e1 and e2 of class C. 
//Note that null is not an instance of any class, and e.compareTo(null) should throw a NullPointerException even though e.equals(null) returns false.

public class NodeWithFrequency implements Comparable<NodeWithFrequency>
	{
		public final Node node;
		public final int lowestSymbol;
		public final long frequency;
		
		public NodeWithFrequency(Node node, int lowSym, long freq)
		{
			this.node 			= node;
			this.lowestSymbol 	= lowSym;
			this.frequency 		= freq;
		}
		
		public int compareTo(NodeWithFrequency other)
		{
			if(frequency < other.frequency)
				return -1;
			else if(frequency > other.frequency)
				return 1;
			else if(lowestSymbol < other.lowestSymbol)
				return -1;
			else if(lowestSymbol < other.lowestSymbol)
				return -1;
			else
				return 0;
			
		}
	}