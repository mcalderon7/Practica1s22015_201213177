package supermariomaker;

/**
 *
 * @author Marvin
 */
public class Matrix {
    
    MatrixNode primero;
    MatrixNode ultimo;
    MatrixNode arriba;
    MatrixNode abajo;
    
    public Matrix(){
        this.primero = null;
        this.ultimo = null;
        this.arriba = null;
        this.abajo = null;
    }
    
    public Matrix insertar(int indice, int imagen, String nombre_objeto){
        
        MatrixNode nuevo = new MatrixNode(indice, imagen, nombre_objeto);
        nuevo.siguiente = primero;
        
        if(primero == null){
            primero.anterior = nuevo;
            primero = nuevo;
            
            Row cabeza = new Row();
            cabeza.insertar(1);
            //primero.arriba = 
        }else{
            nuevo.siguiente = ultimo.siguiente;
            
            if(ultimo.siguiente != null){
                ultimo.siguiente.anterior = nuevo;
                ultimo.siguiente = nuevo;
                nuevo.anterior = ultimo;
            }
            
        }
        
        return this;
        
    }
    
    
    public void eliminar(int indice){
        
        MatrixNode actual;
        boolean encontrado = false;
        actual = primero;
        
        while((actual != null) && (!encontrado)){
            
            encontrado = (actual.indice == indice);
            
            if(!encontrado){
                actual = actual.siguiente;
            }
            
        }
        
        if(actual != null){
            
            if(actual == primero){
                primero = actual.siguiente;
                
                if(actual.siguiente != null){
                    actual.siguiente.anterior = null;
                }
                
            }else if(actual.siguiente != null){
                
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                
            }else{
                
                actual.anterior.siguiente = null;
                actual = null;
                
            }
            
        }
        
        
    }
    
}