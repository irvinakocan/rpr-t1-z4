package ba.unsa.etf.rpr.t1;

public class Program {

    public static void main(String[] args) {
        Predmet p = new Predmet("RPR", 23456, 30);
        Student s1 = new Student("Irvina Kocan", 17652);
        Student s2 = new Student("Alisa Klepic", 17234);
        Student s3 = new Student("Ajla Klicic", 17462);
        Student s4 = new Student("Lejla Kasum", 17298);
        p.upisi(s1);
        p.upisi(s2);
        p.upisi(s3);
        p.upisi(s4);
        p.ispisi_studente();
        p.ispisi(s2);
        p.ispisi_studente();
    }
}
