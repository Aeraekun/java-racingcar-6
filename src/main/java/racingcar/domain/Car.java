package racingcar.domain;

public class Car {
    private final String name;
    private String lab;

    public Car(String name, String lab) {
        this.name = name;
        this.lab = lab;
    }

    public String getName() {
        return name;
    }

    public String getLab() {
        return lab;
    }

    public void plusLab() {
        lab = lab.concat("-");
    }
}
