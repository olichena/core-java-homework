package fun.code4.cjh.ch03;

/**
 * 解释一下程序的输出结果!
 */
public class Test02 {
  public static void main(String[] args) {
    int val = Integer.MAX_VALUE;//Integer.MAX_VALUE的值是0x7FFFFFFF转换成二进制是0111 1111 1111 1111 1111 1111 1111 1111 超过val的32位的范围-2147483648（-2^31）~2147483647(2^31-1)
    val = val + 1;//但我不懂为啥是负的
    System.out.println(val);
  }
}
