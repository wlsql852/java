import java.util.Arrays;
import java.util.Collections;

class MergeSort {
  static void merge(Integer[] a, int low, int mid, int high) {
    //System.out.printf("%3d%3d%3d\n", low, mid, high);
    var c = new Integer[high-low+1];
    var l = 0;
    var i = low;
    var j = mid+1;

    while (i < mid+1 && j < high+1) {
      if (a[i] < a[j]) c[l++] = a[i++];   
      else {
        c[l] = a[j];
        l++;
        j++;
        
      }
    }

    while (j < high+1) {
      c[l] = a[j];
      l++;
      j++;
    }
    while (i < mid+1) {
      c[l] = a[i];
      l++;
      i++;
    }

    for (var m = low; m < high+1; m++) {
      a[m] = c[m-low];
    }
  }
  static void devide(Integer[] a, int low, int high) {
    //System.out.printf("%3d%3d\n", low, high);
    if(low >= high) return;
    int mid = (low+high) / 2;
    devide(a,low, mid);
    devide(a,mid+1, high);
    merge(a, low, mid, high);
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
    devide(a, 0, n-1);

    for (var i: a) {
      System.out.printf("%3d", i);
    }
    System.out.println();
  }
}