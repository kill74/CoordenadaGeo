package geo;

public class CoordenadaGeo {
    //Só se podem trocar estas variaveis dentro da class;
    //Que neste caso só se pode mudar os valores dentro do construtor
    //Que por si os "valores" estão dentro de métodos
    private double latitude;
    private double longitude;
    private String descricao;

    //Construtor para iniciar os valores dos campos (sem descrição)
    public CoordenadaGeo(double latitude, double longitude) {
        //Validações
        //Vão buscar os valores ão método com os nomes correspondidos
        this.latitude = validateLatitude(latitude);
        this.longitude = validateLongitude(longitude);
        this.descricao = "";
    }

    //Construtor para iniciar os valores dos campos (com descrição)
    public CoordenadaGeo(double latitude, double longitude, String descricao) {
        //Validações
        //Vão buscar os valores ão método com os nomes correspondidos
        this.latitude = validateLatitude(latitude);
        this.longitude = validateLongitude(longitude);
        this.descricao = descricao;
    }

    //Estes 3 métodos só iram verificar a latitude para ver se esta a "Norte", "Sul" ou no "Equador"
    public boolean estaNorte(){
        return latitude >= 0;
    }

    public boolean estaSul(){

        return latitude < 0;
    }

    public boolean Equador(){

        return latitude == 0;
    }

    //Verificar fuso Horário
    //O que o "Math.Round" vai fazer é simplesmente arredondar o valor das coordenadas (longitude)
    //e depois vai dividir por 15 que é o valor universal
    public int fusoHorario() {
        //Podemos fazer assim mas o mais correto seria fazer da segunda forma
        //return (int) ((longitude + 7.5 ) / 15 );
        return (int) Math.round((longitude / 15));
    }

    //Distancia para as coordenadas
    public double distanciaPara(CoordenadaGeo c) {
        double deltaLat = c.latitude - this.latitude;
        double latMedia = (c.latitude + this.latitude) /2;
        double deltaLong = c.longitude - this.longitude;
        if (deltaLong > 180)
            deltaLong = deltaLong - 360;
        else if (deltaLong < -180)
            deltaLong = deltaLong + 360;
        deltaLong = deltaLong * Math.cos(Math.toRadians(latMedia));
        return 111.317*Math.sqrt(deltaLat * deltaLat + deltaLong * deltaLong);
    }

    //O que isto vai fazer é simplesmente verificar se a longitude é valida ou não
    // se a longitude for inferior a "-180" e maior que "180" irá acionar uma exception
    private double validateLongitude(double longitude) {
        if(longitude < -180 || longitude > 180)
            throw new IllegalArgumentException("Longitude invalido");
        return longitude;
    }

    //Será igual para aqui só que em vez de ser "180" é com "90"
    private double validateLatitude(double latitude) {
        if(latitude < -90 || latitude > 90)
            throw new IllegalArgumentException("Latitude invalido");
        return latitude;
    }

    //Getters
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public String getDescricao(){
        return descricao;
    }

    //Setters
    public void setLatitude(double Latitude){
        this.latitude = validateLatitude(Latitude);
    }
    public void setLongitude(double Longitude){
        this.longitude = validateLongitude(Longitude);
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //Irá simplesmente fazer com que o "Sout" da variável apareça com o valor correspondido
    // Se não tivermos isto irá simplesmente aparecer o valor do objeto, como por exemplo "geo.CoordenadaGeo@3b9a45b3"
    @Override
    public String toString() {
        return "geo.CoordenadaGeo{" +
                "Descricao='" + descricao + '\'' +
                ", Latitude=" + latitude +
                ", Longitude=" + longitude +
                '}';
    }
}