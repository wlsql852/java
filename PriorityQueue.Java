package priorityqueue;
class PriorityQueue {
  int length = 0;
  int[] a = new int[10];
  
  void push(int value) {
    a[length] = value;
    
    var p = (length-1)/2;
    var s = length;
    while (p >=0) {
      if (value > a[p]) {
        a[s] = a[p];
        a[p] = value;
      }
      if(p == 0) break;
      s = p;
      p = (p-1)/2;

    }
    length++;
  }

  void push2(int value) {
    this.a[this.length++] = value;
    var c = this.length - 1;
    var p = (c - 1) / 2;
    while (p >= 0 && this.a[p] < this.a[c]) {
      var t = this.a[p];
      this.a[p] = this.a[c];
      this.a[c] = t;
      c = p;
      p = (c - 1) / 2;
    }
  }

  int pop() {
    var t = a[0];
    a[0] = a[length-1];
    a[length-1] = 0;
    length--;

    var i = 0;
    while (i <= (length-1)/2){
      var c = i;
      var l = i*2+1;
      var r = i*2+2;
      if (a[c] < a[l]) c = l;
      if (r < length && a[c] < a[r]) c = r;
      if (i == c) break;
      var m = a[c];
      a[c] = a[i];
      a[i] = m;
      i = c;
    }
    return t;
  }

  int pop2() {
    var v = this.a[0];
    this.length -= 1;
    if (this.length == 0) return v;

    this.a[0] = this.a[this.length];
    var p = 0;
    while (true) {
      var c = p;
      var l = p * 2 + 1;
      var r = p * 2 + 2;
      if (l < this.length && this.a[c] < this.a[l]) c = l;
      if (r < this.length && this.a[c] < this.a[r]) c = r;
      if (c == p) break;
      var t = this.a[c];
      this.a[c] = this.a[p];
      this.a[p] = t;
      p = c;
    }
    return v;
  }
  
  int peek() {
    if (this.length == 0) throw new EmptyPriorityQueueException();
    return a[0];
  }
  
  boolean empty() {
    return this.length == 0;
  }
  
  int length() {
    return length;
  }
  
  void clear() {
    this.length = 0;
  }
  
  void print() {
    System.out.print("[");
    if (this.length > 0) {
      System.out.printf("%d", this.a[0]);
    }
    for (var i = 1; i < this.length; i++) {
      System.out.printf(", %d", this.a[i]);
    }
    System.out.println("]");
  }
  
  public static void main(String[] args) {
      var q = new PriorityQueue();
      // System.out.println(q.peek());
      for (var i = 0; i < 10; i++) {
        q.push(i);
      }
      q.print();
      // q.clear();
      // q.print();
      
      for (var i = 0; i < 10; i++) {
        System.out.println(q.pop());
        q.print();
      }
      
      // var l = new java.util.Stack<Integer>();
      // System.out.println(l.peek());
  }
}

class EmptyPriorityQueueException extends RuntimeException {
}

