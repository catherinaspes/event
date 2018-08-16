package pl.portalimprezowy.event;

import java.util.Date;

public class Comment {

    User uzytkownik;
    String tresc;
    Date dataDodania;

    public Comment(User uzytkownik, String tresc, Date dataDodania) {
        this.uzytkownik = uzytkownik;
        this.tresc = tresc;
        this.dataDodania = dataDodania;
    }
}
