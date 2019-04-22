package library.model;

import java.util.Objects;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        super(title, year, publisher);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getLanguage() {
        return language;
    }


    @Override
    public String toString() {
        return super.toString() + "-"
                + month + "-" + day + "; " + language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return getMonth() == magazine.getMonth() &&
                getDay() == magazine.getDay() &&
                Objects.equals(getLanguage(), magazine.getLanguage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMonth(), getDay(), getLanguage());
    }
}


