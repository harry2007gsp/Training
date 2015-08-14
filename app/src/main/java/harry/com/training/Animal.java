package harry.com.training;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Harry on 7/22/15.
 */
public class Animal implements Parcelable{
    private int hands, legs;

    public Animal() {
        legs = 4;
        hands = 2;
    }
    public Animal(int legs, int hands) {
        this.legs = legs;
        this.hands = hands;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(hands);
        dest.writeInt(legs);
    }

    private Animal(Parcel in) {
        hands = in.readInt();
        legs = in.readInt();
    }

    public static final Parcelable.Creator<Animal> CREATOR
            = new Parcelable.Creator<Animal>() {
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };
}
