package pbd.akademik.model;

import io.realm.RealmObject;

/**
 * Created by maciej on 09.01.18.
 */
public class Uzytkownik extends RealmObject {
    public String imie;
    public String nazwisko;
    public String login;
    public String haslo;
}