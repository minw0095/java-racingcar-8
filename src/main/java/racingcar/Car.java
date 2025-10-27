package racingcar;

import java.util.List;
import java.util.stream.Stream;

public class Car {

    private final String name;
    private int forward;

    public Car(String name) {
        this.name = name;
        validateName(name);
    }

    public void move(int number) {
        if(number > 3){
            forward++;
        }
    }

    public int getForward(){
        return forward;
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름을 5자 이하로 입력해주세요");
        }

        if(name.isBlank()){
            throw new IllegalArgumentException("공백은 안됩니다.");
        }
    }


    @Override
    public String toString() {
        return name + " : " + "-".repeat(forward);
    }
}
