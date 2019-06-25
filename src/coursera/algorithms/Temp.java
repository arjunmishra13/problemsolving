package coursera.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Temp {


  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;
    TreeNode bottom;
    public TreeNode(){};
    public TreeNode(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return Integer.toString(val);
    }

    public static void preprintelements(TreeNode n) {
      if (n == null) {
        return;
      }

      System.out.print(n.val + ",");
      preprintelements(n.left);
      preprintelements(n.right);
    }
  }

  static class Node {
    int val;
    Node left;
    Node right;
    Node next;
    Node bottom;
    public Node(){};
    public Node(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return Integer.toString(val);
    }

    public static void preprintelements(Node n) {
      if (n == null) {
        return;
      }

      System.out.print(n.val + ",");
      preprintelements(n.left);
      preprintelements(n.right);
    }
  }

  static class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return val + "";
    }
  }

  private static TreeNode deserializeTreeNode(Integer[]arr) {

    if (arr.length == 0 || arr[0] == null) {
      return null;
    }

    Queue<TreeNode>q = new LinkedList<>();
    int i = 0;
    TreeNode head = new TreeNode(arr[i]);
    q.add(head);
    while (!q.isEmpty()) {
      TreeNode node = q.remove();

      if (node != null) {
        if (++i < arr.length) {
          Integer val = arr[i];
          node.left = val != null? new TreeNode(val): null;
          q.add(node.left);
          if (++i < arr.length) {
            val = arr[i];
            node.right = val != null? new TreeNode(val): null;
            q.add(node.right);
          }
        }
      }
    }

    return head;
  }

  private static List<Integer> serializeTreeNode(TreeNode node) {
    List<Integer>lt = new ArrayList<Integer>();
    Queue<TreeNode>q = new LinkedList<>();
    q.add(node);
    while (!q.isEmpty()) {
      TreeNode n = q.remove();
      lt.add(n != null? n.val: null);

      if (n != null) {
        q.add(n.left);
        q.add(n.right);
      }
    }

    return lt;
  }

  private static Node deserializeNode(Integer[]arr) {

    if (arr.length == 0 || arr[0] == null) {
      return null;
    }

    Queue<Node>q = new LinkedList<>();
    int i = 0;
    Node head = new Node(arr[i]);
    q.add(head);
    while (!q.isEmpty()) {
      Node node = q.remove();

      if (node != null) {
        if (++i < arr.length) {
          Integer val = arr[i];
          node.left = val != null? new Node(val): null;
          q.add(node.left);
          if (++i < arr.length) {
            val = arr[i];
            node.right = val != null? new Node(val): null;
            q.add(node.right);
          }
        }
      }
    }

    return head;
  }

  private static ListNode deserializeNodeList(int[]arr) {
    ListNode head = new ListNode (arr[0]);
    ListNode node  = head;
    for (int i = 1; i < arr.length; i++) {
      node.next = new ListNode(arr[i]);
      node = node.next;
    }
    return head;
  }

  private static List<Integer> serializeNodeList(ListNode n) {
    List<Integer>lt = new ArrayList<>();
    while (n != null) {
      lt.add(n.val);
      n = n.next;
    }
    return lt;
  }

  private static List<String> deserializelist(String[]arr) {
    List<String>lts = new ArrayList<String>();
    for (String s: arr) {
      lts.add(s);
    }
    return lts;
  }

  public static void main(String[]args) {
    int[]arr = {};
    int[]brr = {};
    Arrays.hashCode(arr);
    System.out.println();

    Arrays.equals(arr, brr);
  }
}
