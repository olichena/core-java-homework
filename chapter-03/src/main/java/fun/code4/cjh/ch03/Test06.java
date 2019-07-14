package fun.code4.cjh.ch03;

/**
 * 下面程序输出是什么? 为什么?
 * 条件成立 再输出I：-1
 * FALSE||TRUE&&TRUE
 * &&的优先级高于|| 所以先算与后或
 */
public class Test06 {
  public static void main(String[] args) {
    int i = 0;
    if (i-- + 2 * (i) < -3 || ++i == 0 && --i == -1) {
      System.out.println("条件成立!");
    } else {
      System.out.println("条件不成立!");
    }
    System.out.println("i 的值是: " + i);
  }
}
