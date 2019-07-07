package fun.code4.cjh.ch03;

/**
 * 下列程序会输出什么? 为什么?
 */
public class Test05 {

  private static void method(Integer i, Double d) {
    System.out.println("1!");
  }

  private static void method(int i, Double d) {
    System.out.println("2!");
  }

  private static void method(int i, double d) {
    System.out.println("3!");
  }

  private static void method(Integer i, double d) {
    System.out.println("4!");
  }

  private static void method(Integer i, Float d) {
    System.out.println("5!");
  }


  private static void method(int i, Float d) {
    System.out.println("6!");
  }
//
//  private static void method(int i, float f) {
//    System.out.println("7!");
//  }

  private static void method(Integer i, float f) {
    System.out.println("8!");
  }

  public static void main(String[] args) {
    int i = 10;
    float f = 10.0f;
    double d = 10.0;
    method(i, d);
    method(i, f);
  }
}
