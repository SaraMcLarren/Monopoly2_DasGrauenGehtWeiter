public class Strasse {
    String name;
    int wert;
    int miete_original;
    int siedlungen;
    int stadt;
    String besitzer;
    int miete;

    public Strasse (String name/*, int position*/, String besitzer, int wert, int miete_original) {
        //super(name, /*, position);
        this.name = name;
        this.wert = wert;
        this.miete_original = miete_original;
        this.miete = miete_original;
        this.besitzer = null;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
    public int getWert() {
        return this.wert;
    }
    public void setMiete(int miete_original, int siedlungen, int stadt) {
        if (siedlungen > 0) {
            this.miete = this.miete_original + (this.miete_original * (this.wert / 10) * this.siedlungen);
        }
        if (stadt != 0) {
            this.miete = this.wert * 11;
        } else {
            this.miete = this.miete_original;
        }
    }
    public int getMiete() {
        return this.miete;
    }

// ZU HAUSBAU UND ABBRUCH MUSS NOCH DIE GELD KOMPOMNENTE DER SPIELER
    public void baueSiedlung(int siedlungen, int stadt) {
        if(this.siedlungen < 5 && stadt == 0) { //Hausbau
            this.siedlungen = this.siedlungen + 1;
        }
        if (this.siedlungen == 0 && this.stadt ==1) {
            System.out.println("Hier können leider keine weiteren Zivilisationen errichtet werden.");
        }
        if (this.siedlungen == 5) { //Hotelbau
            this.siedlungen = 0;
            this.stadt = 1;
        }
        else {
            System.out.println("Fehler Siedlungsbau");
        }
    }

    public void zerstoereSiedlung(int siedlungen, int stadt) {
        if(this.siedlungen == 0 && this.stadt == 1) {
            this.siedlungen = 4;
            this.stadt = 0;
        }
        if (this.siedlungen > 0) {
            this.siedlungen = this.siedlungen - 1;
        }
        if (this.siedlungen == 0 && this.stadt == 0) {
            System.out.println("Hier können keine Zivilisationen zerstört werden.");
        }
        else {
            System.out.println("Fehler Siedlungsabbruch");
        }
    }

    public void setBesitzer(int position, String besitzer, Spieler spieler) {
        this.besitzer = spieler.getName();
    }

    public String getBesitzer() {
        return this.besitzer;
    }
}
