import java.util.Arrays;
import java.util.Collections;

class quickSort {
  static int partition(Integer[] a, int low, int high) {
    int i = low;
    int j = low;
    while (i < high) {
      if (a[i] < a[high]) {
        var m = a[i];
        a[i] = a[j];
        a[j] = m;
        j++;
      }
      i++;
    }

    var t = a[j];
    a[j] = a[high];
    a[high] = t;
    return j;
  }

  static void devide(Integer[] a, int low, int high) {
    if (low >= high) return;
    int mid = partition(a,low,high);
    devide(a, low, mid-1);
    devide(a, mid+1, high);

  }

  public static void main(String[] args) {
    var n = 7;
    var a = new Integer[n];
    for (var i = 0; i < n; i++) {
      a[i] = i;
    }
    Collections.shuffle(Arrays.asList(a));

    for (var i : a) {
      System.out.printf("%3d", i);
    }

  System.out.println();

  devide(a, 0, n-1);

  for (var i : a) {
    System.out.printf("%3d", i);
  }
  System.out.println();
  }
}