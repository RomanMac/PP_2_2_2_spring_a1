package web.model;

public class Car {
    private String marka;
    private String model;
    private String age;

    public Car() {}

    public Car(String marka, String model, String age) {
        this.marka = marka;
        this.model = model;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
