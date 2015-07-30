package supermariomaker;

/**
 *
 * @author Marvin
 */
public class MatrixNode {
    
    int data;
    MatrixNode next;
    MatrixNode previous;
    MatrixNode up;
    MatrixNode down;
    
    MatrixNode(int value){
        this.data = value;
        this.next = null;
        this.previous = null;
        this.up = null;
        this.down = null;
    }
    
}
