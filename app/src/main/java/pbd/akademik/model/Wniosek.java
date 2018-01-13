package pbd.akademik.model;

import io.realm.RealmObject;

/**
 * Created by maciej on 09.01.18.
 */
public class Wniosek extends RealmObject {
    public Data dataRozpatrzenia;
    public Data dataZlozenia;
    public boolean stypendiumSocjalne;
    public float dochodNaOsobe;
    public float odlegloscOdUczelni;
    public int sumaSemestrow;
    public boolean mieszkamWAkademiku;
    public boolean malzenstwo;
    public int dzieci;
    public String dzialalnoscStudencka;
    public String album;
    public String kraj;
    public String kodPocztowy;
    public String ulica;
    public String budynek;
    public String lokal;
}