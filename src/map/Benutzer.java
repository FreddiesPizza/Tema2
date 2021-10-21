package map;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public double kalkuliereZeite(){
        double zeit = 0;
        for(Sport i : sport){
            zeit += i.kalkuliereZeit();
        }
        return zeit;
    }

    public double kalkuliereZeite(Sport sport){
        return sport.kalkuliereZeit();
    }

    public double kalkuliereDurschnittszeit(){
        return kalkuliereZeite() / sport.size();
    }
}
