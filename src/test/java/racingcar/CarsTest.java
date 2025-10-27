package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    @DisplayName("중복된 이름에 대한 테스트")
    void sameName() {
        List<String> names = List.of("aa","aa","bb");

        assertThatThrownBy(()-> new Cars(names))
                .isInstanceOf(IllegalArgumentException.class);
    }
  
}
