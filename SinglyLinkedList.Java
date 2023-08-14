public class SinglyLinkedList {
    Node head = new Node();
  
    void insert (int index, int value) {
      if (index > length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        Node node = head;
        for (var i = 0; i < index; i++) {
          node = node.next;
        }
        node.next = new Node (value, node.next);
      }
    }
    void delete(int index) {
      if (index >= length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        Node node = head;
        for (var i = 0; i < index; i++) {
          node = node.next;
        }
        node.next = node.next.next;
      }
    } 
  
    int get(int index) {
      if (index >= length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        Node node = head;
        for (var i = 0; i < index; i++) {
          node = node.next;
        }
        return node.next.value;
      }
    }
  
    void set(int index, int value) {
      if (index >= length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        delete(index);
        insert(index, value);
      }
    }
  
    int find(int value) {
      Node node = head;
      int a = -1;
      int index = 0;
      for (var i = 0; i < length(); i++) {
        if (node.next.value == value) {
          a = index;
          break;
        }
        node = node.next;
        index++;
      }
      return a;
    }
  
    int front() {
      return head.next.value;
    }
  
    int back () {
      var node = head;
      for (var i = 0; i < length(); i++) {
      node = node.next;
      }
      return node.value;
    }
  
    void pushFront(int value) {
      insert(0,value);
    }
  
    void pushBack(int value) {
      insert(length(), value);
    }
  
    void popFront() {
      head.next.next = head.next;
    }
  
    void popBack() {
      delete(length()-1);
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
      Node node = head;
      for (var i = length()-1; i > 0; i--) {
        for (var j = 0; j < i; j++) {
          if (node.next.value > node.next.next.value) {
            int l = get(j);
            delete(j);
            insert(j+1, l);
          }
          node = node.next;
        }
      }
    }
  
    //임시 head를 만들어서 해결
    /*
    void reverse() {
      Node node = head;
      for (var i = 0; i < length()/2; i++) {
        int l = get(i);
        delete(i);
        insert(length()-1-i,0);
        l = get(length()-2-i);
        delete(length()-2-i);
        insert(i, l);
      }
    }
    */
  
    void print() {
      var node = head.next;
      while (node != null) {
        System.out.printf("%3d" ,node.value);
        node = node.next;
      }
      System.out.println();
    }
  
    
    public static void main(String[] args) {
      var l = new SinglyLinkedList();
  
      // var head = new Node();
      // head.next = new Node(1);
      // head.next.next = new Node(2);
      // head.next.next.next = new Node(3);
      l.insert(0,4);
      l.insert(1,5);
      l.insert(2,6);
      l.insert(3,3);
      // l.delete(2);
      // System.out.printf("%3d\n", l.get(2));
      // l.set(2,7);
      // System.out.printf("%3d\n", l.find(2));
      // System.out.printf("%3d\n", l.find(6));
      // System.out.printf("%3d\n", l.front());
      // System.out.printf("%3d\n", l.back());
      // l.pushFront(7);
      // l.pushBack(8);
      l.popFront();
      l.popBack();
      l.print();
      System.out.printf("%3d\n", l.length());
    
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