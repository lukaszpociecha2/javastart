package excercises.object;

import java.util.Objects;

public class Computer {

    private String producer;
    private String model;

    public Computer(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(producer, computer.producer) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    @Override
    public String toString() {
        return "Computer: " +
                "producer='" + producer +
                ", model='" + model;
    }
}
