package tempo;

import java.time.LocalTime;

public class Hora {

    public static final int HORAS_DIA = 24;
    public static final int MINUTOS_HORA = 60;
    public static final int SEGUNDOS_MINUTO = 60;
    public static final int SEGUNDOS_HORA = MINUTOS_HORA * SEGUNDOS_MINUTO;
    public static final int SEGUNDOS_DIA = HORAS_DIA * SEGUNDOS_HORA;
    public static final int MINUTOS_DIA = HORAS_DIA * MINUTOS_HORA;

    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        this.hora = checkHoras(hora);
        this.min = checkMinutos(min);
        this.seg = checkSegundos(seg);
     }

     public Hora(){
        LocalTime agora = LocalTime.now();
        this.hora = agora.getHour();
        this.min = agora.getMinute();
        this.seg = agora.getSecond();
     }

     public Hora(int totalSegundos){

     }

     public Hora(String hStr){

     }


    private int checkHoras(int hora) {
        if (hora < 0 || hora >= HORAS_DIA) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        return hora;
    }

    private int checkMinutos(int min) {
        if (min < 0 || min >= MINUTOS_HORA) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        return min;
    }

    private int checkSegundos(int seg) {
        if (seg < 0 || seg >= SEGUNDOS_MINUTO) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        return seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = checkHoras(hora);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = checkMinutos(min);
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = checkSegundos(seg);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

}
