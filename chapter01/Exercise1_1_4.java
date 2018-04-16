public class Exercise1_1_4 {

  public static void main(String args[]) {

    int a = 1;
    int b = 2;
    int c;

    // if (a > b) then c = 0; 语法错误
    if (a > b) c = 0;

    if ( a > b ) {
      c = 0;
    }

    if (a > b)  c = 0 ;   else b = 0;

    System.out.println(b);
  }
}
