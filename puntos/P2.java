package puntos;

/**
 * Esta clase representa un punto en 2D con las cordenadas de X y Y
 * @author Andrés Ocampo
 */
public class P2 {
    // Atributos
    private int x;
    private int y;

    /**
     * Este crea una instancia del objeto P2
      */
    public P2(){
        this.x = this.y = 0;
    }

    /**
     * Crea una instanacia del objeto P2
     * @param x Cordenada X
     * @param y Cordenada Y
     */
    public P2(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instanacia del objeto P2
     * @param p2 es un objeto de un punto de dos dimensiones (P2)
     */
    public P2(P2 p2){
        this.x = p2.getX();
        this.y = p2.getX();
    }

    /**
     * Retorna el valor de x
     * @return está devolviendo x
     */
    public int getX(){
        return this.x;
    }

    /**
     * Asigna el valor de la cordenada x
     * @param x cordenada x
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Retorna el valor de Y
     * @return  esta devolviendo Y
     */
    public int getY(){
        return this.y;
    }

    /**
     * Asigna el valor de la cordenada Y
     * @param y cordenada Y
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * Calcula la distancia entre dos puntos
     * @param x Cordenada X del otro punto
     * @param y Cordenada Y del otro punto
     * @return distancia
     */

    public double calcularDistancia(int x, int y){
        double distancia;
        double diferenciaCuadradosX = Math.pow(this.x - x,2);
        double diferenciaCuadradosY = Math.pow(this.x - y,2);

        distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY);

        return distancia;
    }

    /**
     * Calcula la distanacia de dos puntos de un objeto
     * @param p2 objeto tipo P2
     * @return distancia
     */
    public double calcularDistancia (P2 p2){
        return this.calcularDistancia(p2.getX(),p2.getY());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(" X: ").append(this.x).append(" Y: ").append(this.y);

        return sb.toString();
    }
}

