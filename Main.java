class Node {

  int val;
  Node next;

  Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}


class Main {

  Node first;
  Node last;
  int length;
  

  Main() {
    this.first = null;
    this.last = null;
    this.length = 0;
  }
  
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    Main queue = new Main();

    queue.enqueue(4);
    queue.enqueue(2);
    int n = queue.dequeue();
    System.out.println("Poped value is: " + n);
    queue.print();

    System.out.println("Peek value is: "+ queue.peek());

    System.out.println("Line break");
    queue.enqueue(8);
    queue.enqueue(10);
    queue.enqueue(15);

    System.out.println("Peek value is: "+ queue.peek());

    queue.print();
    System.out.println("Line break");

    n = queue.dequeue();
    queue.print();
    System.out.println("Line break");
    System.out.println("Peek value is: "+ queue.peek());
    
    n = queue.dequeue();
    queue.print();
    System.out.println("Line break");
    System.out.println("Peek value is: "+ queue.peek());
    
    n = queue.dequeue();
    queue.print();
    System.out.println("Line break");
    System.out.println("Peek value is: "+ queue.peek());
    
    n = queue.dequeue();
    queue.print();
    
  }

  public void enqueue(int val) {

    if(this.length == 0) {
      Node n = new Node(val, null);
      this.first = n;
      this.last = n;
      this.length++;
      return;
    }

    Node n = new Node(val, null);
    this.last.next = n;
    this.last = n;
    length++;
  }

  public void print() {
    Node n = this.first;

    while(n != null) {
      System.out.println(n.val);
      n = n.next;
    }
  }

  public int dequeue() {

    int retval = -1;
    if(this.first == null) {
      return retval;
    }
    if(this.first == this.last) {
      retval = this.first.val;
      this.length--;
      this.first = null;
      this.last = null;
      return retval;
    }

    retval = this.first.val;
    this.first = this.first.next;
    this.length--;
    return retval;
  }

  public int peek() {

    if(this.first == null)
      return -1;

    return this.first.val;
  }
}