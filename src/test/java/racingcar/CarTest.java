package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {
    
    @DisplayName("빈 이름에 대한 검증")
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    void blankName(String name) {
        
        assertThatThrownBy(()-> new Car(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
