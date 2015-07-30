package supermariomaker;

/**
 *
 * @author Marvin
 */
public class DoubleList {

    Node first;
    Node last;
    
    DoubleList(){
        first = null;
        last = null;
    }
    
    public DoubleList insert(int data){
        
        if(isEmpty()){
            Node nodo = new Node(data);
            first = nodo;
            last = nodo;
        }else{
            Node nodo = new Node(data);
            last.next = nodo;
            nodo.previous = last;
            last = nodo;
        }
        
        return this;
        
    }
    
    public boolean isEmpty(){
        
        return first == null;
        
    }
    
    public DoubleList delete(int data){
        
        Node old = null;
        Node current = first;
        
        while(current != last){
            
            if(current.data == data){
                
                if(old == null){
                    first = current.next;
                    first.previous = null;
                }else{
                    old.next = current.next;
                    Node temp;
                    temp = current.next;
                    temp.previous = old;
                }
                
            }
            
            old = current;
            current = current.next;
            
        }
        
        if(data == last.data){
            
            last = current.previous;
            
        }
        
        return this;
        
    }
    
    public void print(){
        
        Node temp = first;
        
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        
        System.out.println();
        
    }
    
}
