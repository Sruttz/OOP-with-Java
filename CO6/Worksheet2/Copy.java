//Write a program to copy a linked list to another linked list, and print both the linkedlist. (hint: clone())
import java.util.LinkedList;
public class Copy
{
public static void main (String args [])
{
    LinkedList<String> ll = new LinkedList<String>();
    ll.add("RVU");
    ll.add("RVCE");
    ll.add("BMS");
    ll.add("MSRIT");
    ll.add("SVIT");
    LinkedList<String> l1= (LinkedList<String>) ll.clone();
    System.out.println("Original list");
    System.out.println(ll);
    System.out.println("Copied list");
    System.out.println(l1);
}
}