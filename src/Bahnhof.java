public class Bahnhof extends Strasse {

    public Bahnhof(String name,/* int position, */, Spieler besitzer, int wert, int miete_original) {
        super(name,/* position,*/ besitzer, wert, miete_original);
    }

    public void setMiete(int miete_original, Spieler besitzer) {
        this.miete = 25*1;//ANZAHL DER BAHNHÖFE; DIE DER BESITZER BESITZT
    }

    public void baueSiedlung(int siedlungen, int stadt) {
        System.out.println("Dies ist ein Raumschiff. Auf einem Raumschiff können keine Siedlungen errichtet werden. Viel zu lernen du noch hast, junger Padawan.");
    }

    public void zerstoereSiedlung(int siedlungen, int stadt) {
        System.out.println("Du kannst dieses Raumschiff nicht zerstören, ihre Schutzschilde sind zu stark.");
    }



}
