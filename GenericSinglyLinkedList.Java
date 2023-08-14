public class GenericSinglyLinkedList<E extends Comparable<E>> implements Iterable<E> {
    Node<E> head = new Node<E>();
  
    public Iterator<E> iterator() {}
    void insert (int index, E value) {
      if (index > length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        var node = this.head;
        for (var i = 0; i < index; i++) {
          node = node.next;
        }
        node.next = new Node<E>(value, node.next);
      }
    }
    void delete(int index) {
      if (index >= length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        var node = this.head;
        for (var i = 0; i < index; i++) {
          node = node.next;
        }
        node.next = node.next.next;
      }
    } 
  
    E get(int index) {
      if (index >= length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        var node = this.head;
        for (var i = 0; i < index; i++) {
          node = node.next;
        }
        return node.next.value; //
      }
    }
  
    void set(int index, E value) {
      if (index >= length()) throw new ArrayIndexOutOfBoundsException(index);
      else {
        delete(index);
        insert(index, value);
      }
    }
  
    int find(E value) {
      var node = this.head;
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
      return a; //
    }
  
    E front() {
      if (this.head.next ==null) throw new ArrayIndexOutOfBoundsException();
      return this.head.next.value;   
    }
  
    E back () {
      var node = this.head;
      for (var i = 0; i < length(); i++) {
      node = node.next;
      }
      return node.value;
    }
  
    void pushFront(E value) {
      this.head.next = new Node<E>(value, this.head.next);
    }
  
    void pushBack(E value) {
      var node = this.head;
      while (node.next != null) {
        node = node.next;
      }
      node.next = new Node<E>(value);
    }
  
    void popFront() {
      if (this.head.next ==null) throw new ArrayIndexOutOfBoundsException();
      this.head.next.next = this.head.next;
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
      return (this.head.next == null);
    }
  
    int length() {
      int len = 0;
      var node = this.head.next;
      while (node != null) {
        len = len+1;
        node = node.next;
      }
      return len;
    }
  
    void clear() {
      head.next = null;
    }
  
    // void sort() {
    //   Node node = this.head;
    //   for (var i = length()-1; i > 0; i--) {
    //     for (var j = 0; j < i; j++) {
    //       if (node.next.value > node.next.next.value) {
    //         var t = node.next.value;
    //         node.next.value = node.next.next.value;
    //         node.next.next.value = t;
    //       }
    //       node = node.next;
    //     }
    //   }
    // }
  
    // void reverse() {
    //   Node node = this.head.next;
    //   this.head.next = null;
    //   while(node != null) {
    //     var t = node.next;
    //     node.next = this.head.next;
    //     this.head.next = node;
    //     node = t;
    //   }
    // }
  
    void print() {
      var node = this.head.next;
      while (node != null) {
        System.out.printf("%3d" ,node.value);
        node = node.next;
      }
      System.out.println();
    }
  
    
    public static void main(String[] args) {
      var l = new SinglyLinkedList2<Integer>();
  
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
      // l.popFront();
      // l.popBack();
      l.print();
      System.out.printf("%3d\n", l.length());
    
      // var node = head.next;
      // while (node != null) {
      //   System.out.printf("%3d", node.value);
      //   node = node.next;
      // }
    }
  }
  
  class Node<E> {
    E value = null;
    Node<E> next = null;
  
    Node() {}
  
    Node(E value) {
      this.value = value;
    }
  
    Node(E value, Node<E> next) {
      this.value = value;
      this.next = next;
    }
  }