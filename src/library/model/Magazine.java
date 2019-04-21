package library.model;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        setTitle(title);
        setYear(year);
        this.month = month;
        this.day = day;
        this.language = language;
        setPublisher(publisher);
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

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getYear() + "-"
                + month + "-" + day + "; " + language;
        System.out.println(info);
    }

}
