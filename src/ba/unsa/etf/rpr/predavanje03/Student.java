package ba.unsa.etf.rpr.predavanje03;

public class Student implements Cloneable{
    private String ime,prezime;
    private int broj_indeksa;
    public Student(String ime, String prezime, int broj_indeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj_indeksa = broj_indeksa;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Student novi = (Student) super.clone();
        novi.ime=new String(this.ime);
        novi.prezime=new String(this.prezime);
        novi.broj_indeksa=this.broj_indeksa;
        return novi;
    }

    public Student(Student s) {
        ime=new String(s.ime);
        prezime=new String(s.prezime);
        broj_indeksa=s.broj_indeksa;
    }

    public void setBroj_indeksa(int broj_indeksa) {
        this.broj_indeksa = broj_indeksa;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }

    public int getBroj_indeksa() {
        return broj_indeksa;
    }
    public  String toString(){
        return prezime + " " + ime + " (" + broj_indeksa + ")";
    }
}
