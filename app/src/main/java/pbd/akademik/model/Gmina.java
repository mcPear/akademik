package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Gmina extends RealmObject{
    @Required
    public String nazwa;
    public Powiat powiat;

    @LinkingObjects("gmina")
    public final RealmResults<Miasto> miasta = null;
}
