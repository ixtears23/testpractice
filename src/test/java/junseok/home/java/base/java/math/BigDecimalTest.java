package junseok.home.java.base.java.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

@DisplayName("BigDecimalTest")
public class BigDecimalTest {

    @Test
    @DisplayName("assertj의 isOne() 비교")
    public void one00() {
        assertThat(BigDecimal.ONE).isOne();
    }

    @Test
    @DisplayName("assertj의 isEqualTo() 비교")
    public void one01() {
        assertThat(BigDecimal.ONE).isEqualTo(new BigDecimal(1));
    }

    @Test
    @DisplayName("assertj의 isZero() 비교")
    public void zero00() {
        assertThat(BigDecimal.ZERO).isZero();
//        fail("쓸대없이 fail 발생!!");
    }

    @Test
    @DisplayName("assertj의 isEqualByComparingTo() 비교")
    public void zero01() {
        assertThat(BigDecimal.ZERO).isEqualByComparingTo(new BigDecimal(0));
    }

}
