package pl.portalimprezowy.event;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue
    Integer id;

    @NotEmpty
    String nazwa;

    @NotEmpty
    Date data;

    @NotEmpty
    String miejsce;

    @NotNull
    User organizoator;

    @NotEmpty
    String opis;

    boolean dostep;

    @NotNull
    double cena;

    public Event(@NotEmpty String nazwa, @NotEmpty Date data, @NotEmpty String miejsce, @NotNull User organizoator, @NotEmpty String opis, boolean dostep, @NotNull double cena,
                 @NotNull Category kategoria,
                 List<User> uczestnicy, List<Comment> komentarze) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.organizoator = organizoator;
        this.opis = opis;
        this.dostep = dostep;
        this.cena = cena;
        this.kategoria = kategoria;
        this.uczestnicy = uczestnicy;
        this.komentarze = komentarze;
    }

    @NotNull

    Category kategoria;

    List<User> uczestnicy;

    List<Comment> komentarze;


}
