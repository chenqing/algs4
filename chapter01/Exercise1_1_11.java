 class Exercise1_1_11 {

  public static void main(String args[]) {

    // 创建二维数组
    boolean a[][] = {{true, false}, {false, true, true}, {false, true}};

    for(int i = 0; i < a.length; i++) {
      for (int j=0; j < a[i].length; j++) {

        if(a[i][j]) {
          System.out.println("a["+i+"]["+j+"]*");
        } else {
          System.out.println("a["+i+"]["+j+"] ");
        }
      }
    }
  }


 }
