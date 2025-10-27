package racingcar;

public class RaceController {


    public void run() {
        InputSystem inputSystem = new InputSystem();

        Cars cars = new Cars(inputSystem.getNameInput());
        Racing racing = new Racing(inputSystem.getNumberInput(),cars);
        racing.race();
    }

}
