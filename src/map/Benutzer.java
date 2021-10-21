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

    /**
     *
     * @return das gesammte Zeit fur alle Sports die der Benutzer treibt
     */
    public double kalkuliereZeite(){
        double zeit = 0;
        for(Sport i : sport){
            zeit += i.kalkuliereZeit();
        }
        return zeit;
    }

    /**
     *
     * @param sport der Benutzer gibt ein Sport an fur den er das Zeitdauer wissen will
     * @return
     */
    public double kalkuliereZeite(Sport sport){
        return sport.kalkuliereZeit();
    }

    /**
     *
     * @return arithmetisches mittel fur alle Sorts die der Benutzer treibt
     */
    public double kalkuliereDurschnittszeit(){
        return kalkuliereZeite() / sport.size();
    }
}
