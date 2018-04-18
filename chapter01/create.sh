#!/bin/zsh

 javaContent=$(cat << EOF
 class Exercise1_$1 {

  public static void main(String args[]) {

    System.out.println();

  }


 }
EOF
)

echo $javaContent > Exercise1_"$1".java