import org.junit.Test;

import static org.junit.Assert.*;

public class IonFluxRelabelingTest {

  @Test
  public void answer() {
    int[] result1 = IonFluxRelabeling.answer(3, new int[] {7, 3, 5, 1});
    assertArrayEquals(new int[] {-1, 7, 6, 3}, result1);

    int[] result2 = IonFluxRelabeling.answer(5, new int[] {19, 14, 28});
    assertArrayEquals(new int[] {21, 15, 29}, result2);
  }
}