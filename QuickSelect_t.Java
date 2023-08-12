import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class QuickSelect {
  static int partition(Integer [] a, int low, int high) {
    int j = low;   
    for (var i = low; i < high; i++) {
      if (a[i] > a[high]) continue;
      var m = a[i];
      a[i] = a[j];
      a[j] = m;
      j++;  
    }
    var t = a[j];
    a[j] = a[high];
    a[high] = t;
    return j;
  }

  static int search(Integer[] a, int low, int high, int k) {
    int mid = partition(a,low,high);
    if (mid > k) return search(a, low, mid-1, k);
    if (mid < k) return search(a, mid+1, high, k);
    return a[k];
  }

  public static void main(String[] args) {
    var n = 7;
    var a = new Integer[n]; //{9,11,2,14,5,6,7};
    for (var i = 0; i < n; i++) {
      a[i] = new Random().nextInt(30);
    }
    Collections.shuffle(Arrays.asList(a));

    for (var i: a){
      System.out.printf("%3d", i);
    }
    System.out.println();

    System.out.println(search(a,0,n-1, n-2));
  }
}