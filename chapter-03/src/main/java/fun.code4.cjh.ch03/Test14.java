package fun.code4.cjh.ch03;

/**
 * 做一个自动扩容的数组, IntArray 类
 *
 * IntArray 内部会包含一个数组(初始大小16).
 *
 * add方法:
 * 当 数组没满的时候, 可以继续放新的元素
 * 当 数组满的时候, 则需要申请一个(当前大小两倍大的)新数组, 并将老数组的内容拷贝过来
 *
 * get方法:
 * 根据下标取得数组中对应下标的值.
 *
 * size方法:
 * 获取当前数组的大小
 */
public class Test14 {
  interface IIntArray {
    void add(int val);
    int get(int index);
    int size();
  }

  class IntArray implements IIntArray {

    @Override
    public void add(int val) {

    }

    @Override
    public int get(int index) {
      return 0;
    }

    @Override
    public int size() {
      return 0;
    }
  }
}
