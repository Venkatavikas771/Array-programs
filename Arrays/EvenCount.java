


import java.util.Scanner;

class EvenCount {
  public static void countAndPrintEven(int a[]) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        System.out.println("Even numbers are ;" + (a[i]));
        count++;
      }
    }
    System.out.println("The total even numbers are ;" + (count));
  }

  public static void main(String args[]) {
    Scanner cou = new Scanner(System.in);
    System.out.println("Enter the values");
    int a[] = new int[10];
    for (int i = 0; i < a.length; i++) {
      a[i] = cou.nextInt();

    }
    countAndPrintEven(a);
  }
}