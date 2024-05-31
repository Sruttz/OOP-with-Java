//Write a program to iterate a linked list in reverse order. (hint: for loop)
import java.util.Iterator;
import java.util.LinkedList;

public class RevLinkedList
{
    public static void main (String args [])
    {
        LinkedList <Integer> l = new LinkedList<Integer>();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(50);

        Iterator<Integer> itr= l.descendingIterator();

        for (int i = l.size() - 1; i >= 0; i--) {
            System.out.println(itr.next());
        }
    }
}