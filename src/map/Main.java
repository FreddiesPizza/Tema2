package map;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sport baschet = new Basketball();
        Sport fotbal = new Fussball();
        Sport maraton = new Hindernislauf();
        List<Sport> list = new ArrayList<>();
        list.add(baschet); list.add(fotbal); list.add(maraton);
        Benutzer user1 = new Benutzer("Andrei","Balu",list);

        Testing();

        Sport jump = new Hochsprung();
        System.out.println(user1.kalkuliereZeite());
        System.out.println(user1.kalkuliereZeite(jump));
        System.out.println(user1.kalkuliereZeite(fotbal));
        System.out.println(user1.kalkuliereDurschnittszeit());

    }

    public static void Testing(){
        BenutzerTest test = new BenutzerTest();
        test.setup();
        test.kalkuliereZeite();
        test.testKalkuliereZeite();
        test.kalkuliereDurschnittszeit();
    }
}
