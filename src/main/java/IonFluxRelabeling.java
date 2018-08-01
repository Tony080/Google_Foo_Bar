import java.util.HashMap;
import java.util.Map;

public class IonFluxRelabeling {
  private static int number;
  public static int[] answer(int h, int[] q) {
    Map<Integer, Integer> tree = buildPerfectBinaryTreeMap(h);
    int[] result = new int[q.length];
    for (int i = 0; i < q.length; i++) {
      result[i] = tree.get(q[i]);
    }
    return result;
  }

  private static Map<Integer, Integer> buildPerfectBinaryTreeMap(int h) {
    int length = (int)(Math.pow(2, h) - 1);
    Map<Integer, Integer> map = new HashMap<>();
    number = 1;
    helper(map, 0, length);
    map.put(length, -1);
    return map;
  }

  private static int helper(Map<Integer, Integer> map, int pos, int length) {
    if ((pos * 2 + 1) < length) {
      int left = helper(map, pos * 2 + 1, length);
      number++;
      int right = helper(map, pos * 2 + 2, length);
      number++;
      map.put(left, number);
      map.put(right, number);
    }
    return number;
  }
}
