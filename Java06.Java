package java06;
class Java106 {
  public static void main(String[] args) {
    var l = new P106_08();
    l.main_();
  } 
}

class P106_00 {
  void f() {                                                       //static void f() {
    String a = "Hello World!";
    System.out.println(a);
    f();
  }
  void main_() {                                                   //public static void main(String[] args){
    f();
  }
}

class P106_01 {
  void f(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(" Hello, World!");
    f(n-1);
  }

  void main_() {
    var n = 5;
    f(n);
  }
}

class P106_02 {
  int f(int n) {
    if (n == 0) {
      return 1;
    }
    return n*f(n-1);
  }
  void main_() {
    var n =5;
    System.out.println(f(n));
  }
}

class P106_03 {
  int f(int a, int n) {
    if (n == 0) {
      return 1;
    }
    return a*f(a, n-1);
  }

  void main_() {
    var a = 2;
    var b = 7;
    System.out.println(f(a, b));
  }
}

class P106_04 {
  int f(int n) {
    if (n < 2) {
      return n;
    }
    return f(n-2) + f(n-1);
  }
  
  void main_() {
    var n = 10;
    System.out.println(f(n));
  }
}

class P106_04t {
  int f(int n, int[] a) {
    if (n < 2) {
      return n;
    }
    if (a[n] != 0) {
      return a[n];
    }
    a[n] = f(n-2, a) + f(n-1, a);
    return a[n];
  }
  
  void main_() {
    var n = 45;
    System.out.println(f(n, new int[n+1]));
  }
}

class P106_05 {
  int f(int a, int b) {
    if (b == 0) {
      return a;
    }
    return f(b, a%b);
  }

  void main_(String[] args) {
    var a = 1071;
    var b = 1029;
    System.out.println(f(a,b));
  }
}

class P106_06 {
  void f(int n, int[] result, int k) {
    if (k == n) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", result[j]);
      }
      System.out.println();
      return;
    }
    for (var i = 0; i < n; i++) { 
      result[k] = i ;
      f(n, result, k+1);

    }
  }

  void main_() {
    var n = 3;
    var result = new int[n];  
    f(n, result, 0);
  }
}

class P106_07 {
  void f(int n, int[] result, int i, int k) {
    if(k == n) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", result[j]);
      }
      System.out.println();
      return;
    }
    for (var l = i; l < n; l++) {
      result[k] = l;
      f(n, result, l, k+1);
    }
  }

  void main_() {
    var n = 3;
    var result = new int[n];
    f(n, result, 0,0);
  }
}

class P106_08 {
  void f(int n, int m, int[] result, int i, int k) {
    if (k == n) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",result[j]);
      }
      System.out.println();
      return;
    }
    for (var l = i; l < m; l++) {
      result[k] = l;
      f(n, m, result, l+1, k+1);
    }
  }

  void main_() {
    var n = 3;
    var m = 5;
    var result = new int[n];
    f(n, m, result, 0, 0);
  }
}

class P006_09 {
  void f(int n, boolean[] used, int[] result, int k) {
    if (k == n) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", result[j]);
      }
      System.out.println();
      return;
    }
    for (var i = 0; i < n; i++) {
      if (used[i]) continue;
      used[i] = true;
      result[k] = i;
      f(n, used, result, k+1);
      used[i] = false;
    }
  }

  void main_() {
    var n = 3;
    var used = new boolean[n];
    var result = new int[n];
    f(n, used, result, 0);
  }
}

class P106_10 {
  int f(int n, char from, char middle, char to) {
    if (n == 1) {
      System.out.printf("Moved %d from %c to %c\n", n, from, to);
      return 1;
    }
    int a = f(n-1, from, to, middle);
    System.out.printf("Moved %d from %c to %c\n", n, from, to);
    f(n-1, middle, from, to);
    return 2*a+1;
  }
  void main_() {
    int n =4;
    int count = f(n, 'A', 'B', 'C');
    System.out.printf("Moved %d times\n", count);
  }
}

class P106_10t {
  int f(int n, char from, char middle, char to) {
    if (n == 1) {
      System.out.printf("Moved %d from %c to %c\n", n, from, to);
      return 1;
    }
    int c = f(n-1, from, to, middle);
    System.out.printf("Moved %d from %c to %c\n", n, from, to);
    return c + 1 + f(n-1, middle, from, to);
  }
  void main_() {
    int n = 4;
    int count = f(n, 'A', 'B', 'C');
    System.out.printf("Moved %d times\n", count);
  }
}