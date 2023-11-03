import java.util.Scanner;

class DeletionUsingOneArray {
  public static void main(String args[]) {
    Scanner vikas = new Scanner(System.in);
    int a[] = new int[10];
    for (int i = 0; i < a.length; i++) {
      a[i] = vikas.nextInt();

    }
    System.out.println("Enter the number to delete");
    int del = vikas.nextInt();
    System.out.println("Enter the position want to delete");
    int pos = vikas.nextInt();
    for (int i = 0; i < a.length; i++) {
      if (i == pos) {
        a[i] = a[i + 1];
      } else if (i > pos) {
        a[i] = a[i + 1];
      }

      else {
        a[i] = a[i];
      }
    }

    System.out.println("array elements after deletion");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
    }
  }
}