/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book.note;

public class BST<K extends Comparable<K>, V> {
  // class for individual nodes.
 public class Node {
     //children
    protected Node left, right; 
    //Node's parent
    protected Node parent; 
    //Node's key
    private K key; 
     //associated value
    private V value;           

    // Constructor for a Node.
      
     // key =this node's key
     //value= this node's value
    
    public Node(K key, V value) {
      this.key = key;
      this.value = value;
      parent = left = right = sentinel;
    }
    
   //get the key of this node
    public K getKey() {
      return key;
    }
    
    
     //get  the value in this Node
    
    public V getValue() {
      return value;
    }
    
  // Set the value in this Node.
     
    public void setValue(V newValue) {
      value = newValue;
    }
    
    /**
     * Replace the subtree rooted at this node with the subtree rooted at node v.
     * Note: This method does not change v.left or v.right; it is the caller's
     * responsibility to do so.
     // v =the replacement node
     */
    protected void transplant(Node v) {
        // check if u was  the root?
      if (this.parent == sentinel) 
          // if it is, now v is the root
        root = v;                      
      else if (this == this.parent.left)  // otherwise adjust the child of u's parent
        this.parent.left = v;
      else
        this.parent.right = v;
        // if v wasn't the sentinel
      if (v != sentinel) 
          //update its parent
        v.parent = this.parent;   
    }
    
    /**
     *Remove this node from bst
     */
    public void remove() {
      Node z = this;
       // if there is no left child
      if (z.left == sentinel)  
          // then just replace z by its right child
        z.transplant(z.right);   
       // no right child?
      else if (z.right == sentinel)  
          // then just replace z by its left child
        z.transplant(z.left);         
      else {
        // Node z has two children.
        Node y = z.right.minimum();   // y is in z's right subtree, and y has no left child                                

        // Splice y out of its current location, and have it replace z in the BST.
        if (y.parent != z) {
          // If y is not z's right child, replace y as a child of its parent by
          // y's right child and turn z's right child into y's right child.
          y.transplant(y.right);
          y.right = z.right;
          y.right.parent = y;
        }

        // Regardless of whether we found that y was z's right child, replace z as
        // a child of its parent by y and replace y's left child by z's left
        // child.
        z.transplant(y);
        y.left = z.left;
        y.left.parent = y;
      }
    }

  
     // Return a reference to the successor of this node, or null if this node has no successor.
    
    public Node successor() {
      Node x = this;
      
      if (x.right != sentinel)
        // If x has a right subtree, the successor is the node in the right
        // subtree with the minimum key.
        return x.right.minimum();
      else {
        // Otherwise, the successor is the lowest ancestor of x whose left child
        // is also an ancestor of x.
        Node y = x.parent;

        // Go up from x's parent toward the root until finding a left child or the
        // root. x's successor is the parent of that first left child.
        while (y != sentinel && x == y.right) {
          x = y;
          y = y.parent;
        }

        // Node y is the parent of the first left child on the path from x's
        // parent to the root, or the root if we hit it.  Return node y.
        if (y == sentinel)
          return null;
        else
          return y;
      }
    }

         // Return a reference to the predecessor of this node, or null if this node has no predecessor.
     
    public Node predecessor() {
      Node x = this;
      
      // If x has a left subtree, the predecessor is the node in the left
      // subtree with the maximum key.
      if (x.left != sentinel)
        return x.left.maximum();
      else {
        // Otherwise, the predecessor is the lowest ancestor of x whose right child
        // is also an ancestor of x.
        Node y = x.parent;

        // Go up from x's parent toward the root until finding a right child or the
        // root. x's successor is the parent of that first right child.
        while (y != sentinel && x == y.left) {
          x = y;
          y = y.parent;
        }

        // Node y is the parent of the first right child on the path from x's
        // parent to the root, or the root if we hit it.  Return node y.
        if (y == sentinel)
          return null;
        else
          return y;
      }
    }

    // Return a reference to the node in the subtree rooted at this node with the minimum key.
    public Node minimum() {
      Node x = this;
      
      // Keep going to the left until finding a node with no left child. That node
      // is the minimum node in x's subtree.
      while (x.left != sentinel)
        x = x.left;
       return x;
    }

   
     // Return a reference to the node in the subtree rooted at this node with the maximum key
    
    public Node maximum() {
      Node x = this;
      
      // Keep going to the left until finding a node with no right child. That node
      // is the maximum node in x's subtree.
      while (x.right != sentinel)
        x = x.right;

      return x;
    }

    //return the String representation of this Node
    
    public String toString() {
      return "key = " + key + ", value = " + value + ", parent = "
          + (parent == sentinel ? "sentinel" : parent.key) + ", left = "
          + (left == sentinel ? "sentinel" : left.key) + ", right = "
          + (right == sentinel ? "sentinel" : right.key);
    }
  }

  // Instance variables for the BST<K,V> class. They are protected so that subclasses can access them.
 // root of this BST 
 protected Node root;   
 // how to indicate an absent node
  protected Node sentinel;  

  
    //Constructor for a BST. Makes an empty BST.
 
  public BST() {
    sentinel = new Node(null, null);
    root = sentinel;
  }
  
 
   //check whether this BST is empty.
  
  public boolean isEmpty() {
    return root == sentinel;
  }
  
 
   // Return a reference to the root, or null if this BST is empty.
  
  public Node getRoot() {
    if (root == sentinel)
      return null;
    else
      return root;
  }

  /**
   * Return a String representation of this BST, indenting each level by two
   * spaces. Right subtrees appear before subtree roots, which appear before
   * left subtrees, so that when viewed sideways, we see the BST structure.
   */
  public String toString() {
    if (root == sentinel)
      return "";
    else
      return print(root, 0);
  }

 
   // Return a string of 2*s spaces, for indenting.
  
  private String indent(int s) {
    String result = "";
    for (int i = 0; i < s; i++)
      result += "  ";
    return result;
  }

  /**
   * Return a String representing the subtree rooted at a node.
   * 
    x =the root of the subtree
    depth =the depth of x in the BST
   * @return the String representation of the subtree rooted at x
   */
  private String print(Node x, int depth) {
    if (x == sentinel)
      return "";
    else
      return print(x.right, depth + 1) + indent(depth) + x.toString() + "\n"
          + print(x.left, depth + 1);
  }

  /**
   * Create a new node and insert it into the BST.
   * 
   key =key of the new node
   value =value in the new node
   * @return a reference to the new node
   */
  public Node insert(K key, V value) {
      // create the new Node
    Node z = getNewNode(key, value);
    // Node whose key is compared with z's
    Node x = root;    
      // x's parent
    Node xParent = sentinel;      

    // Go down the BST from the root, heading left or right depending on
    // how the new key compares with x's key, until we find a missing node,
    // indicated by the sentinel.
    while (x != sentinel) {
      xParent = x;
      if (key.compareTo(x.key) < 0)
        x = x.left;
      else
        x = x.right;
    }

    // At this point, we got down to the sentinel. Make the last non-sentinel
    // node be x's parent and x the appropriate child.
    z.parent = xParent;

    if (xParent == sentinel)  // empty BST?
      root = z;               // then just the one node
    else {                    // link z as the appropriate child of x's parent
      if (key.compareTo(xParent.key) < 0)
        xParent.left = z;
      else
        xParent.right = z;
    }

    return z;
  }
    
  // Returns a new Node object.
  // Overridden in subclasses.
  protected Node getNewNode(K key, V value) {
    return new Node(key, value);
  }

  /**
   * Search for a node in the subtree rooted at x with a specific key.
   * @param key the key we're searching for
   * @return a reference to the node whose key equals the parameter, or null if
   * no such node in x's subtree
   */
  public Node search(K key) {
    Node x = root;

    // Go down the left or right subtree until either we hit the sentinel or
    // find the key.
    while (x != sentinel && key.compareTo(x.key) != 0) {
      if (key.compareTo(x.key) < 0)
        x = x.left;
      else
        x = x.right;
    }

    // If we got to the sentinel, the key was not in the BST.
    if (x == sentinel)
      return null;
    else
      return x;
  }
}
