package fun.code4.cjh.ch03;

/**
 * 以下程序的输出是什么?
* false,double类型D1de结果不是0.90而是无限趋近0.90 因为在进行运算时会丢失精度
 * 思考: 怎么比较两个浮点数呢? (Tips:从 double 类型的精度考虑)
 * 使用Big'Decimal 类型
 * double d1 = new double(0,11111);
 * double d = BigDecimal.valueOf(d1).setScale(3, RoundingMode.HALF_UP)//DecimalFormat四舍五入。;
*/
public class Test03 {
  public static void main(String[] args) {
    double d1 = 2.0-1.10;
    double d2 = 0.90;
    System.out.println(d1 == d2);
  }
}
