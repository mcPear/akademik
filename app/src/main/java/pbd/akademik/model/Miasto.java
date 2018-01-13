package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Miasto extends RealmObject{
    @Required
    public String nazwa;
    public Gmina gmina;

    @LinkingObjects("miasto")
    public final RealmResults<Wniosek> wnioski = null;

    @LinkingObjects("miasto")
    public final RealmResults<Akademik> akademiki = null;
}
