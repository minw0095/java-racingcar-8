package racingcar;

public class Car {

    private final String name;
    private int forward;

    public Car(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return name + " : " + "-".repeat(forward);
    }
}
