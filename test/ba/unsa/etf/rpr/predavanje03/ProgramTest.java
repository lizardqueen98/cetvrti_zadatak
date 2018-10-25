package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void main() {
        Student s=new Student("Nadija", "Borovina", 18067);
        assertEquals("Borovina Nadija (18067)", s.toString());
    }
}