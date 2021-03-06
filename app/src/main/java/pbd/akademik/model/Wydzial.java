package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Wydzial extends RealmObject {
    @Required
    public String nazwa;
    public Uczelnia uczelnia;

    @LinkingObjects("wydzial")
    public final RealmResults<Wniosek> wnioski = null;
}