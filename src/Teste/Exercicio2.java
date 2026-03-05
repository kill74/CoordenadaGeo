package Teste;

import geo.CoordenadaGeo;

public class Exercicio2 {
    public static void main(String[] args) {
        CoordenadaGeo coords[] = new CoordenadaGeo[5];

        coords[0] = new CoordenadaGeo(39.819675780318285, -7.512379302586671, "Castelo Branco");
        coords[1] = new CoordenadaGeo(39.81899415939142, -7.489338925823948, "Centro da Cidade");
        coords[2] = new CoordenadaGeo(37.73836755089123, -25.67377060912866, "Açores");
        coords[3] = new CoordenadaGeo(40.73836755284123, -27.73836755089123, "Atlântico");
        coords[4] = new CoordenadaGeo(42.73836745019123, -37.73836755089123, "Oceano Atlântico");

        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(coords[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(coords[i]);
        }

         */

        /*
        //Fazer isto pois é mais facil
        for(geo.CoordenadaGeo c : coords){
            System.out.println(c);
        }

         */

        printnorte(coords);
        printhora(coords);
        printcoordsfuso(-1, coords);

        //Exemplo de uso da descrição
        System.out.println("\n--- Testando Descrição ---");
        System.out.println("Descrição da primeira coordenada: " + coords[0].getDescricao());
        coords[0].setDescricao("Local Histórico - Castelo Branco");
        System.out.println("Nova descrição: " + coords[0].getDescricao());

    }
    //2.1
    static void printnorte(CoordenadaGeo[]geos ){
        for (CoordenadaGeo c : geos){
            if(c.estaNorte()){
                System.out.println(c);
            }
        }
    }
    //2.2
    static void printhora(CoordenadaGeo[]hora){
        for (CoordenadaGeo c : hora){
            if(c.fusoHorario() >= 0){
                System.out.println(c);
            }
        }
    }
    //2.3
    static void printcoordsfuso(int fuso, CoordenadaGeo[] geos){
        System.out.println("Fuso: " + fuso);
        for(CoordenadaGeo c : geos){
            if(c.fusoHorario() == fuso){
                System.out.println(c);
            }
        }
    }
    //2.4 - Retorna qual a coordenada mais perto de uma dada coordenada
    static CoordenadaGeo discoord(CoordenadaGeo coordenada, CoordenadaGeo[] loc){
        CoordenadaGeo maisPerto = loc[0];
        double menorDistancia = loc[0].distanciaPara(coordenada);

        for (CoordenadaGeo c : loc){
            double distancia = c.distanciaPara(coordenada);
            if(distancia < menorDistancia){
                menorDistancia = distancia;
                maisPerto = c;
            }
        }
        return maisPerto;
    }
}
