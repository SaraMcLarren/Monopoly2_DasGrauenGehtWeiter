import java.util.ArrayList;

public class Ereignisse extends Feld {
    int typ;
    String text;
    ArrayList<Ereignisse> karte;

    public Ereignisse (String name, /*int position,*/ int typ, String text) {
        super(name/*, position*/);
        this.typ = typ;
        this.text = text;
        this.karte = new ArrayList <Ereignisse>();

        karte.add(new Ereignisse("Ereignisfeld",0, "Du hast das Tempolimit im Hyperraum überschritten. Zahle ein Bußgeld von §300."));
        karte.add(new Ereignisse("Ereignisfeld",1, "Steuerfeld! Zahle §100 am das allmächtige Imperium."));
        karte.add(new Ereignisse("Ereignisfeld",2, "Herzlichen Glückwunsch! Du wurdest zur Miss Wookie gewählt. Erhalte §210 als Preisgeld!"));
        karte.add(new Ereignisse("Ereignisfeld",3, "Du wurdest beim illegalen Handel mit Porgs erwischt! Gehe ins Gefängnis."));
        karte.add(new Ereignisse("Ereignisfeld",4, "Die Rebellen sind gekommen und haben dich befreit! Entkomme dem Gefängnis."));
        karte.add(new Ereignisse("Ereignisfeld",5, "Durch ein Loch im Raum-Zeit-Kontinuum fliegt dein Schiff schneller als sonst. Du rückst auf Los vor."));
        karte.add(new Ereignisse("Ereignisfeld",6, "Alarm! It's a trap! Gehe drei Felder zurück."));
        karte.add(new Ereignisse("Ereignisfeld",7, "Schnell sein, du musst. Rücke vier Felder vor."));
    }

}
