import java.util.NoSuchElementException;

public class OrderedList implements OrderedStructure {

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

        private Comparable value;
        private Node previous;
        private Node next;

        private Node(Comparable value, Node previous, Node next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    // Instance variables

    private Node head;

    // Representation of the empty list.

    public OrderedList() {
        head = new Node(null, null, null);
        head.next= head;
        head.previous = head;
    }

    // Calculates the size of the list

    public int size() {
        Node p = head;
        int i=0;
        while (p.next != head){
            p=p.next;
            i++;
        }
        return i;
    }
 
    public Object get(int pos) {
        if (pos<0){
            throw new IndexOutOfBoundsException(Integer.toString(pos));
        }
        Node  p = head.next;
        for (int i=0; i<pos;i++){
            if (p.next == head){
                throw new IndexOutOfBoundsException(Integer.toString(pos));
            }
            else{
                p = p.next;
            }
        }
        return p.value;

    }

    // Adding an element while preserving the order
    public boolean add(Comparable o) {
        if (o==null){
            throw new IllegalArgumentException("null");
        }
        if (head.next == head) {
            head.next = new Node(o, head, head.next);
        }
        else{
            Node p =head;

            while (p.next != head && p.next.value.compareTo( o ) < 0){
                p = p.next;
            }

            Node q = p.next;
            p.next = new Node(o, p, q);
            q.previous = p.next;

        }
        return true;
    }

    // Removes one item from the position pos.

    public void remove(int pos) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException(Integer.toString(pos));
        }
        Node p =head.next;

        for (int i=0; i< pos;i++){
            if (p.next == head){
                throw new IndexOutOfBoundsException(Integer.toString(pos));
            }
            else{
                p=p.next;
            }
        }

        Node deleted = p;
        p = p.previous;

        Node q= deleted.next;
        p.next=q;
        q.previous=p;
            
        deleted.value=null;
        deleted.next=null;
        deleted.previous=null;   
        
    }

    // Knowing that both lists store their elements in increasing
    // order, both lists can be traversed simultaneously.

    public void merge(OrderedList other) {
        Node p = head.next;
        Node q = other.head.next;

        while (q!=other.head){
            if (p==head){
                p.next = new Node(q.value , p, p.next);
                p= p.next;
                q= q.next;
            }
            else if ( q.value.compareTo(p.value) <0 ){
                p.previous= new Node(q.value, p.previous, p);
                p.previous.previous.next= p.previous;
                q= q.next;
            }
            else if(p.next ==head){
                p.next = new Node(q.value, p, head );
                p = p.next;
                q = q.next;
            }
            else{
                p=p.next;
            }

        }

    }
}