package pbd.akademik.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Required;

import java.util.Date;

/**
 * Created by maciej on 09.01.18.
 */
public class Okres extends RealmObject {
    @Required
    public Date data;

    public RealmList<Wniosek> wnioski;
    public RealmList<Platnosc> platnosci;
}