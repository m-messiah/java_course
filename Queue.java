  
import java.util.Iterator;
 import java.util.Vector;
public class Queue <E> extends Vector<E> {
 private static final long serialVersionUID = 3373655L;
 private final Vector<E> mval;
 public Queue (){ mval = new Vector <E>();}
 public int size() {return mval.size();}
 public boolean add (E e) { return mval.add(e);}
 public E get() {E e= mval.firstElement();
 mval.remove(0); return e;}
 public String toString() {return mval.toString();}
 public Iterator<E> iterator() { return mval.iterator();}
public static void main(String[] args) {
 Queue <Integer> q = new Queue <Integer>();
 for (int j=0;j<11;j++)
 {q.add(j);}
 System.out.println(q.toString());
 for (Iterator<Integer> i = q.iterator();i.hasNext();)
 {System.out.print(i.next()+" ");}
 System.out.println("\n"+q.toString());
 }
 }
