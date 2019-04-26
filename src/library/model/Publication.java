package library.model;

import java.util.Objects;

public abstract class Publication {
    private String title;
    private int year;
    private String publisher;

    Publication(String title, int year, String publisher) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "title='" + title + ", publisher='" + publisher + ", year=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return getYear() == that.getYear() &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getPublisher(), that.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYear(), getPublisher());
    }
}
