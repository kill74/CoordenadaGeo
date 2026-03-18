package tempo;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        if (min < 0 || min >= 60) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        if (seg < 0 || seg >= 60) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min >= 60) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        if (seg < 0 || seg >= 60) {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo");
        }
        this.seg = seg;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d" + hora, min, seg);
    }

}
