public class Spieler {
    String name;
    //int reihenfolge;
    int vermoegen;
    int position;
    Feld besitzer;

    public Spieler (String name, int vermoegen, int position) {
        this.name = name;
        this.vermoegen = vermoegen;
        this.position = 1;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getStandort() {
        return this.position;
    }
    public void setStandort(int position) {
        this.position = this.position + (int)((Math.random()*6+1)*(Math.random()*6+1));
    }

    public int getVermoegen() {
        return this.vermoegen;
    }

    public void setVermoegen(int vermoegen) {
        this.vermoegen = vermoegen;
    }

    public void kaufeFeld(Feld feld, int vermoegen) { //IN DER MAIN GEBPRÜFT; OB FELD FREI IST ODER NICHT
        if (this.vermoegen <= this.getStandort().indexOf().)

    }



}

