package testimprumut;
public class Imprumut {
    private int id;
    private int numar;
    public double suma;
    protected double rata;
    private double sumaNeplatita;
    protected int frecventa;
    Imprumut(){
        
    }
    public double calculeazaRataImprumutPeLuna(){
        rata = 0.10 * suma;
        return rata;
    }
    public double calculeazaRataImprumutApartament(){
        rata = 0.13 * suma;
        return rata;
    }
    public double calculeazaRataImprumutProdusCasnic(){
        rata = 0.17 * suma;
        return rata;
    }
    public double getSumaNeplatita(){
        sumaNeplatita = rata*12 - frecventa*rata;
        return sumaNeplatita;
    }
    public double getSuma(){
        return suma;
    }
    public void setSuma(double s){
        this.suma = s;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getNumarCont(){
        return numar;
    }
    public void setNumarCont(int nr){
        this.numar = nr;
    }
    public int getFrecventa(){
        return frecventa;
    }
    public void setFrecventa(int f){
        this.frecventa = f;
    }
}

