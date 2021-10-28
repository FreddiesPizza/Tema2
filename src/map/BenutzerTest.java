package map;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {
    private Benutzer benutzer;

    public BenutzerTest(){}

    @BeforeEach public void setup(){
        Sport baschet = new Basketball();
        Sport fotbal = new Fussball();
        Sport maraton = new Hindernislauf();
        List<Sport> list = new ArrayList<>();
        list.add(baschet); list.add(fotbal); list.add(maraton);
        benutzer = new Benutzer("Andrei","Balu",list);
    }


    @org.junit.jupiter.api.Test
    void kalkuliereZeite() {
        //System.out.println("yes");
        assert(benutzer.kalkuliereZeite(new Fussball()) == 65);
        assert(benutzer.kalkuliereZeite(new Basketball()) == 55);
        assert(benutzer.kalkuliereZeite(new Hindernislauf()) == 30);
        assertEquals(benutzer.kalkuliereZeite(new Hochsprung()), 20);
        //System.out.println("no");
    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeite() {
        assert(benutzer.kalkuliereZeite() == 150);
    }

    @org.junit.jupiter.api.Test
    void kalkuliereDurschnittszeit() {
        assert(benutzer.kalkuliereDurschnittszeit() == 51);
        //assertEquals(benutzer.kalkuliereDurschnittszeit(), 51);
    }
}