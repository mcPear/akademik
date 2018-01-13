package pbd.akademik.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

import java.util.Date;

/**
 * Created by maciej on 09.01.18.
 */
public class Wniosek extends RealmObject {
    @Required
    public Date dataRozpatrzenia;
    @Required
    public Date dataZlozenia;
    public boolean stypendiumSocjalne;
    public float dochodNaOsobe;
    public float odlegloscOdUczelni;
    public int sumaSemestrow;
    public boolean mieszkamWAkademiku;
    public boolean malzenstwo;
    public int dzieci;
    @Required
    public String dzialalnoscStudencka;
    @Required
    public String album;
    @Required
    public String kraj;
    @Required
    public String kodPocztowy;
    @Required
    public String ulica;
    @Required
    public String budynek;
    @Required
    public String lokal;

    public Miasto miasto;
    public Uzytkownik student;
    public Uzytkownik pracownik;
    public Pokoj pokoj;
    public Wydzial wydzial;
    public RealmList<Okres> okresy;

    @LinkingObjects("wniosek")
    public final RealmResults<Platnosc> platnosci = null;

    @LinkingObjects("wniosek")
    public final RealmResults<Okres> okresyLinking = null;
}