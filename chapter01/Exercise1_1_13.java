 class Exercise1_1_13 {

  public static void main(String args[]) {

    int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
    int b[][] = new int[a[0].length][a.length];
    for (int j = 0; j < a.length; j++) {
      for (int i = 0 ; i < a[j].length; i++) {
        b[i][j] = a[j][i];
      }
    }

    for(int k = 0 ; k < b.length ; k++) {
      for(int m = 0 ; m < b[k].length ; m++) {
        System.out.print(b[k][m]);
      }
      System.out.println();

    }

  }


 }
