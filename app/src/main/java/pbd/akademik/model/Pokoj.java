package pbd.akademik.model;

import io.realm.RealmObject;

/**
 * Created by maciej on 09.01.18.
 */
public class Pokoj extends RealmObject {
    public String numer;
    public int pietro;
    public int miejsca;
    public float cenaZaMiejsce;
    public boolean malzenski;
}