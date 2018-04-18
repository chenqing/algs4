/**
 * 1.1.8 
 */

 class Exercise1_1_10 {

  public static void main(String args[]) {
    // 正确使用数组的做法是
    // 1. 声明数组
    int []a;

    // 2. 创建数组
    a = new int[10];

    // 3. 初始化数组元素

    for (int i = 0 ; i < 10; i++) {
      a[i] = i * i;
    }

    System.out.println(a[5]);

  }


 }