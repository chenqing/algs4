public class Exercise1_1_3 {

  public static void main(String args[]) {

    int len = args.length;

    if ( len != 3) {
      System.out.println("need three number input");
    }
    
    int number01 = Integer.parseInt(args[0]);
    int number02 = Integer.parseInt(args[1]);
    int number03 = Integer.parseInt(args[2]);

    if (number01 == number02 && number02 == number03) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }

  }
}
