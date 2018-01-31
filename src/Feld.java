import java.util.*;
public class Feld {
    String name;
    int position;
    ArrayList<Object> aufbau;

    public Feld (String name /*,int position*/) {
        this.name = name;
        /*this.position = position;*/
        this.aufbau = new ArrayList<Object>();

        aufbau.add(new Ereignisse("LOS" , 1, "Du stehst auf LOS! Erhalte §200. Nutze es weise."));
        aufbau.add(new Strasse("Tatooine Dünenmeer", null, 60, 8)) ;
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Tatooine System", null, 60, 8));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Bahnhof("Raumschiff: Twilight", null, 200, 25));
        aufbau.add(new Strasse("Bothawui", null, 100, 16));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Ruusan Sparrenburg",null, 100, 16 ));
        aufbau.add(new Strasse("Abregado System", null, 120, 18 ));
        aufbau.add(new Ereignisse("Gefängnis",8,"Das Imperium hat dich gefasst. Du wurdest ins Gefängnis verschleppt. \n Zum Entkommen kannst du entweder zu Beginn deines nächsten Zugs die Wachen mit §50 bestechen, \n oder einen Pasch würfeln. \n Wenn zu Beginn der dritten Runde noch kein Pasch gewürfelt wurde, musst du §50 zahlen und weiterziehen."  ));
        aufbau.add(new Strasse("Rugosa", null, 140, 20));
        aufbau.add(new Werk("Skytop Station", null, 100, 1));
        aufbau.add(new Strasse("Toydaria System", null, 140, 20));
        aufbau.add(new Strasse("Rishi", null, 160, 22));
        aufbau.add(new Bahnhof("Raumschiff: Resolute", null, 200, 25));
        aufbau.add(new Strasse("Teth Festung", null, 180, 24));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Teth-Dschugel", null, 180, 24));
        aufbau.add(new Strasse("Teth System", null, 200, 28 ));
        aufbau.add(new Ereignisse("Frei Parken", 9, "Dein Raumschiff hat einen Marderschaden. Warte eine Runde auf die Reparaturcrew."));
        aufbau.add(new Strasse("Kalida Nebel", null, 220, 30));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Antar", null, 220, 30));
        aufbau.add(new Strasse("Rodia", null, 240, 32));
        aufbau.add(new Bahnhof("Malevolence", null, 200, 25 ));
        aufbau.add(new Strasse("Ryloth",null, 260, 34 ));
        aufbau.add(new Strasse("Florrum", null, 260, 34));
        aufbau.add(new Werk("Medizinische Raumstation", null, 100, 1));
        aufbau.add(new Strasse("Vassek", null, 280,36 ));
        aufbau.add(new Ereignisse("Erwischt!", 3, "Spacecakes sind auch im Weltall illegal. Gehe ins Gefängnis."));
        aufbau.add(new Strasse("Crystal City Plaza Center", null, 300, 38));
        aufbau.add(new Strasse("Crystal City", null, 300, 38));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Christophsis System", null, 320, 40));
        aufbau.add(new Bahnhof("Defender", null, 200, 25));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Ziros Palast", null,350, 44 ));
        aufbau.add(new Ereignisse[(int)(Math.random()*7+1)]);
        aufbau.add(new Strasse("Jabbas Palast", null, 400, 50 ));
    }

    /*public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
    */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
