import java.util.Arrays;
import java.util.Collections;

class MergeSort {
  static void devide_t(Integer[] a, int low, int high) {
    if(low >= high) return;
    int mid = (low+high) / 2;
    devide_t(a, low, mid);
    devide_t(a, mid+1, high);
    
    var t = new Integer[high-low+1];
    var i = low;
    var j = mid+1;
    var k = 0;
    while (i <= mid && j <= high) {
      if (a[i] < a[j]) t[k++] = a[i++];
      else t[k++] = a[j++];
    }
    while (i <= mid) t[k++] = a[i++];
    while (j <= high) t[k++] = a[j++];
    for (i = low; i <= high; i++) {
      a[i] = t[i-low];
    }
  }

  public static void main(String[] args) {
    var n = 7;
    var a = new Integer[n];
    for (var i = 0; i < n; i++) {
      a[i] = i;
    }
    Collections.shuffle(Arrays.asList(a));

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();
    devide_t(a, 0, n-1);

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();
  }
}