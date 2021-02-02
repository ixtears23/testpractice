package junseok.home;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    /*
    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }
     */

    @Test
    void subtraction() {
        assertThat(2).isEqualTo(calculator.subtract(5, 3));
    }



}
