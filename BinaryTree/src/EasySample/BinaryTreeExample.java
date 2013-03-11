package EasySample;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
* This class demonstrates use of a binary tree to store names
*/
public class BinaryTreeExample extends Applet implements ActionListener
{
  // interface objects
   Label dataLabel = new Label("Data:");
   TextField dataField = new TextField("Enter data here");

  Button addButton = new Button("Add item");
   Button newButton = new Button("New tree");
   Button preButton = new Button("Pre-order");
   Button inoButton = new Button("In-order");
   Button posButton = new Button("Post-order");

   TextArea display = new TextArea(10, 20);
  Label messages = new Label("System messages appear here");

   // pointer to root node
   Node root;

  /**
   * Method to lay out the GUI and init the Applet
   */
   public void init()
   {
     add( dataLabel );
     add( dataField );
     // Button panels
     Panel actionButtons = new Panel();
     actionButtons.add( addButton );
     actionButtons.add( newButton);
     add(actionButtons);
     Panel displayButtons = new Panel();
     displayButtons.add( preButton );
     displayButtons.add( inoButton );
     displayButtons.add( posButton );
     add(displayButtons);
     add( display );
     add( messages );

    addButton.addActionListener(this);
     newButton.addActionListener(this);
     preButton.addActionListener(this);
     inoButton.addActionListener(this);
     posButton.addActionListener(this);

    root = null;
   }
   /**
   * Detect and act on Button presses
   *
   * @param the event that caused the method to be called
   */
   public void actionPerformed(ActionEvent e)
   {
     display.setText("");
     if (e.getSource() == addButton)
     {
       // check for text in box
       String data = dataField.getText();
       if (data.length() != 0)
       {
         addNode(data);
       }
       else
       {
         messages.setText("No data to add!");
       }
     }
     else
     {
       // start a new tree
       if (e.getSource() == newButton)
       {
         root = null;
       }
       else
       {
         // a display button was pressed
         if( root != null )
         {
           displayTree( e );
         }
         else
         {
           messages.setText("No tree to display!");
         }
       }
     }
   }
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
       display.append("Starting new tree\n");
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
       display.append("Testing right of " + ns + "\n");
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
       display.append("Testing left of " + ns + "\n");
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
   public void displayTree(ActionEvent e)
   {
     // selects display method depending upon button
     // pressed by user.
     if( e.getSource() == preButton )
     {
       displayTreePreOrder( root );
     }
     else
     {
       if( e.getSource() == inoButton )
       {
         displayTreeInOrder( root );
       }
       else
       {
         displayTreePostOrder( root );
       }
     }
   }
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
       display.append((String) n.getData() + "\n");
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
       display.append((String) n.getData() + "\n");
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
       display.append((String) n.getData() + "\n");
       displayTreePreOrder(n.getLeft());
       displayTreePreOrder(n.getRight());
     }
   }
} 