package fun.code4.cjh.ch03;

/**
 * 完成 getBiggestNumber(), 其目的是找出数组中的最大元素和第二大元素, 并打印出来.
 * 要求只能有一层循环(while/for/foreach).
 */
public class Test10 {

  class Tuple<A, B> {
    private A first;
    private B second;
    Tuple(A a, B b) {
      this.first = a;
      this.second = b;
    }

    public A getFirst() {
      return first;
    }

    public B getSecond() {
      return second;
    }

    @Override
    public String toString() {
      return "Tuple{" +
          "first=" + first +
          ", second=" + second +
          '}';
    }
  }

  private static int[] vals = {
    34, 45, 45, 67,
    23, 84, 20, 38,
    93, 59, 13, 48,
    83, 74, 72, 28
  };

  private static Tuple<Integer, Integer> getBiggestNumber(int[] vals) {
    Tuple<Integer, Integer> result = null;
    // Your code is below this line:

    return result;
  }

  public static void main(String[] args) {
    System.out.println(getBiggestNumber(vals));
  }
}
