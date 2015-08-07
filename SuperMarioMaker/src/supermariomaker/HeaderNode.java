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
public class HeaderNode {
    
    final int indice;
    HeaderNode siguiente;
    
    public HeaderNode(int indice){
        this.indice = indice;
        this.siguiente  = null;
    }
    
    public HeaderNode(int indice, HeaderNode nodo){
        this.indice = indice;
        this.siguiente = nodo;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }
    
    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(HeaderNode siguiente) {
        this.siguiente = siguiente;
    }

}
