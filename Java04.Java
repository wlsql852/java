package java04;
class Java04 {
  void basic() {
    var n = 5;
    for (var i = 0; i < n; i = i + 1) {
      for (var j = 0; j < n; j = j + 1) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q0() { 
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q1() {
    var n = 5;
    for (var i = 0; i < n; i++){
      for (var j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q2() {
    var n = 5;
    for (var i = 0; i < n; i++){
      for (var j = 0; j < n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q3() {
    var n = 5; 
    for (var i = 0; i < n; i++){
      for (var j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i = 0; i < n; i++){
      for (var j = 0; j < n-i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q4() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i =0; i < n-1; i++) {
      for (var j = 0; j < i+2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q5() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n-i-1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q6() {
    var n = 5; 
    for (var i = 0; i < n;  i++) {
      for (var j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q7() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n-i-1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i = 0; i < n-1; i++) {
      for (var j = 0; j < i+1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j<n-i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q8() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j<n-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i = 0; i < n-1; i++) {
      for (var j = 0; j < n-i-2; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < i+2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q9() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n-i-1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < 2*i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q10() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < (n-i)*2-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q11() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < (n-i)*2-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i = 0; i < n-1; i++) {
      for (var j = 0; j < n-i-2; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j <(i+1)*2+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q12() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n-i-1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < i*2+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i  = 0; i < n-1; i++) {
      for (var j = 0; j <i+1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < (n-i-1)*2-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q13() {
    var n =5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n-i-1; j++) {
        System.out.print("*");
      }
      for (var j = 0; j < i*2+1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < n-i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (var j = 0; j < (n-i-1)*2+1; j++) {
        System.out.print(" ");
      }
      for (var j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void q14() {
    var n = 5;
    for (var i = 0; i < n; i++) {
      for (var j = 0; j < n; j++) {
        for (var k = 0; k < n-i-1; k++) {
          System.out.print(" ");
        }
        for (var k = 0; k < i*2+1; k++) {
          System.out.print("*");
        }
        for (var k = 0; k < n-i-1; k++) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    var l = new java04.Java04();
    l.q11();
  }
}

