public class Bubblesort {

  public static void main(String[] args) {
    int a[] = { 43, 56, 2, 32, 876, 23 };
    int n = a.length;
    int temp = 0;
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
