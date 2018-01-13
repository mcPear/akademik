package pbd.akademik.model;

import io.realm.RealmObject;
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
}