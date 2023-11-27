package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Lab;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void start() {
        List<Car> cars = getCars();
        Lab lab = getLabs();
        printGame(cars, lab);
        printResult(cars);
    }

    private List<Car> getCars() {
        return inputView.inputCar();
    }

    private Lab getLabs() {
        return inputView.inputLab();
    }

    private void printGame(List<Car> cars, Lab lab) {
        outputView.outputGame(cars, lab);
    }

    private void printResult(List<Car> cars) {
        outputView.outputResult(cars);
    }
}
