package fun.code4.cjh.ch03;

/**
 * 以下代码(18-22)行为什么取消注释后报错? 怎么修正呢?
 */
public class Test01 {

  private static void convertTest() {

    byte b1 = Byte.MAX_VALUE;

    short s1 = b1;

    int i1 = s1;

    long l1 = i1;

//    (数据类型不同）
    i1 = (int) l1;

    s1 = (short)i1;

    b1 = (byte)s1;

  }

  public static void main(String[] args) {
    convertTest();
  }
}
