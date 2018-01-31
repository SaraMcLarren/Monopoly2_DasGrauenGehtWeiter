public class Spieler {
    String name;
    //int reihenfolge;
    int vermoegen;
    int position;
    int zugAnzahl;
    //Spieler besitzer;

    public Spieler (String name, int vermoegen, int position, int zugAnzahl) {
        this.name = name;
        this.vermoegen = vermoegen;
        this.position = 0;
        this.zugAnzahl = 1;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //WO SICH DER SPIELER AUF DEM SPIELFELD BEFINDET (LOS = POSITION 1)
    public void setStandort(int position) {
        this.position = this.position + (int)((Math.random()*6+1)*(Math.random()*6+1));
        if(this.position > 39) {
            this.position = this.position - 39;
            this.zugAnzahl++;
        }
    }

    public int getStandort() {
        return this.position;
    }

    //WIE VIELE RUNDEN GESPIELT WORDEN SIND -> WICHTIG FÜR GEFÄNGNIS
    public int getZugAnzahl(){
        return this.zugAnzahl;
    }

    //VERMÖGEN DER EINZELNEN SPIELER
    public int getVermoegen() {
        return this.vermoegen;
    }

    public void setVermoegen(int vermoegen) {
        this.vermoegen = vermoegen;
    }

    //KAUFEN UND VERKAUFEN VON STRAßEN; BAHNHÖFEN UND WERKEN













    /*public void kaufeFeld( ) {
        if (this.getStandort().getBesitzer() != null) {
            if (this.getStandort().getBesitzer().equals(this.getName())) {
                System.out.println("Du besitzt dieses Feld bereits");
            }
            else {
                System.out.println("Jemand anderes besitzt dieses Feld bereits.");
                this.getStandort().getBesitzer().setVermoegen(this.getStandort().getBesitzer.getVermoegen() + this.getStandort().getMiete());
                this.setVermoegen(this.getVermoegen() - this.getStandort().getMiete());
            }
        }
        else System.out.println("Du kannst diesen Planeten nicht kaufen.");
    }

    */

}

