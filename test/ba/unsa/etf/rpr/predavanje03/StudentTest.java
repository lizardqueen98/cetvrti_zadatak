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
    }

    @Test
    void setPrezime() {
    }

    @Test
    void getIme() {
    }

    @Test
    void getPrezime() {
    }

    @Test
    void getBroj_indeksa() {
    }

    /*@Test
    void toString() {
    }*/
}