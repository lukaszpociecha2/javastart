package excercises.enums;

public enum Pizza {

    MARGHERITA("sos pomidorowy", "ser", null, null), CAPRICIOSA("sos pomidorowy", "ser", "pieczarki", null),
    PROSCIUTTO("sos pomidorowy", "ser", null, "szynka");

    private final String tomatoSauce; // = "sos pomidorowy";
    private final String cheese; // = "ser";
    private final String mushrooms; // = "pieczarki";
    private final String ham;// = "szynka";

    Pizza(String tomatoSauce, String cheese, String mushrooms, String ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        Pizza pizza = this;
        String result= "";
        switch (pizza) {
            case CAPRICIOSA:
                result = name() + ", składniki: " +
                        tomatoSauce +
                        ", " + mushrooms;

            break;
            case MARGHERITA:
                result = name() + ", składniki: " +
                        tomatoSauce +
                        ", " + cheese;
            break;
            case PROSCIUTTO:
                result = name() + ", składniki: " +
                        tomatoSauce +
                        ", " + cheese +
                        ", " + ham;
            break;
        }
        return result;
    }

    public static Pizza getPizzaType(String pizzaType) {
        for (Pizza p : Pizza.values()
        ) {
            if (p.name().equals(pizzaType)) {
                return p;
            }
        }
        return null;
    }
}
