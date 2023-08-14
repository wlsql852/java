public class SinglyLinkedList {
    Node head = new Node();
  
    void insert (int index, int value) {
      var node = this.head;
      while (node.next != null && index > 0) {
          index -= 1;
          node = node.next;
      }
      if (index > 0) throw new ArrayIndexOutOfBoundsException();
      node.next = new Node(value, node.next);
    }
    void delete(int index) {
      var node = this.head;
      while (node.next != null && index > 0) {
          index -= 1;
          node = node.next;
      }
      if (index > 0) throw new ArrayIndexOutOfBoundsException();
      node.next = node.next.next;
    } 
  
    int get(int index) {
      var node = this.head.next;
      while (node != null && index > 0) {
          index -= 1;
          node = node.next;
      }
      if (node == null || index > 0) throw new ArrayIndexOutOfBoundsException();
      return node.value;
    }
  
    void set(int index, int value) {
      var node = this.head.next;
      while (node != null && index > 0) {
          index -= 1;
          node = node.next;
      }
      if (node == null || index > 0) throw new ArrayIndexOutOfBoundsException();
      node.value = value;
    }
  
    int find(int value) {
      var index = 0;
      var node = this.head.next;
      while (node != null && node.value != value) {
          index += 1;
          node = node.next;
      }
      if (node == null) return -1;
      return index;
    }
  
    int front() {
      if (this.head.next == null) throw new ArrayIndexOutOfBoundsException();
      return head.next.value;
    }
  
    int back () {
      var node = this.head;
      while (node.next != null) {
          node = node.next;
      }
      return node.value;
    }
  
    void pushFront(int value) {
      this.head.next = new Node(value, this.head.next);
    }
  
    void pushBack(int value) {
      var node = this.head;
      while (node.next != null) {
          node = node.next;
      }
      node.next = new Node(value);
    }
  
    void popFront() {
      if (this.head.next == null) throw new ArrayIndexOutOfBoundsException();
      this.head.next = this.head.next.next;
    }
  
    void popBack() {
      var prev = this.head;
      var node = prev.next;
      while (node != null) {
        prev = node;
        node = node.next;
      }
      prev.next = null;
    }
  
    boolean empty() {
      return (head.next == null);
    }
  
    int length() {
      int len = 0;
      var node = head.next;
      while (node != null) {
        len = len+1;
        node = node.next;
      }
      return len;
    }
  
    void clear() {
      head.next = null;
    }
  
    void sort() {
      var i = this.head.next;
      while (i != null) {
        var j = i.next;
        while (j != null) {
          if (i.value > j.value) {
            var t = i.value;
            i.value = j.value;
            j.value = t;
          }
          j = j.next;
        }
        i = i.next;
      }
    }
  
    //임시 head를 만들어서 해결
    void reverse() {
      Node temp = null;
      var node = this.head.next;
      while (node != null) {
        var t = node;
        node = node.next;
        t.next = temp;
        temp = t;
      }
      this.head.next = temp;
    }
  
    void reverse2() {
      var node = this.head.next;
      this.head.next = null;
      while (node != null) {
        var t = node.next;
        node.next = this.head.next;
        this.head.next = node;
        node = t;
      }
    }
  
    void print() {
      System.out.print("[");
      var node = this.head.next;
      if (node != null) {
        System.out.print(node.value);
        node = node.next;
      }
      while (node != null) {
        System.out.print(", " + node.value);
        node = node.next;
      }
      System.out.println("]");
    }
  
    
    public static void main(String[] args) {
      var l = new SinglyLinkedList();
      for (var i = 0; i < 10; i++) {
        l.pushBack(i);
      }
      l.print();
      l.reverse2();
      l.print();
  
      // var head = new Node();
      // head.next = new Node(1);
      // head.next.next = new Node(2);
      // head.next.next.next = new Node(3);
      // l.insert(0,4);
      // l.insert(1,5);
      // l.insert(2,6);
      // l.insert(3,3);
      // l.delete(2);
      // System.out.printf("%3d\n", l.get(2));
      // l.set(2,7);
      // System.out.printf("%3d\n", l.find(2));
      // System.out.printf("%3d\n", l.find(6));
      // System.out.printf("%3d\n", l.front());
      // System.out.printf("%3d\n", l.back());
      // l.pushFront(7);
      // l.pushBack(8);
      // l.popFront();
      // l.popBack();
      // l.print();
      // System.out.printf("%3d\n", l.length());
    
      // var node = head.next;
      // while (node != null) {
      //   System.out.printf("%3d", node.value);
      //   node = node.next;
      // }
    }
  }
  
  class Node {
    int value = 0;
    Node next = null;
  
    Node() {}
  
    Node(int value) {
      this.value = value;
    }
  
    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }