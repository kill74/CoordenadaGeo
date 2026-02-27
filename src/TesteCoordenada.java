public class TesteCoordenada {
    public static void main(String[] args) {
        CoordenadaGeo c1 = new CoordenadaGeo(39.819675780318285, -7.512379302586671);
        CoordenadaGeo c2 = new CoordenadaGeo(39.81899415939142, -7.489338925823948);
        CoordenadaGeo c3 = new CoordenadaGeo(37.73836755089123, -25.67377060912866);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        //Teste para verificar a localização da coordenada
        System.out.println(c1.estaNorte());
        System.out.println(c2.estaNorte());
        System.out.println(c3.estaNorte());

        if(c1.estaNorte()){
            System.out.println("A latitude da coordenada é positiva");
        }else{
            System.out.println("A latitude da coordenada é negativa");
        }

        //Teste para verificar o fuso de horário de cada coordenada
        System.out.println("A coordenada encontra-se a: " + c1.fusoHorario() + " hora " );
        System.out.println("A coordenada encontra-se a: " + c2.fusoHorario() +  " hora " );
        System.out.println("A coordenada encontra-se a: " + c3.fusoHorario() + " hora ");

        //Teste para verificar a distância de uma coordenada para outra
        System.out.println("A coordenada encontra-se a: " + c1.distanciaPara(c2));
        System.out.println("A coordenada encontra-se a: " + c2.distanciaPara(c1));
        System.out.println("A coordenada encontra-se a: " + c1.distanciaPara(c3));
        System.out.println("A coordenada encontra-se a: " + c3.distanciaPara(c1));

    }
}
