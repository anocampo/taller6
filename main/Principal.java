package main;
import puntos.*;
import figura.*;

public class Principal {

    public static void main(String[] args) {

        P2 punto2 = new P2();
        P2 segundoPunto = new P2(1,2);
        P2 tercerPunto = new P2(segundoPunto);
        P3 cuartoPunto = new P3();
        P3 quintoPunto = new P3(1,2,3);
        P3 sextoPunto= new P3(segundoPunto, 2);
        P3 septimoPunto = new P3(quintoPunto);

        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(segundoPunto);
        equilatero.setPunto3(tercerPunto);

        Cubo cubito = new Cubo();
        cubito.getVertices()[0] = new P3();
        zz

    }
}
