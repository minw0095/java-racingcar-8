package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Stream;

public class InputSystem {


    public List<String> getNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return validateName(Console.readLine());
    }

    public int getNumberInput() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return validateNumber(Console.readLine());
    }

    private int makeNumber(String number) {
        return Integer.parseInt(number);
    }

    private int validateNumber(String number) {
        try {
            validatePositiveNumber(number);
            return makeNumber(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("문자가 아닌 숫자를 적어주세요");
        }
    }

    private void validatePositiveNumber(String number) {
        if (makeNumber(number) < 1) {
            throw new IllegalArgumentException("0보다 큰 수를 적어주세요");
        }
    }

    private List<String> validateName(String name) {
        if (Stream.of(name.split(",")).anyMatch(e -> e.length() > 5)) {
            throw new IllegalArgumentException("이름을 5자 이하로 입력해주세요");
        }
        return List.of(name.split(","));
    }

}
