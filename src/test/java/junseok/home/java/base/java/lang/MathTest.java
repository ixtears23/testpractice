package junseok.home.java.base.java.lang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Module:java.base Package:Math.lang Class:Math")
public class MathTest {

    @Test
    @DisplayName("Double에 가장 가까운 PI 값")
    public void nothing() {
        assertThat(Math.PI).as("Double에 가장 가까운 PI 값").isEqualTo(3.141592653589793D);
    }

    @Test
    @DisplayName("int 덧셈 overflow 테스트")
    public void addExactTest() {

        int i = 1999999999 + 1999999999;
        System.out.println(i);
//        assertThat(Math.addExact(1999999999, 1999999999)).withFailMessage("실패다임마").info.description();
        assertThat(Math.addExact(5, 5))
                .describedAs("설명(describedAs)이라고 할까")
                .withFailMessage("실패(withFailMessage) 메세지")
                .isEqualTo(9);
    }

}
