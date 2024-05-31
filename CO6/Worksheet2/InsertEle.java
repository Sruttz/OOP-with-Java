//Write a program to insert elements into the linked list at the first and last positions and any specified positions( hint: addFirst(), addLast(), add(position, value))
import java.util.Iterator;
import java.util.LinkedList;
public class InsertEle
{
public static void main (String args [])
{
    LinkedList<Integer> l3 = new LinkedList<Integer>();
    l3.addFirst(22);
    l3.addLast(25);
    l3.add(1,27);
    System.out.println(l3);
    Iterator <Integer> itr = l3.iterator();
    while (itr.hasNext())
    {
    System.out.println(itr.next());
    }
}
}