package ba.unsa.etf.rpr.t1;

public class Predmet {
    private String naziv_predmeta;
    private int sifra_predmeta;
    private int broj_studenata;
    private final int max_broj_studenata;
    private Student[] s;

    public Predmet(String naziv_predmeta, int sifra_predmeta, int max_broj_studenata) {
        this.postaviNazivPredmeta(naziv_predmeta);
        this.postaviSifruPredmeta(sifra_predmeta);
        this.max_broj_studenata = max_broj_studenata;
        this.broj_studenata = 0;
        s = new Student[max_broj_studenata];
    }
    public String dajNazivPredmeta() {
        return this.naziv_predmeta;
    }
    public int dajSifruPredmeta() {
        return this.sifra_predmeta;
    }
    public int dajMaxBrojStudenata() {
        return this.max_broj_studenata;
    }
    public int dajBrojStudenata() { return  this.broj_studenata; }
    public void postaviNazivPredmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }
    public void postaviSifruPredmeta(int sifra_predmeta) {
        this.sifra_predmeta = sifra_predmeta;
    }
    public void upisi(Student student) {
        if (broj_studenata + 1 == max_broj_studenata) return;
        s[broj_studenata] = student;
        broj_studenata++;
    }
    public void ispisi(Student student) {
        for (int i = 0; i < broj_studenata; i++) {
            if (s[i].equals(student)) {
                s[i] = null;
                s[i] = s[broj_studenata - 1];
                s[broj_studenata - 1] = null;
                broj_studenata --;
                return;            }
        }
    }
    public void ispisi_studente() {
        int i = 0;
        while (s[i] != null) {
            System.out.printf("%d. ", i + 1);
            s[i].ispisi();
            i ++;
        }
    }
}