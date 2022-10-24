package web.model;

public class Car {
    private String marka;
    private String model;
    private String color;



    public Car(String marka, String model, String color) {
        this.marka = marka;
        this.model = model;
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String age) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color=" +color +
                '}';
    }
}
