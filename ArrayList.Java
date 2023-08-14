class ArrayList implements Iterable {
    int[] values = new int[1];
    int size = 1;
    int length = 0;

    void insert(int index, int value) {
      if (index > length) throw new ArrayIndexOutOfBoundsException(index);
      else {
        if (length == size) {
          var values2 = values;
          values = new int[size*2];
          for (var i = 0; i < values2.length; i++) {
            values[i] = values2[i];
          }
        }
        if(index == length) {
  
          values[index] = value;
          length++;
        }
        else {
          for (var i = length-1; i >=index; i--) {
            values[i+1] = values[i];
          }
          values[index] = value;
          length++;
        }
      }
    }
  
    void delete(int index) {
      if (index >= length) throw new ArrayIndexOutOfBoundsException(index);
      else {
        for (var i = index; i < length-1; i++) {
        values[i] = values[i+1];
      }
      length--;
      }
    }
  
    int get(int index) {
      if (index < 0) index = this.length + index;
      if (index >= length) throw new ArrayIndexOutOfBoundsException(index);
      else {
        return values[index];
      }
    }
  
    void set(int index, int value) {
      if (index < 0) index = this.length + index;
      if (index >= length) throw new ArrayIndexOutOfBoundsException(index);
      else {
        values[index] = value;
      }
    }
  
    int find(int value) {
      for (var i = 0; i < this.length; i++) {
        if (this.values[i] == value) return i;
      }
      return -1;
    }
  
    int front() {
      return this.get(0);
    }
  
    int back() {
      return this.get(length-1);
    }
  
    void pushFront(int value) {
      insert(0,value);
    }
  
    void pushBack(int value) {
      insert(length, value);
    }
  
    void popFront() {
      delete(0);
    }
  
    void popBack() {
      delete(length-1);
    }
  
    boolean empty() {
      return length == 0; 
    }
  
    int length() {
      return length;
    }
  
    void clear() {
      length = 0;
    }
  
    void sort() {
      for (var i = length-1; i > 0; i--) {
        for (var j = 0; j < i; j++) {
          if (values[j] > values[j+1]) {
            var l = values[j];
            values[j] = values[j+1];
            values[j+1] = l;
          }
        }
      }
    }
  
    void reverse () {
      for (var i = 0; i < length/2-1; i++) {
        var l = values[i];
        values[i] = values[length-1-i];
        values[length-1-i] = l;
      }
  
    } 
  
    void print() {
      System.out.print("[");
      if (this.length > 0) {
        System.out.printf("%d", this.values[0]);
      }
      for (var i = 1; i < this.length; i++) {
        System.out.printf(", %d", this.values[i]);
      }
      System.out.println("]");
    }
    
    public static void main(String[] args) {
      var l = new ArrayList();
      l.insert(0, 1);
      l.insert(0, 2);
      for (var v: l) {
          System.out.println(v);
      }
      // for (var i = 0; i < l.length(); i++) {
      //   System.out.println(l.get(i));
      // }
      // for (var i = 0; i < l.length(); i++) {
      //   System.out.println(l.get(i));
      // }
      // System.out.println(l.get(-3));
  
      
      // l.insert(0,7);
      // l.insert(0,5);
      // l.insert(2,3);
      // l.insert(3,4);
      // l.insert(4,2);
      // l.insert(3,1);
      // l.delete(2);
      // l.get(3);
      l.print();
    }
  }