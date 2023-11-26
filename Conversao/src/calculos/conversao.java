package calculos;

public class conversao {
    private double dol;

    private double quant;


    public double getDol() {
        return dol;
    }

    public void setDol(double dol) {
        this.dol = dol;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    public double converter(){
        return (dol * quant ) + (dol * quant * 6) /100;
    }
    /*public String toString(){
        return String.format("Para comprar $ %.2f doláres, você pagará R$ %.2f reais", getQuant(), converter());
    }*/
}

