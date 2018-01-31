public class Werk extends Strasse {

    public Werk(String name, /*int position,*/, Spieler besitzer, int wert, int miete_original) {
        super(name,/* position,*/ besitzer, wert, miete_original);
    }

    public void setMiete(int miete_original, Spieler besitzer) {
        if (/*BESITZER HAT BEIDER WERKE, DIE BONZE*/) {
            this.miete = (int) ((Math.random()*6+1)+(Math.random()*6+1))*10;
        }
        else {
            this.miete = (int) ((Math.random()*6+1)+(Math.random()*6+1))*4;
        }
    }

    public void baueSiedlung(int siedlungen, int stadt) {
        System.out.println("Dies ist ein Raumschiff. Auf einem Raumschiff können keine Siedlungen errichtet werden. Viel zu lernen du noch hast, junger Padawan.");
    }

    public void zerstoereSiedlung(int siedlungen, int stadt) {
        System.out.println("Du kannst dieses Raumschiff nicht zerstören, ihre Schutzschilde sind zu stark.");
    }

}
