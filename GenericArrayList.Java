import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class GenericArrayList<E extends Comparable<E>> implements Iterable<E> {
  @SuppressWarnings("unchecked")
  E[] values = (E[]) new Comparable[1];
  int size = 1;
  int length = 0;

  public Iterator<E> iterator() {
    var t = this;
    return new Iterator<E>() {
      GenericArrayList<E> arrayList = t;
      int index = 0;

      public boolean hasNext() {
        return this.index < arrayList.length;
      }

      public E next() {
        return arrayList.values[this.index++];
      }
    };
  }

  @SuppressWarnings("unchecked")
  void insert(int index, E value) {
    if (this.length == this.values.length) {
      var t = this.values;
      this.values = (E[]) new Comparable[this.values.length * 2];
      for (var i = 0; i < t.length; i++) {
        this.values[i] = t[i];
      }
    }
    for (var i = this.length; i > index; i--) {
      this.values[i] = this.values[i - 1];
    }
    this.values[index] = value;
    this.length += 1;
  }

  void delete(int index) {
    for (int i = index; i < this.length - 1; i++) {
      this.values[i] = this.values[i + 1];
    }
    this.length -= 1;
  }

  E get(int index) {
    if (index < 0) index = this.length + index;
    if (index >= length) throw new ArrayIndexOutOfBoundsException(index);
    else {
      return values[index];
    }
  }

  void set(int index, E value) {
    if (index < 0) index = this.length + index;
    if (index >= length) throw new ArrayIndexOutOfBoundsException(index);
    else {
      values[index] = value;
    }
  }

  int find(E value) {
    for (var i = 0; i < this.length; i++) {
      if (this.values[i] == value) return i;
    }
    return -1;
  }

  E front() {
    return this.get(0);
  }

  E back() {
    return this.get(length-1);
  }

  void pushFront(E value) {
    insert(0,value);
  }

  void pushBack(E value) {
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
        if (this.values[j].compareTo(this.values[j + 1]) > 0) {
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

  void foreach(Consumer<E> action) {
    for (var v: this) {
      action.accept(v);
    }
  }

  GenericArrayList<E> map(Function<E, E> action) {
    var temp = new GenericArrayList<E>();
    for (var v: this) {
      temp.pushBack(action.apply(v));
    }
    return temp;
  }

  GenericArrayList<E> filter(Predicate<E> action) {
    var temp = new GenericArrayList<E>();
    for (var v: this) {
      if (action.test(v)) {
        temp.pushBack(v);
      }
    }
    return temp;
  }

  E reduce(E base, BinaryOperator<E> action) {
    for (var v: this) {
      base = action.apply(v, base);
    }
    return base;
  }
  
  public static void main(String[] args) {
    var l = new GenericArrayList<Integer>();
    for (var i = 0; i < 10; i++) {
      l.pushBack(10 - i);
    }
    // for (var v: l) {
    //     System.out.println(v);
    // }

    l.forEach(v -> System.out.println(v));
    l.sort();
    System.out.println();
    l.forEach(System.out::println);

    var l2 = l.map(v -> v * 2);
    System.out.println();
    l2.forEach(System.out::println);

    var l3 = l.filter(v -> v % 2 == 0);
    System.out.println();
    l3.forEach(System.out::println);

    System.out.println();
    System.out.println(l.reduce(0, (v, r) -> r + v));
  }
}
