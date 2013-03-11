package EasySample;
/**
* This class implements a binary tree node
* It's data field is of the type Object - which means it can store
* data of any type
*/
public class Node
{
   private Node left;
   private Node right;
   private Object data;
   /**
   * Node constructor which sets the fields
   */
   public Node(Node lf, Node rt, Object dt)
   {
     setLeft( lf );
     setRight( rt );
     setData( dt );
   }
   // Accessor and mutator methods
   public Node getLeft() { return this.left; }
   public Node getRight() { return this.right; }
   public Object getData() { return this.data; }
   public void setLeft(Node n) { this.left = n; }
   public void setRight(Node n) { this.right = n; }
   public void setData(Object d) { this.data = d; }
} 