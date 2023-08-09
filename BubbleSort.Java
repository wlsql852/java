package java201;
import java.util.Arrays;
import java.util.Collections;

class BubbleSort {
  public static void main(String[] args) {
    var n = 5;
    var a = new Integer[n];
    for (var i = 0; i < n; i++) {
      a[i] =i;
    }
    Collections.shuffle(Arrays.asList(a));

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();
    for (var i = n-1; i > 0; i--){
      for (var j = 0; j < i; j++) {
        if (a[j] > a[j+1]) {
          var l = a[j];
          a[j] = a[j+1];
          a[j+1] = l;
        }
      }
    }

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();
  }
}