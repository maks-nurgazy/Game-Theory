package com.luv2code.gametheory;

import android.os.Parcel;
import android.os.Parcelable;

public class Topic implements Parcelable {

    String name;
    String video;
    String link;

    Topic(String name,String video,String link){
        this.name = name;
        this.video = video;
        this.link = link;
    }

    private Topic(Parcel in) {
        name = in.readString();
        video = in.readString();
        link = in.readString();
    }

    public static final Creator<Topic> CREATOR = new Creator<Topic>() {
        @Override
        public Topic createFromParcel(Parcel in) {
            return new Topic(in);
        }

        @Override
        public Topic[] newArray(int size) {
            return new Topic[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(video);
        dest.writeString(link);
    }
}
