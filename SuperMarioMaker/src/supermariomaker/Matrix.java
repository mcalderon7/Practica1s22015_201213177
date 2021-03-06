package supermariomaker;

/**
 *
 * @author Marvin
 */
public class Matrix {
    
    MatrixNode auxFil;
    MatrixNode auxCol;
    MatrixNode primeroColumna;
    MatrixNode ultimoColumna;
    MatrixNode primeroFila;
    MatrixNode ultimoFila;
    
    public Matrix(){
        this.primeroColumna = null;
        this.ultimoColumna = null;
        this.primeroFila = null;
        this.ultimoFila = null;
        this.auxCol = null;
        this.auxFil = null;
    }
    
    public Matrix insertarColumna(int indice){
        
        MatrixNode nuevo = new MatrixNode(indice);
        nuevo.siguiente = primeroColumna;
        
        if(primeroColumna == null){
            primeroColumna.anterior = nuevo;
            primeroColumna = nuevo;
        }else{
            nuevo.siguiente = ultimoColumna.siguiente;
            
            if(ultimoColumna.siguiente != null){
                ultimoColumna.siguiente.anterior = nuevo;
                ultimoColumna.siguiente = nuevo;
                nuevo.anterior = ultimoColumna;
            }
            
        }
        
        return this;
        
    }
    
    public Matrix insertarFila(int indice){
        
        MatrixNode nuevo = new MatrixNode(indice);
        nuevo.siguiente = primeroFila;
        
        if(primeroFila != null){
            primeroFila.anterior = nuevo;
            primeroFila = nuevo;
        }
        
        return this;
        
    }
    
    public Matrix insertarFilaX(int imagen, String nombre_objeto){
        
        
        
        return this;
        
    }
    
    
    public void eliminar(int indice){
        
           
    }
    
}