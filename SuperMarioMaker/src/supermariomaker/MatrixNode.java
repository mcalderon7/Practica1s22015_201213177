package supermariomaker;

/**
 *
 * @author Marvin
 */
public class MatrixNode {
    
    final int indice;
    final int imagen;
    final String nombre_objeto;
    
    MatrixNode siguiente;
    MatrixNode anterior;
    private MatrixNode arriba;
    private MatrixNode abajo;
    
    public MatrixNode(int indice, int imagen, String nombre_objeto){
        
        this.indice = indice;
        this.imagen = imagen;
        this.nombre_objeto = nombre_objeto;
        this.siguiente = null;
        this.anterior = null;
        this.arriba = null;
        this.abajo = null;
        
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
    public void setSiguiente(MatrixNode siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(MatrixNode anterior) {
        this.anterior = anterior;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(MatrixNode arriba) {
        this.arriba = arriba;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(MatrixNode abajo) {
        this.abajo = abajo;
    }
    
}
