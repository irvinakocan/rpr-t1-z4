package ba.unsa.etf.rpr.t1;

public class Student {
    private String ime_i_prezime;
    private int indeks;

    public Student(String ime_i_prezime, int indeks) {
        this.postaviImeIPrezime(ime_i_prezime);
        this.postaviIndeks(indeks);
    }
    public String dajImeIPrezime() {
        return this.ime_i_prezime;
    }
    public int dajIndeks() {
        return this.indeks;
    }
    public void postaviImeIPrezime(String ime_i_prezime) {
        this.ime_i_prezime = ime_i_prezime;
    }
    public void postaviIndeks(int indeks) {
        this.indeks = indeks;
    }
    public void ispisi() {
        System.out.printf("%s  (%d) \n", ime_i_prezime, indeks);
    }
}
