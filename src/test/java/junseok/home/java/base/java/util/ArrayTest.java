package junseok.home.java.base.java.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

@DisplayName("ArrayTest")
public class ArrayTest {

    @Test
    @DisplayName("a보다 b가 크다")
    public void asList() {

        HashMap<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("a", 1);
        m1.put("b", 2);

        List<Map<String, Integer>> list = Arrays.asList(m1);

        Integer a = list.stream().findFirst().get().get("a");
        Integer b = list.stream().findFirst().get().get("b");

        assertThat(b).isGreaterThan(a);
    }

    @Test
    @DisplayName("배열 비교")
    public void notiong() {

        int[] arr = { 1, 2, 3};

        int[] arr2 = new int[3];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        assertThat(arr2).isEqualTo(arr);
    }
}
