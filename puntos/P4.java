package puntos;

/**
 * Esta clase representa un punto en 4 dimensiones
 * @author Andrés Ocampo
 */
public class P4 extends P3 {

    // Atributos
    private int w;

    /**
     * Este crea un objeto de tipo P4
     */
    public P4(){
        super();
        this.w = 0;
    }

    /**
     * Este crea un objeto de tipo P4
     * @param x cordenada X
     * @param y cordenada Y
     * @param z cordenada z
     * @param w cordenada w
     */
    public P4(int x, int y, int z, int w){
        super(x,y,z);
        this.w = w;
    }

    /**
     * Crea un objeto de tipo P4
     * @param p2 Objeto de tipo P2
     * @param p3 Objeto de tipo P3
     * @param w Cordenada W
     */
    public P4(P2 p2,P3 p2,int w){
        super(p2);
        super(p3);
        this.w = w;
    }

    /**
     * Crea un objeto de tipo P4
     * @param p4 un objeto de 4 cordenadas
     */
    public P4(P4 p4){
        this(p4.getX(),p4.getY(),p4.getZ(),p4.getW());
    }

    /**
     * Retorna cordenada W
     * @return Cordenada W
     */
    public int getW(){
        return this.w;
    }

    /**
     * Asigna un valor a la cordenada W
     * @param w
     */
    public void setW(int w){
        this.w = w;
    }

    /**
     * Calcula la distancia de tres puntos en cuatro dimensiones
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @param w coordenada W del otro punto
     * @return Distancia
     */
    public double calcularDistancia(int x, int y, int z, int w){
        double distancia;
        double diferenciaCuadradosX = Math.pow(getX() - x,2);
        double diferenciaCuadradosY = Math.pow(getY() - y,2);
        double diferenciaCuadradosZ = Math.pow(getZ() - z,2);
        double diferenciaCuadradosW = Math.pow(this.w - w,2);

        distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY + diferenciaCuadradosZ + diferenciaCuadradosW);

        return distancia;
    }

    /**
     * Calcula la distancia de tres puntos en cuatro dimensiones
     * @param p2 Objeto de tipo P2
     * @param p3 Objeto de tipo P3
     * @param w Cordenada W
     * @return distancia
     */

    public double calcularDistancia(P2 p2,P3 p3,int w) {
        return calcularDistancia(p2.getX(), p2.getY(), p3.getZ(), this.w);
    }

    /**
     * Calcula la distancia de tres puntos en cuatro dimensiones
     * @param p4 Objeto de tipo P4
     * @param w Cordenada W
     * @return distancia
     */
    public double calcularDistancia(P4 p4, int w){

        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }

    public String toString() {
        return super.toString()+" W: "+this.w;
    }
}