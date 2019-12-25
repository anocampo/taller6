package puntos;

/**
 * Esta clase representa un punto en 3 dimensiones
 * @author Andrés Ocampo
 */
public class P3 extends P2 {

    // Atributos
    private int z;

    /**
     * Este crea un objeto de tipo P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * Este crea un objeto de tipo P3
     * @param x cordenada X
     * @param y cordenada Y
     * @param z cordenada z
     */
    public P3(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p2 Objeto de tipo P2
     * @param z Cordenada Z
     */
    public P3(P2 p2, int z){
        super(p2);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p3 un objeto de 3 cordenadas
     */
    public P3(P3 p3){
        this(p3.getX(),p3.getY(),p3.getZ());
    }

    /**
     * Retorna cordenada Z
     * @return Cordenada Z
     */
    public int getZ(){
        return this.z;
    }

    /**
     * Asigna un valor a la cordenada Z
     * @param z
     */
    public void setZ(int z){
        this.z = z;
    }

    /**
     * Calcula la distancia entre dos puntos en tres dimensiones
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @return Distancia
     */
    public double calcularDistancia(int x, int y, int z) {
        double distancia;
        double diferenciaCuadradosX = Math.pow(getX() - x,2);
        double diferenciaCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaCuadradosZ = Math.pow(this.z - z, 2);

        distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY + diferenciaCuadradosZ);

        return distancia;
    }

    /**
     * Calcula la distancia entre dos puntos en tres dimensiones
     * @param p2 Objeto de tipo P2
     * @param z Cordenada Z
     * @return distancia
     */

    public double calcularDistancia(P2 p2, int z) {
        return calcularDistancia(p2.getX(), p2.getY(), this.z);
    }

    /**
     * Calcula la distancia entre dos puntos en tres dimenesiones
     * @param p3 Objeto de tipo P3
     * @param z Cordenada Z
     * @return distancia
     */
    public double calcularDistancia(P3 p3, int z){

        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }

    public String toString() {
        return super.toString()+" Z: "+this.z;

    }
}
