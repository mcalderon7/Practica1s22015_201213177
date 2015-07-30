package supermariomaker;

/**
 *
 * @author Marvin
 */
public class Matrix {
    
    MatrixNode first;
    MatrixNode last;
    
    Matrix(){
        first = null;
        last = null;
    }
    
    public Matrix insert(int data){
        
        if(isEmpty()){
            MatrixNode nodo = new MatrixNode(data);
            first = nodo;
            last = nodo;
        }else{
            MatrixNode nodo = new MatrixNode(data);
            last.next = nodo;
            nodo.previous = last;
            last = nodo;
        }
        
        return this;
        
    }
    
    public boolean isEmpty(){
        
        return first == null;
        
    }
    
    public Matrix delete(int data){
        
        MatrixNode old = null;
        MatrixNode current = first;
        
        while(current != last){
            
            if(current.data == data){
                
                if(old == null){
                    first = current.next;
                    first.previous = null;
                }else{
                    old.next = current.next;
                    MatrixNode temp;
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
        
        MatrixNode temp = first;
        
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        
        System.out.println();
        
    }
    
    
}
