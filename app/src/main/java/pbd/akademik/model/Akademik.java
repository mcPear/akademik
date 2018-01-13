package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Akademik extends RealmObject{
    @Required
    public String nazwa;
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
    public Uzytkownik administrator;
}
