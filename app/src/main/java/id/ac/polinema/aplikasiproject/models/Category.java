package id.ac.polinema.aplikasiproject.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Category implements Parcelable {
    private String category;

    public Category(String category) {
        this.category = category;
    }

    public Category() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.category);
    }

    protected Category(Parcel in) {
        this.category = in.readString();
    }

    public static final Creator<Category> CREATOR = new Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel source) { return new Category(source); }

        @Override
        public Category[] newArray(int size) { return new Category[size]; }
    };
}
