import java.util.Scanner;

class CopyingOneArrayToOther {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("enter the array elements");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println("array elements are");
    int b[] = new int[5];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
      System.out.println("The copied elements are");
      System.out.println(b[i]);
    }

  }

}
