package supermariomaker;

/**
 *
 * @author Marvin
 */
public class Node {
    
    int data;
    Node next;
    Node previous;
    
    Node(int value){
        this.data = value;
        this.next = null;
        this.previous = null;
    }
    
}
