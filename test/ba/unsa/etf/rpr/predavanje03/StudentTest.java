package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void setBroj_indeksa() {
        Student s=new Student("Nadija", "Borovina", 18033);
        s.setBroj_indeksa(18067);
        assertEquals(18067,s.getBroj_indeksa() );

    }

    @Test
    void setIme() {
        Student s=new Student("Nadija", "Borovina", 18033);
        s.setIme("Didi");
        assertEquals("Didi",s.getIme() );
    }

    @Test
    void setPrezime() {
        Student s=new Student("Nadija", "Borovina", 18033);
        s.setPrezime("Micijevic");
        assertEquals("Micijevic",s.getPrezime() );
    }
    //Getere provjeravala u seterima
    @Test
    void getIme() {
    }

    @Test
    void getPrezime() {
    }

    @Test
    void getBroj_indeksa() {
    }

    @Test
    void toStringTest() {
        Student s =new Student("Nadija", "Borovina", 18067);
        assertEquals("Borovina Nadija (18067)",s.toString());
    }
}