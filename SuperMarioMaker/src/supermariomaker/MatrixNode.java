package supermariomaker;

/**
 *
 * @author Marvin
 */
public class MatrixNode {
    
    int indice;
    int imagen;
    String nombre_objeto;
    
    MatrixNode siguiente;
    MatrixNode anterior;
    MatrixNode arriba;
    MatrixNode abajo;
    
    public MatrixNode(int indice){
        this.indice = indice;
    }
    
    public MatrixNode(int imagen, String nombre_objeto){
        this.imagen = imagen;
        this.nombre_objeto = nombre_objeto;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    /**
     * @return the imagen
     */
    public int getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the nombre_objeto
     */
    public String getNombre_objeto() {
        return nombre_objeto;
    }

    /**
     * @param nombre_objeto the nombre_objeto to set
     */
    public void setNombre_objeto(String nombre_objeto) {
        this.nombre_objeto = nombre_objeto;
    }
    
}
