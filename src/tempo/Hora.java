package tempo;

import java.time.LocalTime;

public class Hora {

    public static final int HORAS_DIA = 24;
    public static final int MINUTOS_HORA = 60;
    public static final int SEGUNDOS_MINUTO = 60;
    public static final int SEGUNDOS_HORA = MINUTOS_HORA * SEGUNDOS_MINUTO;
    public static final int SEGUNDOS_DIA = HORAS_DIA * SEGUNDOS_HORA;
    public static final int MINUTOS_DIA = HORAS_DIA * MINUTOS_HORA;

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = checkHoras(horas);
        this.minutos = checkMinutos(minutos);
        this.segundos = checkSegundos(segundos);
    }

    public Hora(){
        LocalTime agora = LocalTime.now();
        horas = agora.getHour();
        minutos = agora.getMinute();
        segundos = agora.getSecond();
    }

    public Hora (int totalSegundos){
        if (totalSegundos < 0 || totalSegundos >= SEGUNDOS_DIA) {
            throw new IllegalArgumentException("Total de segundos invalido: " + totalSegundos);
        }
        horas = totalSegundos / SEGUNDOS_HORA;
        int resto = totalSegundos % SEGUNDOS_HORA;
        minutos = resto / SEGUNDOS_MINUTO;
        segundos = resto % SEGUNDOS_MINUTO;
    }
    // Comparar duas Horas
    public int compareTo(Hora outra){
        if(this.horas != outra.horas)
            return (this.horas - outra.horas);
        if(this.minutos != outra.minutos)
            return (this.horas - outra.minutos);
        return (this.segundos - outra.segundos);
    }

    public void somaHoras(int numhoras){
        if (numhoras < 0)
            throw new IllegalArgumentException("numHoras tem de ser positivo " + numhoras);
        horas = (this.horas + numhoras) % HORAS_DIA;
    }

    public void somaMinutos(int numminutos){
        if(numminutos < 0)
            throw new IllegalArgumentException("somaMinutos tem de ser positivo " + numminutos);
        int total = this.minutos + numminutos;
        minutos = total % MINUTOS_HORA;
        somaHoras(total / MINUTOS_HORA);
    }

    public void somaSegundos(int numsegundos){
        if(numsegundos < 0)
            throw new IllegalArgumentException("somaSegundos tem de ser positivo " + numsegundos);
        int total = this.segundos + numsegundos;
        segundos = total % SEGUNDOS_MINUTO;
        somaMinutos(total / SEGUNDOS_MINUTO);
    }

    public int toSegundos(){
       return (this.horas * 3600) + (this.minutos * 60) + this.segundos;
    }

    public int diferencaSegs(){
        return 0;
    }

    private int checkHoras(int horas) {
        if (horas < 0 || horas >= HORAS_DIA) {
            throw new IllegalArgumentException("Horas invalidas" + horas);
        }
        return horas;
    }

    private int checkMinutos(int minutos) {
        if (minutos < 0 || minutos >= MINUTOS_HORA) {
            throw new IllegalArgumentException("Minutos invalidos" + minutos);
        }
        return minutos;
    }

    private int checkSegundos(int segundos) {
        if (segundos < 0 || segundos >= SEGUNDOS_MINUTO) {
            throw new IllegalArgumentException("Segundos invalidos" + segundos);
        }
        return segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = checkHoras(horas);
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = checkMinutos(minutos);
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = checkSegundos(segundos);
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

}
