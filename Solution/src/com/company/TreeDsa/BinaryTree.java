package com.company.TreeDsa;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static  class Node{
        int data ;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }
    static class Btree{
        static  int index = -1;
        public static Node buildTree(int []nodes)
        {
            index++;
            if(nodes[index] == -1)
            {
                return  null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
    }
    //Preorder Traversal
    public static  void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Inorder traversal
    public static void Inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    //Postorder

    static void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    //LevelOrder traversal
    public static  void levelOrder(Node root)
    {
        if(root == null)
        {
               return;
        }
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode == null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }else{
                    q.add(null);
                }
            }  else{
                System.out.print(currNode.data+" ");
                if(currNode.left !=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //count Node
    public static int countNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftNodes = countNode(root.left);
        int rightNodes = countNode(root.right);
        return leftNodes+rightNodes+1;
    }

    //Sum of Nodes
    public static int SumNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftSum = SumNode(root.left);
        int rightSum = SumNode(root.right);
        return leftSum+rightSum+ root.data;
    }

    //Height of Tree
    public static int heightTree(Node root)
    {
        if(root == null){
            return 0;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

        int totalHeight = Math.max(leftHeight,rightHeight)+1;
        return totalHeight;

    }

    //Diameter of tree
    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightTree(root.left)+heightTree(root.right)+1;

        return Math.max(diam3, Math.max(diam1,diam2));
    }

    static class TreeInfo{
        int h;
        int dia;

        public TreeInfo(int h, int dia) {
            this.h = h;
            this.dia=dia;
        }
    }

    public static TreeInfo diameter2(Node root)
    {
        if(root == null)
        {
           return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.h, right.h)+1;
        int d1 = left.dia;
        int d2= right.dia;
        int d3 = left.h + right.h +1;

        int myd = Math.max(Math.max(d1,d2),d3);

        TreeInfo myInfo = new TreeInfo(myHeight,myd);
        return  myInfo;

    }

    //Subtree of tree
    public static boolean isSubtree(Node root,Node subRoot)
    {
        if(subRoot == null)
        {
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data)
        {
            if(isSame(root,subRoot))
            {
                return true;
            }
        }

        return isSame(root.left,subRoot) || isSame(root.right,subRoot);

    }

    public static boolean isSame(Node root, Node subRoot)
    {
        if(root == null && subRoot == null){
            return  true;
        }
        if(root == null && subRoot == null){
            return false;
        }
        if(root.data == subRoot.data)
        {
            return isSame(root.left,subRoot.left) && isSame(root.right,subRoot.right);
        }
        return false;

    }







    public static void main(String[] args) {
        int []Node={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Btree tree = new Btree();
        Node root = tree.buildTree(Node);
//        System.out.println(root.data);
//        preOrder(root);
//        System.out.println();
//        Inorder(root);
//        System.out.println();
//        postOrder(root);
//        levelOrder(root);
//        System.out.println(countNode(root));
//        System.out.println(SumNode(root));
//        System.out.println(heightTree(root));
//        System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);


    }
}
