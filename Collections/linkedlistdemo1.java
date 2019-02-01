import java.util.*;
class linkedlistdemo1 {
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("Initial size of ll:"+ll.size());
		ll.add("C");
		ll.add("A");
		ll.add("F");
		ll.add("D");
		ll.add("E");
		ll.add(1,"A2");
		ll.addLast("z");
		ll.addFirst("A");

		System.out.println("Initial size  addition ll:"+ll);

		ll.remove("F");
		ll.remove(2);

		System.out.println("after deletion ll:"+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("after deletion of first and last ll:"+ll);
		String val=11.get(2);
		ll.set(2,"5");
		System.out.println("changed list:"+ll);
	}
}
