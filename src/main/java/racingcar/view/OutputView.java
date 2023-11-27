package racingcar.view;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.Lab;

import java.util.ArrayList;
import java.util.List;

import static racingcar.view.constant.OutputMessage.*;

public class OutputView {
    public void outputGame(List<Car> cars, Lab lab) {
        System.out.println(PRINT);
        for (int i = 0; i < lab.lab(); i++) {
            printCar(cars);
            System.out.println();
        }
    }

    private void printCar(List<Car> cars) {
        for (Car car : cars) {
            if (Randoms.pickNumberInRange(0, 9) > 3) {
                car.plusLab();
            }
            System.out.printf(GAME, car.getName(), car.getLab());
            System.out.println();
        }
    }

    public void outputResult(List<Car> cars) {
        int temp = 0;
        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            if (temp < car.getLab().length()) {
                temp = car.getLab().length();
            }
        }
        for (Car car : cars) {
            if (temp == car.getLab().length()) {
                winner.add(car.getName());
            }
        }
        printWinner(winner);
    }

    private void printWinner(List<String> winner) {
        System.out.println(WINNER + String.join(", ", winner));
    }
}
