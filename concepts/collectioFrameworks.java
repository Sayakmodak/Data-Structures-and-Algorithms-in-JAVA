import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class collectioFrameworks {
    public static void main(String[] args) {
        // All collection frameworks
        // Creation
        Collection<Integer> cl = new ArrayList<>();
        Collection<Integer> cl2 = new ArrayList<>();

        // List<Integer> li = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();


        // add
        cl.add(10);
        cl.add(20);
        cl.add(30);
        System.out.println(cl);

        // remove
        cl.remove(10);
        System.out.println(cl);

        // size
        System.out.println(cl.size());


        cl2.add(50);
        cl2.add(60);
        cl2.add(70);

        cl.addAll(cl2); // adds all the elements of a specified collection to the collection
        System.out.println(cl);

        // removeAll -> removes all the elements of the specified collection from the collection
        cl.removeAll(cl2);
        System.out.println(cl.size());

        // iterator
        Iterator<Integer> itr = cl.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }


        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(0, 100);
        System.out.println(list);

        System.out.println("printing arraylist using forEach loop");
        for(Integer i: list){
            System.out.print(i + " ");
        }

        System.out.println(list.get(2));
        System.out.println(list.contains(20));


        // convert to array
        Object[] obj = list.toArray();
        System.out.println("Converted to array: ");
        for(int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }

        list.ensureCapacity(50); // specifies total elments the arraylist can contain
        System.out.println(list.isEmpty()); // check the arraylist is empty or not

        ArrayList<Integer> cloneList = new ArrayList<>();
        cloneList = (ArrayList<Integer>)list.clone();
        System.out.println(cloneList);
        
        cloneList.sort(Comparator.naturalOrder());
        System.out.println("After sorting : " + cloneList);


        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        // LinkedList as queue and dequeue
        ll.addFirst(100);
        System.out.println("Linked List is " + ll);
        ll.addLast(500);
        ll.peek();
        ll.removeFirst();
        ll.removeLast();
        ll.getFirst();
        ll.getLast();
        ll.offer(1); // adds the specified element at the end of the linked list
        ll.poll(); // returns and removes the first element of the linked list


        // Vector
        Vector<Integer> vc = new Vector<>();
        // methods are the same as ArrayList


        // Stack
        Stack<Integer> st = new Stack<>();
        Collection<Integer> st2 = new Stack<>();
        List<Integer> st3 = new Stack<>();
        // methods are same as collection frameworks
        st.push(10);
        st.push(11);
        st.push(12);
        st.pop();
        st.peek();
        System.out.println(st.search(11)); // -1(if not found) else: if found, returns the index of the element
        st.empty();
    }
}
