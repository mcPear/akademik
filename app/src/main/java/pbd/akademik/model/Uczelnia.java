package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;

/**
 * Created by maciej on 09.01.18.
 */
public class Uczelnia extends RealmObject {
    public float kwota;

    @LinkingObjects("uczelnia")
    public final RealmResults<Wydzial> wydzialy = null;
}