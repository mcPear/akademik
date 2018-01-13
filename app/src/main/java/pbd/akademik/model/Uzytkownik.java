package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Uzytkownik extends RealmObject {
    @Required
    public String imie;
    @Required
    public String nazwisko;
    @Required
    public String login;
    @Required
    public String haslo;
    @Required
    public String rola;

    @LinkingObjects("administartor")
    public final RealmResults<Akademik> akademiki = null;

    @LinkingObjects("student")
    public final RealmResults<Wniosek> wnioskiStudent = null;

    @LinkingObjects("pracownik")
    public final RealmResults<Wniosek> wnioskiPracownik = null;

}