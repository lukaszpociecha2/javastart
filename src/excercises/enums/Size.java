package excercises.enums;

public enum Size {
    LARGE("duży", "big"), MEDIUM("średni", "medium"), SMALL("mały", "small");

    private final String opis;
    private final String description;

    private Size(String opis, String description) {
        this.opis = opis;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getOpis() {
        return opis;
    }

    public static Size getSize(String description){
        Size size = null;
        for (Size s: values()
             ) {
            if(s.getDescription().equals(description))
                size = s;
        }
        return size;
    }
}
