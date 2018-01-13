package pbd.akademik.model;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.Required;

/**
 * Created by maciej on 09.01.18.
 */
public class Pokoj extends RealmObject {
    @Required
    public String numer;
    public int pietro;
    public int miejsca;
    public float cenaZaMiejsce;
    public boolean malzenski;

    public Akademik akademik;

    @LinkingObjects("pokoj")
    public final RealmResults<Wniosek> wnioski = null;
}