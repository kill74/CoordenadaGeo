package Teste;

import tempo.Hora;

public class TestaHora {
    public static void main(String[] args) {
        Hora h1 = new Hora(10, 20, 30);
        System.out.println(h1);

        Hora h2 = new Hora();
        System.out.println(h2);
    }
}
