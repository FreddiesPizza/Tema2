package map;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

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
