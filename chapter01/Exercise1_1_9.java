/**
 * 1.1.8 
 */

 class Exercise1_1_9 {

  public static void main(String args[]) {
    String s = Integer.toBinaryString(1000);

    System.out.println(s);

    // https://zh.wikihow.com/%E4%BB%8E%E5%8D%81%E8%BF%9B%E5%88%B6%E8%BD%AC%E6%8D%A2%E4%B8%BA%E4%BA%8C%E8%BF%9B%E5%88%B6
    String t = "";
    int n = 1000;
    while (n > 0) {
      t = (n % 2) + t;
      n = n / 2;
    }
    System.out.println(t);

  }


 }