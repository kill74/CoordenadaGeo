package Teste;
import elevador.Elevador;

public class TestaElevador {
    public static void main(String[] args) {
        Elevador e1 = new Elevador(-3, 5, 10);
        System.out.println(e1);

        Elevador e2 = new Elevador(-1,12);
        System.out.println(e2);

        Elevador e3 = new Elevador(4,10);
        System.out.println(e3);

        //e1.setAndaratual(-3);
        //System.out.println(e1);
    }
}
