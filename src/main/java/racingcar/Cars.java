package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<String> names;

    public Cars(List<String> names) {
        this.names = names;

    }

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(new Car(name));
        }

        return cars;
    }

    private int findBestScore() {
        return getCars().stream().mapToInt(Car::getForward).max().orElseThrow();
    }

    public List<Car> findWinners() {
        return getCars().stream().filter(e -> e.getForward() == findBestScore()).collect(Collectors.toList());
    }

    public void findWinnersName() {
        List<String> tt = new ArrayList<>();
        for (Car car : findWinners()) {
            tt.add(car.getName());
        }
        System.out.println("최종 우승자 : " + String.join(", ", tt));

    }

}
