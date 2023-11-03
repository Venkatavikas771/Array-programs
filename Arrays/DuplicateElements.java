import java.util.Scanner;

class Duplicate {
  public static void main(String args[]) {
    Scanner vikas = new Scanner(System.in);
    System.out.println("Enter the size");
    int size = vikas.nextInt();
    int a[] = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = vikas.nextInt();
    }
    System.out.println("Duplicate elements are");
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          System.out.println(a[i] + " ");
        }
      }
    }
  }
}