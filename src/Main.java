public class Main {
    public static void main(String[] args) {
    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
    myLinkedList.add("a");
    myLinkedList.add("b");
    myLinkedList.add("c");

    System.out.println(myLinkedList.get(0));
    System.out.println(myLinkedList.get(1));
    System.out.println(myLinkedList.get(2));

    myLinkedList.delete(1);

    for (String data: myLinkedList) {
      System.out.println(data);
    }
    }
    
}