package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    @Test
    void testKonstruktora(){
        assertThrows(RuntimeException.class,()->{new Predmet("Matematika",1,-5);});
    }

    @Test
    void upisi() {
        Predmet p=new Predmet("Matematika",1,3);
        Student s1=new Student("Nadija", "Borovina", 18067);
        Student s2=new Student("Nedzad", "Hadziosmanovic", 18033);
        Student s3=new Student("Mirza", "Sinanovic", 18025);
        Student s4=new Student("Nadija", "Borovina", 18067);
        p.upisi(s1);
        p.upisi(s2);
        p.upisi(s3);
        assertThrows(IllegalArgumentException.class,()->{p.upisi(s4);});

    }

    @Test
    void ispisi() {
        Predmet p=new Predmet("Matematika",1,3);
        Student s1=new Student("Nadija", "Borovina", 18067);
        Student s2=new Student("Nedzad", "Hadziosmanovic", 18033);
        Student s3=new Student("Mirza", "Sinanovic", 18025);
        Student s4=new Student("Lamija", "Borovina", 18099);
        p.upisi(s1);
        p.upisi(s2);
        p.upisi(s3);
        assertThrows(IllegalAccessException.class, ()->{p.ispisi(s4);});
    }
    @Test
    void upisanTest(){
        Predmet p=new Predmet("Matematika",1,3);
        Student s1=new Student("Nadija", "Borovina", 18067);
        Student s2=new Student("Nedzad", "Hadziosmanovic", 18033);
        Student s3=new Student("Mirza", "Sinanovic", 18025);
        Student s4=new Student("Lamija", "Borovina", 18099);
        p.upisi(s1);
        p.upisi(s2);
        p.upisi(s3);
        assertAll("upisan ili ne",
                ()-> assertTrue(p.upisan(s1)),
                ()-> assertFalse(p.upisan(s4))
        );
    }
    @Test
    void setNaziv_predmeta() {
        Predmet p=new Predmet("Matematika", 1, 10);
        p.setNaziv_predmeta("Diskretna matematika");
        assertNotEquals("Matematika",p.getNaziv_predmeta());
    }

    @Test
    void setSifra_predmeta() {
        Predmet p=new Predmet("Matematika", 1, 10);
        p.setSifra_predmeta(2);
        assertEquals(2,p.getSifra_predmeta());
    }

    @Test
    void setNiz() {

    }
    //provjereno u seterima
    @Test
    void getNaziv_predmeta() {
    }

    @Test
    void getSifra_predmeta() {
    }

    @Test
    void getMax_br_studenata() {
    }

    @Test
    void getNiz() {
    }

    @Test
    void ispisSpisakStudenata() {
    }
}