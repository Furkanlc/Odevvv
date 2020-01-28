package com.furkangulec.odevvv;

import android.os.Parcel;
import android.os.Parcelable;

public class Sehir  implements Parcelable {
    String ad;
    int rakim;

    public Sehir(String ad, int rakim) {
        this.ad = ad;
        this.rakim = rakim;
    }

    protected Sehir(Parcel in) {
        ad = in.readString();
        rakim = in.readInt();
    }

    public static final Creator<Sehir> CREATOR = new Creator<Sehir>() {
        @Override
        public Sehir createFromParcel(Parcel in) {
            return new Sehir(in);
        }

        @Override
        public Sehir[] newArray(int size) {
            return new Sehir[size];
        }
    };

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getRakim() {
        return rakim;
    }

    public void setRakim(int rakim) {
        this.rakim = rakim;
    }

    @Override
    public String toString() {
        return "Sehir: '\n'"+"Sehir Adı :"+ad+'\n'+"Rakım :"+rakim;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ad);
        dest.writeInt(rakim);
    }
}
