import static org.junit.Assert.*;

public class SolarDoomsdayTest {

  @org.junit.Test
  public void answer() {
    assertArrayEquals(new int[]{9, 1, 1, 1}, SolarDoomsday.answer(12));
    assertArrayEquals(new int[]{15129, 169, 25, 1}, SolarDoomsday.answer(15324));
  }
}