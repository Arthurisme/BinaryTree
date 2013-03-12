package EasySample;

import java.util.ArrayList;
import java.util.Scanner;




 
/**
* This class demonstrates use of a binary tree to store names
*/
public class BinaryTreeExample  
{
	
	  Node root;
	
	
	public BinaryTreeExample() {
		
	    root = null;
		
	}
   
  

	 public BinaryTreeExample( Object rootItem )
	    {
	        root = new Node (  null, null,rootItem );
	    }
   
   /**
   * Detect and act on Button presses
   *
   * @param the event that caused the method to be called
   */
  
   /**
   * Creates a new data Node and calls insertNode to actually put
   * it in the tree
   *
   * @param the data to be added
   */
   public void addNode( String data )
   {
     // creates a new node to add
     Node temp = new Node(null, null, data);
    if ( root == null )
     {
       System.out.append("Starting new tree\n");
       root = temp;
     }
     else
     {
       // call recursive routine to insert node
       insertNode( root, temp );
     }
   }
   
    
   /**
   * insert a node into the tree at the correct position
   *
   * @param n - the current point of the tree being examined
   * @param temp - the Node to be added
   */
   public void insertNode(Node n, Node temp)
   {
     // get the data entries of the nodes,
     // the (String) is a cast - it converts type Object to type String
     String ns = (String) n.getData();
     String ts = (String) temp.getData();

    // compare the data elements
     if (ts.compareTo(ns) > 0)
     {
       // test add at right
       System.out.append("Testing right of " + ns + "\n");
       if (n.getRight() == null)
       {
         // found a space to put this node
         n.setRight(temp);
       }
       else
       {
         // try again at the next one down
         insertNode( n.getRight(), temp);
       }
     }
     else
     {
       // test add at left
       System.out.append("Testing left of " + ns + "\n");
       if (n.getLeft() == null)
       {
         n.setLeft(temp);
       }
       else
       {
         insertNode( n.getLeft(), temp);
       }
     }
   }
  /**
   * We can display the tree in various ways
   *
   * @param e - the Button that triggered the display request
   */
  
   /**
   * Inorder traversal of the tree
   *
   * @param n - the currently processed Node
   */
   public void displayTreeInOrder(Node n)
   {
     if (n != null)
     {
       displayTreeInOrder(n.getLeft());
       System.out.append((String) n.getData() + "\n");
       displayTreeInOrder(n.getRight());
     }
   }
   /**
   * Postorder traversal of the tree
   *
   * @param n - the currently processed Node
   */
   public void displayTreePostOrder(Node n)
   {
     if (n != null)
     {
       displayTreePostOrder(n.getLeft());
       displayTreePostOrder(n.getRight());
       System.out.append((String) n.getData() + "\n");
     }
   }
   /**
   * Preorder traversal of the tree
   *
   * @param n - the currently processed Node
   */
   public void displayTreePreOrder(Node n)
   {
     if (n != null)
     {
       System.out.append((String) n.getData() + "\n");
       displayTreePreOrder(n.getLeft());
       displayTreePreOrder(n.getRight());
     }
   }
   
  
   
   static Scanner console=new Scanner(System.in);

	
} 