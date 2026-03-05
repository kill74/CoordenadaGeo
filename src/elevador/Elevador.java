package elevador;

public class Elevador {
    private int andaratual;
    private int andarinferior;
    private int andarsuperior;

    //Construtor
    public Elevador(int andaratual, int andarinferior, int andarsuperior) {
        if(andarinferior >= andarsuperior){
            throw new IllegalArgumentException("Andar inferior superior ao andar inferior");
        }
        this.andaratual = andaratual;
        this.andarinferior = andarinferior;
        this.andarsuperior = andarsuperior;
    }

    //ToString
    @Override
    public String toString() {
        return "Elevador{" +
                "andaratual=" + andaratual +
                ", andarinferior=" + andarinferior +
                ", andarsuperior=" + andarsuperior +
                '}';
    }

    //Getters e Setters
    public int getAndaratual(){
        return this.andaratual;
    }
    public int getAndarinferior(){
        return this.andarinferior;
    }
    public int getAndarsuperior(){
        return this.andarsuperior;
    }

    public void setAndaratual(int andaratual){
        this.andaratual = andaratual;
    }
    public void setAndarinferior(int andarinferior){
        this.andarinferior = andarinferior;
    }
    public void setAndarsuperior(int andarsuperior){
        this.andarsuperior = andarsuperior;
    }


    public static void main(String[] args) {

    }
}
