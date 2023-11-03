import java.util.Scanner;

class Prime {
  public static void main(String args[]) {
    Scanner vikas = new Scanner(System.in);
    int a[] = { 1, 3, 4, 6, 2, 7, 8, 44, 33 };
    for (int i = 0; i < a.length; i++) {
      int count = 0;
      for (int j = 1; j <= a.length; j++) {
        if (a[i] % j == 0) {
          count++;
        }
      }

      if (count == 2) {
        System.out.print("---------");
        System.out.println(a[i]);
      }
    }
  }

}
