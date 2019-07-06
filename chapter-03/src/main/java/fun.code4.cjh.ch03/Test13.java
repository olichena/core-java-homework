package fun.code4.cjh.ch03;

/**
 * 求两个数组的交集, 并集 和 差集
 */
public class Test13 {

  /**
   * 交集, 即在 A 中也在 B 中
   * @param a 集合 A
   * @param b 集合 B
   * @return 交集
   */
  private static int[] getIntersection(int[] a, int[] b) {

    return null;
  }

  /**
   * 并集, 在 A 中或者 在 B 中
   * @param a 集合 A
   * @param b 集合 B
   * @return 并集
   */
  private static int[] getUnionSet(int[] a, int[] b) {

    return null;
  }

  /**
   * 差集, A-B 代表 在 A 中却不再 B 中. B-A 代表, 在 B 中却不再 A 中.
   * @param a 集合 A
   * @param b 集合 B
   * @return 差集
   */
  private static int[] getDiffSet(int[] a, int [] b) {

    return null;
  }

  public static void main(String[] args) {
    int[] a = {
        34, 45, 45, 67,
        23, 84, 20, 38,
        93, 59, 13, 48,
        83, 74, 72, 28
    };
    int[] b = {
        34, 45, 45, 67,
        23, 86, 20, 38,
        93, 52, 13, 48,
        83, 71, 72, 28
    };

    System.out.println(getIntersection(a, b));
    System.out.println(getUnionSet(a, b));
    System.out.println(getDiffSet(a, b));
    System.out.println(getDiffSet(b, a));
  }
}
