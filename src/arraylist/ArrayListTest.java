package arraylist;

public class ArrayListTest {
        public static void main(String[] args) {
            MyArrayList myList = new MyArrayList();
            myList.add(10);
            myList.add(20);
            myList.add(30);

            myList.add(3, 100);
            //myList.remove(3);
            System.out.println(myList);
            myList.remove(2);
            System.out.println(myList);
            //[10,20,30]
        }

    }

