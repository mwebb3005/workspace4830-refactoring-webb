package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   extractedMethod(nodes, p); 
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      return null;
   }

   // TODO: Your answer
   <T extends Items> void extractedMethod(List<T> obj, String p) {
	   	for (int i = 0; i < obj.size(); i++) {
	   		if (obj.contains(p))
				System.out.println(obj);
	   	}
   // }
}
   class Items {
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }

}
   	
   
class Node extends Items{
	
}

class Edge extends Items{

}
}