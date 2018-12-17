package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;

public class Drzava implements Serializable{
    private String naziv;
    private int brojStanovnika;
    private double povrsina;
    private String jedinicaZaPovrsinu;
    private Grad glavniGrad;

    public Drzava(String naziv, int stanovnika, double povrsina, String jedinica, Grad glavniGrad) {
        this.naziv=naziv;
        this.brojStanovnika=stanovnika;
        this.jedinicaZaPovrsinu=jedinica;
        this.glavniGrad= glavniGrad;
        this.povrsina=povrsina;
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

    public double getPovrsina() {

        return povrsina;
    }

    public void setPovrsina(double povrsina) {

        this.povrsina = povrsina;
    }

    public String getJedinicaZaPovrsinu() {

        return jedinicaZaPovrsinu;
    }

    public void setJedinicaZaPovrsinu(String jedinicaZaPovrsinu) {

        this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {

        this.glavniGrad = glavniGrad;
    }

    @Override
    public String toString() {
        return "Drzava{" +
                "naziv='" + naziv + '\'' +
                ", brojStanovnika=" + brojStanovnika +
                ", povrsina=" + povrsina +
                ", jedinicaPovrsine='" + jedinicaZaPovrsinu + '\'' +
                ", glavniGrad=" + glavniGrad +
                '}';
    }
}

