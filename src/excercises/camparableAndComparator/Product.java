package excercises.camparableAndComparator;

import java.util.function.Predicate;

public class Product implements Comparable<Product> {

    private String category;
    private String producer;
    private String name;

    public Product() {
    }

    public Product(String producer, String category, String name) {
        this.category = category;
        this.producer = producer;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", producer='" + producer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        int categoryCompare = this.getCategory().compareTo(o.getCategory());

        if (categoryCompare!=0) {
            return categoryCompare;

        } else if (categoryCompare==0){
            int producerCompare = this.getProducer().compareTo(o.getProducer());
            if(producerCompare!=0) return producerCompare;
        }

        return this.getName().compareTo(o.getName());


    }
}
