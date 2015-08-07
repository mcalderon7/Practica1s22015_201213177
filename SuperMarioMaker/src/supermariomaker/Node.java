package supermariomaker;

/**
 *
 * @author Marvin
 */
public class Node {
    
    final int indice;
    final int imagen;
    final String nombre_objeto;
    
    Node siguiente;
    Node anterior;
    
    public Node(int indice, int imagen, String nombre_objeto){
        
        this.indice = indice;
        this.imagen = imagen;
        this.nombre_objeto = nombre_objeto;
        this.siguiente = null;
        this.anterior = null;
        
    }

    /**
     * @return the imagen
     */
    public int getImagen() {
        return imagen;
    }

    /**
     * @return the nombre_objeto
     */
    public String getNombre_objeto() {
        return nombre_objeto;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
    
}
