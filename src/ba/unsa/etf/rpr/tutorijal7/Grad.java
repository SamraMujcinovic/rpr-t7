package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.function.DoubleFunction;
import java.util.stream.Collectors;

public class Grad implements Serializable{
    private String naziv;
    private int brojStanovnika;
    private double[] Temperature= new double[1000];
    private int brojMjerenja=0;

    public Grad() {}

    public Grad(String naziv,  double[] temperature,int brojMjerenja) {
        this.naziv = naziv;
        this.brojStanovnika = 0;
        this.brojMjerenja=brojMjerenja;
        this.setTemperature(temperature,brojMjerenja);
    }

    public Grad(String naziv, double[] temperature, int brojMjerenja, int brojStanovnika) {
        this.naziv = naziv;
        this.brojMjerenja = brojMjerenja;
        setTemperature(temperature, brojMjerenja);
        this.brojStanovnika = brojStanovnika;
    }


    public String getNaziv() {

        return naziv;
    }

    public void setNaziv(String naziv) {

        this.naziv = naziv;
    }

    public int getBrojStanovnika() {

        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {

        this.brojStanovnika = brojStanovnika;
    }

    public double[] getTemperature() {
        return Temperature.clone();
    }

    public void setTemperature(double[] temperature,int brojMjerenja) {
        if(temperature!=null)
            System.arraycopy(temperature, 0, this.Temperature, 0, brojMjerenja);
    }

    public int getBrojMjerenja() { return brojMjerenja; }

    public void setBrojMjerenja(int brojMjerenja) { this.brojMjerenja = brojMjerenja; }

    @Override
    public String toString() {
        String collect = Arrays.stream(Temperature, 0, brojMjerenja).mapToObj(value -> Double.valueOf(value).toString()).collect(Collectors.joining(", "));
        return
                "Naziv = '" + naziv + '\'' +
                        "\n  brojStanovnika = " + brojStanovnika +
                        "\n  temperature = " + collect +
                        "\n  brojMjerenja = " + brojMjerenja + "\n";
    }

}
