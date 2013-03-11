package DataStructureLab7_1c;
// BinaryTreeNode class; stores a node in a tree.
//
// CONSTRUCTION: with (a) no parameters, or (b) an Object,
//     or (c) an Object, left child, and right child.
//
// *******************PUBLIC OPERATIONS**********************
// int size( )            --> Return size of subtree at node
// int height( )          --> Return height of subtree at node
// void printPostOrder( ) --> Print a postorder tree traversal
// void printInOrder( )   --> Print an inorder tree traversal
// void printPreOrder( )  --> Print a preorder tree traversal
// BinaryTreeNode duplicate( )--> Return a duplicate tree

/**
 * Binary node class with recursive routines to
 * compute size and height.
 */
final class BinaryTreeNode 
{
    int             element;
      BinaryTreeNode  left;
      BinaryTreeNode  right;
    
    public BinaryTreeNode( )
    {
        this( 0, null, null );
    }
    
	public BinaryTreeNode(int element) {		
		this(element,null,null);
	}

    
    public BinaryTreeNode( int theElement, BinaryTreeNode  lt, BinaryTreeNode  rt )
    {
        element = theElement;
        left    = lt;
        right   = rt;
    }

    /**
     * Return the size of the binary tree rooted at t.
     */
    public static <Integer> int size( BinaryTreeNode  t )
    {
        if( t == null )
            return 0;
        else
            return 1 + size( t.left ) + size( t.right );
    }

    /**
     * Return the height of the binary tree rooted at t.
     */
    public static <Integer> int height( BinaryTreeNode  t )
    {
        if( t == null )
            return -1;
        else
            return 1 + Math.max( height( t.left ), height( t.right ) );
    }

    // Print tree rooted at current node using preorder traversal.
    public void printPreOrder( )
    {
        System.out.println( element );       // Node
        if( left != null )
            left.printPreOrder( );           // Left
        if( right != null )
            right.printPreOrder( );          // Right
    }
    
    private void preorder(BinaryTreeNode  p)
    {
    if (p != null)
    {
    System.out.print(p + " ");
    preorder(p.left);
    preorder(p.right);
    }
    }


    // Print tree rooted at current node using postorder traversal.
    public void printPostOrder( )
    {
        if( left != null )
            left.printPostOrder( );          // Left
        if( right != null )
            right.printPostOrder( );         // Right
        System.out.println( element );       // Node
    }
    
    private void postorder(BinaryTreeNode  p)
    {
    if (p != null)
    {
    postorder(p.left);
    postorder(p.right);
    System.out.print(p + " ");
    }
    }

    // Print tree rooted at current node using inorder traversal.
    public void printInOrder( )
    {
        if( left != null )
            left.printInOrder( );            // Left
        System.out.println( element );       // Node
        if( right != null )
            right.printInOrder( );           // Right
    }
    
    private void inorder(BinaryTreeNode  p)
    {
    if (p != null)
    {
    inorder(p.left);
    System.out.print(p + " ");
    inorder(p.right);
    }
    }


    /**
     * Return a reference to a node that is the root of a
     * duplicate of the binary tree rooted at the current node.
     */
    public BinaryTreeNode  duplicate( )
    {
        BinaryTreeNode  root = new BinaryTreeNode ( element, null, null );

        if( left != null )            // If there's a left subtree
            root.left = left.duplicate( );    // Duplicate; attach
        if( right != null )          // If there's a right subtree
            root.right = right.duplicate( );  // Duplicate; attach
        return root;                      // Return resulting tree
    }
    
   
 
    
    
   
    
    public Integer getElement( )
    {
        return element;
    }
    
    public BinaryTreeNode  getLeft( )
    {
        return left;
    }
    
    public BinaryTreeNode  getRight( )
    {
        return right;
    }
    
    public void setElement( int x )
    {
        element = x;
    }
    
    public void setLeft( BinaryTreeNode  t )
    {
        left = t;
    }
    
    public void setRight( BinaryTreeNode  t )
    {
        right = t;
    }


}
