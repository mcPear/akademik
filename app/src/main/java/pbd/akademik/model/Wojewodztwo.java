package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Wojewodztwo extends RealmObject {
    @Required
    public String nazwa;

    @LinkingObjects("wojewodztwo")
    public final RealmResults<Powiat> powiaty = null;
}
