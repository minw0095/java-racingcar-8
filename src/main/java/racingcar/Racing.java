package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;


public class Racing {

    private int number;
    private final Cars cars;

    public Racing(int number, Cars cars) {
        this.number = number;
        this.cars = cars;
    }

    private int makeRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public void race() {
        List<Car> racingCars = cars.getCars();

        while (number > 0) {
            for (Car car : racingCars) {
                car.move(makeRandomNumber());
                System.out.println(car);

            }
            System.out.println();
            number--;
        }

        cars.findWinnersName();
    }

}
