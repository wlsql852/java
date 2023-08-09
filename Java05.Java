package java05;
class Java05 {
  void basic() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i = i + 1) {
      for (var j = 0; j < n; j = j + 1) {
        a[i][j] = k;
        k = k + 1;
      }
    }

    for (var i = 0; i < n; i = i + 1) {
      for (var j = 0; j < n; j = j + 1) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q0() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i =0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[i][j]=k;
        k++;
      }
    }
    for (var i =0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q1() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[j][i] = k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q2() {
    var n =5;
    var k =1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[n-i-1][j]=k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q3() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[i][n-j-1]=k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q4() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];
    
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[n-i-1][n-j-1]=k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q5() {
    var n =5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[n-j-1][n-i-1]=k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q6() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[n-j-1][i]=k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q7() {
    var n = 5; 
    var k = 1;
    var a = new int[n][n];

    for (var i =0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        a[j][n-i-1] = k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q8() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
        a[i][i]=k;
        k++;
      }
    for (var i =0; i < n; i++) {
      for (var j =0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q9() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[n-i-1][n-i-1] = k;
      k++;
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q10() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[i][n-i-1] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q11() {
    var n =5;
    var k =1;
    var a = new int[n][n];

    for (var i =0; i < n; i++) {
      a[n-i-1][i] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q12() {
    var n =5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[0][i] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q13() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[0][n-i-1] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q14() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[i][n-1] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q15() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[n-i-1][n-1]=k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q16() {
    var n =5;
    var k =1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[n-1][i] = k;
      k++;
    }
    for (var i = 0; i< n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q17() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[n-1][n-i-1] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    } 
  }

  void q18() {
    var n = 5;
    var k =1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[i][0]=k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q19() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      a[n-i-1][0] = k;
      k++;
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q20() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n-1; i++) {
      a[0][i] = k;
        k++;
      }
    for (var j = 0; j < n-1; j++) {
      a[j][n-1] = k;
      k++;
    }
    for (var i = 0; i < n-1; i++) {
      a[n-1][n-i-1] = k;
      k++;
    }
    for (var j = 0; j < n-1; j++) {
      a[n-j-1][0] = k;
      k++;
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q21() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];
    a[n/2][n/2] = n*n; 

    for (var i = 0; i < n/2; i++) {
      for (var j = i; j < n-i-1; j++) {
        a[i][j] = k;
        k++;
      }
      for (var j = i; j < n-i-1; j++) {
        a[j][n-i-1] = k;
        k++;
      }
      for (var j = i; j < n-i-1; j++) {
        a[n-i-1][n-j-1] = k;
        k++;
      }
      for (var j = i; j < n-i-1; j++) {
        a[n-j-1][i] = k;
        k++;
      }
    }
    
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q22() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[i-j][j] = k;
        k++;
      }
    }
    for (var i =0; i < n; i++) {
      for (var j = i+1; j < n; j++) {
        a[i+n-j][j] = k;
        k++; 
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q23() {
    var n =5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[j][i-j] = k;
        k++;
      }
    }
    for (var i =0; i < n; i++) {
      for (var j = i+1; j < n; j++) {
        a[j][i+n-j] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q24() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];
    
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[n-i+j-1][j] = k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = i+1; j < n; j++) {
        a[j-i-1][j] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j =0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q25() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];
    
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[n-j-1][i-j] = k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = i+1; j < n; j++) {
        a[n-j-1][i+n-j] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j =0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q26() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[j][n-i+j-1] = k;
        k++;
      }
    }
    for (var i = 0; i < n-1; i++) {
      for (var j = i+1; j < n; j++) {
        a[j][j-i-1] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
  }

  void q27() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[i-j][n-j-1] = k;
        k++;
      }
    }
    for (var i = 0; i < n-1; i++) {
      for (var j = i+1; j < n; j++) {
        a[n-j+i][n-j-1] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  void q28() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[n-i+j-1][n-j-1] = k;
        k++;
      }
    }
    for (var i = 0; i < n-1; i++) {
      for (var j = i+1; j < n; j++) {
        a[j-i-1][n-j-1] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    } 
  }

  void q29() {
    var n = 5;
    var k = 1;
    var a = new int[n][n];

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i+1; j++) {
        a[n-j-1][n-i+j-1] = k;
        k++;
      }
    }
    for (var i = 0; i < n; i++) {
      for (var j = i+1; j < n; j++) {
        a[n-j-1][j-i-1] = k;
        k++;
      }
    }

    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    var l = new Java05();
    l.q2();
  }
}

