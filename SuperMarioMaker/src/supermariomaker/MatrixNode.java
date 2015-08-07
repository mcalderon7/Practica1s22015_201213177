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
    
    public MatrixNode(int indice, int imagen, String nombre_objeto){
        this.indice = indice;
        this.imagen = imagen;
        this.nombre_objeto = nombre_objeto;
    }
}
