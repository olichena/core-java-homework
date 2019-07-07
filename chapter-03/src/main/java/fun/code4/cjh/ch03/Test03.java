package fun.code4.cjh.ch03;

/**
 * 以下程序的输出是什么?
 * 思考: 怎么比较两个浮点数呢? (Tips:从 double 类型的精度考虑)
 */
public class Test03 {
  public static void main(String[] args) {
    double d1 = 2.0-1.10;
    double d2 = 0.90;
    System.out.println(d1 == d2);
  }
}
