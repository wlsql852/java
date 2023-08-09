package java203;
import java.util.Arrays;
import java.util.Collections;

class SelectionSort {
  public static void main(String[] args) {
    var n = 5;
    var a = new Integer[n];
    for (var i = 0; i < n; i++) {
      a[i] = i;
    }
    Collections.shuffle(Arrays.asList(a));

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();

    for (var i = n; i > 0; i--) {
      var m = 0;
      for (var j = 1; j < i; j++) {
        if (a[j] > a[m]) {
          m = j;
        }
      }
      var l = a[m];
      a[m] = a[i-1];
      a[i-1] = l;
    }

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();
  }
}