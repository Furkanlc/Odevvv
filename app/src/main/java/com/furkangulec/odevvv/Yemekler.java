package com.furkangulec.odevvv;

import android.os.Parcel;
import android.os.Parcelable;

public class Yemekler implements Parcelable {

    String yemekad;
    int fiyat;

    public Yemekler(String yemekad, int fiyat) {
        this.yemekad = yemekad;
        this.fiyat = fiyat;
    }

    protected Yemekler(Parcel in) {
        yemekad = in.readString();
        fiyat = in.readInt();
    }

    public static final Creator<Yemekler> CREATOR = new Creator<Yemekler>() {
        @Override
        public Yemekler createFromParcel(Parcel in) {
            return new Yemekler(in);
        }

        @Override
        public Yemekler[] newArray(int size) {
            return new Yemekler[size];
        }
    };

    public String getYemekad() {
        return yemekad;
    }

    public void setYemekad(String yemekad) {
        this.yemekad = yemekad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Yemekler: '\n'"+"Yemek Adı :"+yemekad+'\n'+"Fiyat :"+fiyat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(yemekad);
        dest.writeInt(fiyat);
    }
}
