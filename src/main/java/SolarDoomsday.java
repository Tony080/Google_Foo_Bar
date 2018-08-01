import java.util.ArrayList;
import java.util.List;

public class SolarDoomsday {
  public static int[] answer(int area) {
    List<Integer> list = new ArrayList<>();
    while (area != 0) {
      int part = (int)Math.sqrt(area);
      int size = part * part;
      area -= size;
      list.add(size);
    }

    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}
