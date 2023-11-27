package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.view.constant.ErrorMessage.*;
import static racingcar.view.constant.InputMessage.*;
import static racingcar.view.constant.OutputMessage.*;

public class InputView {
    List<Car> tempCar = new ArrayList<>();
    Lab lab = null;

    public List<Car> inputCar() {
        System.out.println(CAR);
        try {
            String[] cars = readLine().split(COMMA);
            CarValidate(cars);
            for (String car : cars) {
                tempCar.add(new Car(car, ""));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR);
            tempCar.clear();
            inputCar();
        }
        return tempCar;
    }

    private void CarValidate(String[] cars) {
        Set<String> names = new HashSet<>();
        for (String car : cars) {
            if (names.contains(car) || car.length() > 5) {
                throw new IllegalArgumentException(ERROR);
            }
            names.add(car);
        }
    }

    public Lab inputLab() {
        System.out.println(LAB);
        try {
            lab = new Lab(Integer.parseInt(readLine()));
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR);
            inputLab();
        }
        return lab;
    }
}
