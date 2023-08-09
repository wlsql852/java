
import java.util.Arrays;
import java.util.Collections;

class InsertionSort_t {
  public static void main(String[] args) {
    var n = 3;
    var a = new Integer[n];
    for (var i = 0; i < n; i++) {
      a[i] = i;
    }
    Collections.shuffle(Arrays.asList(a));

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();

    var i = n-2;
    var l = a[n-1];
    while (a[i] > l) {
      a[i+1] = a[i];
      i--;
    }
    a[i+1] = l;

    for (var m: a) {
      System.out.printf("%3d",m);
    }
    System.out.println();
  }
}