package figura;
import puntos.P3;

/**
 * Crea un objeto de tipo cubo
 * @author Andrés Ocampo
 */
public class Cubo {

    private String colorFondo;
    private String colorArista;
    private P3[] vertices = new P3[8];

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorArista() {
        return colorArista;
    }

    public void setColorArista(String colorArista) {
        this.colorArista = colorArista;
    }

    public P3[] getVertices() {
        return vertices;
    }

    public void setVertices(P3[] vertices) {
        this.vertices = vertices;
    }

    public void dibujar(){
        System.out.println("Dibujando un cubo");
    }
}

