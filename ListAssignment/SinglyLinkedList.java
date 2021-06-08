public class SinglyLinkedList {
    public Node head;
    public Node tail;

    public SinglyLinkedList() {
         
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    public void remove() {
        if(head == null){
            System.out.println("List is empty");
        } else {
            if(head != tail) {
                Node runner = this.head;
                while(runner.next != tail){
                    runner = runner.next;
                }
                tail = runner;
                tail.next = null;
            }
            else{
                head = tail = null;
            }
        }
    }  

    public void printValues() {
        Node runner = this.head;
        if(head == null) {
            System.out.println("List is empty");
        } while(runner.next != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner);
        System.out.println("End of list");
    }  
}