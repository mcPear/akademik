package pbd.akademik.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Platnosc extends RealmObject {
    @Required
    public String nazwa;
    public Wniosek wniosek;
    public RealmList<Okres> okresy;

    @LinkingObjects("platnosci")
    public final RealmResults<Okres> okresyLinking = null;
}