package AnExampleBinaryTreeClass;


/*
 * JUnit test class for BinaryTree class
 * Copyright (c) 2006
 * Dept. of Computer Science, University College London
 * @author Graham Roberts
 * @version 2.0 01-Mar-06
 */

import junit.framework.* ;
import java.util.Iterator;

public class BinaryTreeTest extends TestCase
{
  private Tree<Integer> empty ;
  private Tree<Integer> one ;
  private Tree<Integer> several ;

  public void setUp()
  {
    empty = new BinaryTree<Integer>() ;
    one = new BinaryTree<Integer>() ;
    one.add(0) ;
    several = new BinaryTree<Integer>() ;
    several.add(5) ;
    several.add(2) ;
    several.add(1) ;
    several.add(9) ;
    several.add(8) ;
    several.add(10) ;
  }

  public void testEmptyContainsZeroItems()
  {
    assertTreeEmpty(empty);
  }

  public void testOneContainsOneItem()
  {
    assertTrue("One should contain 0",one.contains(0)) ;
    assertIterationValid(one,new int[]{0});
  }

  public void testSeveralContainsSixItems()
  {
    assertContains(several,new int[]{1,2,5,8,9,10}) ;
    assertIterationValid(several,new int[]{1,2,5,8,9,10});
  }

  public void testSeveralDoesNotContain()
  {
    assertDoesNotContain(several,new int[]{-1,0,3,4,6,7,11}) ;
  }

  public void testRemoveFromEmpty()
  {
    empty.remove(0);
    assertTreeEmpty(empty);
  }

  public void testRemoveFromOne()
  {
    one.remove(0) ;
    assertTrue("0 not removed from one",!one.contains(0)) ;
    assertTreeEmpty(one);
  }

  public void testRemoveByLeaf()
  {
    assertRemoveAll(several,new int[]{5,2,1,8,10,9,5});
  }

  public void testRemoveByRoot()
  {
    assertRemoveAll(several,new int[]{5,8,9,10,2,1});
  }

  public void testDuplicates()
  {
    empty.add(1) ;
    empty.add(1) ;
    empty.add(1) ;
    assertIterationValid(empty,new int[] {1,1,1});
    assertTrue("Should contain 1",empty.contains(1)) ;
    empty.remove(1) ;
    assertTrue("Should still contain 1",empty.contains(1)) ;
    assertIterationValid(empty,new int[] {1,1});
    empty.remove(1) ;
    assertTrue("Should still contain 1",empty.contains(1)) ;
    assertIterationValid(empty,new int[] {1});
    empty.remove(1) ;
    assertTrue("Should not contain 1",!empty.contains(1)) ;
    assertTreeEmpty(empty);
  }

  private void assertTreeEmpty(Tree<Integer> tree)
  {
    Iterator<Integer> iterator = tree.iterator() ;
    assertTrue("Tree not empty",!iterator.hasNext()) ;
  }

  private void assertRemoveAll(Tree<Integer> tree, int[] elements)
  {
    for (int i = 0 ; i < elements.length ; i++)
    {
      tree.remove(elements[i]);
      assertFalse(elements[i] + " Still in tree after being removed",
                 tree.contains(elements[i])) ;
    }
    assertTreeEmpty(tree);
  }

  private void assertContains(Tree<Integer> tree, int[] elements)
  {
    for (int i = 0 ; i < elements.length ; i++)
    {
      assertTrue(elements[i] + " not in tree",
                 tree.contains(elements[i])) ;
    }
  }

  private void assertDoesNotContain(Tree<Integer> tree, int[] elements)
  {
    for (int i = 0 ; i < elements.length ; i++)
    {
      assertFalse(elements[i] + " unexpectedly found in tree",
                  tree.contains(elements[i])) ;
    }
  }

  private void assertIterationValid(Tree<Integer> tree, int[] elements)
  {
    Iterator<Integer> iterator = tree.iterator() ;
    for (int i = 0 ; i < elements.length ; i++)
    {
      assertEquals(elements[i] + " missing from tree",
                   new Integer(elements[i]),iterator.next()) ;
    }
    assertFalse("Not reached end of iteration",iterator.hasNext());
  }

  public static Test suite()
  {
    return new TestSuite(BinaryTreeTest.class) ;
  }

  public static void main (String[] args)
  {
    junit.textui.TestRunner.run(suite()) ;
  }
}


