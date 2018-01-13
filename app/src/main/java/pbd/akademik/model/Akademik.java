package pbd.akademik.model;

import io.realm.RealmObject;

/**
 * Created by maciej on 09.01.18.
 */
public class Akademik extends RealmObject{
    public String nazwa;
    public String kraj;
    public String kodPocztowy;
    public String ulica;
    public String budynek;
    public String lokal;
}
