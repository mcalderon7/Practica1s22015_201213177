/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermariomaker;

/**
 *
 * @author Marvin
 */
public class Row {
    
    private HeaderNode primero;
    private HeaderNode ultimo;
    
    /*Constructor*/
    public Row(){
        this.primero = null;
        this.ultimo = null;
    }
    
    /*Método para insertar al final de la lista de fila*/
    public Row insertar(int indice){
        
        HeaderNode nuevo = new HeaderNode(indice);
        
        if(primero == null){
            nuevo.setSiguiente(null);
            primero = nuevo;
            ultimo = primero;
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
            ultimo = nuevo;
        }
        
        return this;
        
    }
    
    
    /*Método para eliminar al de la lista fila*/
    public void eliminar(int indice){
        
        HeaderNode actual, anterior;
        boolean encontrado;
        
        /*Incialización*/
        actual = primero;
        anterior = null;
        encontrado = false;
        
        /*Ciclo para buscar el nodo a eliminar*/
        while((actual != null) && (!encontrado)){
            
            encontrado = (actual.indice == indice);
            
            if(!encontrado){
                anterior = actual;
                actual = actual.siguiente;
            }
            
        }
        
        /*Enlazar el nodo anterior con el siguiente*/
        if(actual != null){
            
            if(actual == primero){
                primero = actual.siguiente;
            }else{
                anterior.siguiente = actual.siguiente;
            }
            
        }
        
    }
    
}
