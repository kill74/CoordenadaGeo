package elevador;

public class Elevador {
    private int andaratual;
    private int andarinferior;
    private int andarsuperior;

    //Construtor
    public Elevador(int andaratual, int andarinferior, int andarsuperior) {
        if(andarinferior >= andarsuperior)
            throw new IllegalArgumentException("Andar inferior superior ao andar inferior");
        if(andaratual < andarinferior || andaratual > andarsuperior)
            throw new IllegalArgumentException("Andar atual invalido");
        this.andaratual = andaratual;
        this.andarinferior = andarinferior;
        this.andarsuperior = andarsuperior;
    }

    public Elevador(int andarinferior, int andarsuperior) {
        this(andarinferior, andarinferior, andarsuperior);
    }

    public Elevador(int andarsuperior) {
        this(0,0,andarsuperior);
    }

    public boolean estaTopo(){
        return andaratual == andarsuperior;
    }

    public boolean estaFundo(){
        return andaratual == andarinferior;
    }

    public boolean acede(int andar){
        return (andar >= andarinferior && andar <= andarsuperior);
    }

    public void sobe(){
        if(estaTopo())
            throw new  IllegalArgumentException();
        andaratual++;
    }

    public void desce(){
        if(estaTopo())
            throw new  IllegalArgumentException();
        andaratual--;
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
        if(andaratual < andarinferior || andaratual > andarsuperior ){
            throw new IllegalArgumentException("Andar atual invalido");
        }
        this.andaratual = andaratual;
    }
    public void setAndarinferior(int andarinferior){
        if(andarinferior > andaratual || andarinferior > andarsuperior){
            throw new IllegalArgumentException("Andar inferior invalido");
        }
        this.andarinferior = andarinferior;
    }
    public void setAndarsuperior(int andarsuperior){
        if(andarsuperior < andaratual || andarsuperior < andarinferior){
            throw new IllegalArgumentException("Andar superior invalido");
        }
        this.andarsuperior = andarsuperior;
    }
    public static void main(String[] args) {

    }
}
