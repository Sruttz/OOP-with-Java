//Write a program to add, remove, and display elements and their positions in a linked list. (hint:get())
import java.util.LinkedList;
public class Elements
{
public static void main (String args [])
{
LinkedList<Integer> li= new LinkedList<Integer>();
li.add(58);
li.add(71);
li.add(45);
li.add(63);
System.out.println(li);
li.remove(2);
for(int i=0 ; i<li.size() ; i++)
{
System.out.println("Element " + li.get(i) + " Position : " + i);
}
}
}