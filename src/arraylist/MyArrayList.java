package arraylist;

public class MyArrayList {
    private int[] items;
 public MyArrayList() {
     items = new int[0];
     System.out.println(items.length);
 }

    @Override
    public String toString() {
        String str = "[";
        if(items.length > 0){
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";

        return str;
    }

    public void add(int num){
        int[] temp = new int[items.length +1]; // 0->1 temp = 1
        temp[items.length] = num;
        for (int i = 0; i < items.length ; i++) { //0-> x
            temp[i] = items[i];                   //1-> 10,0    2->10,20 3->10,20,30
        }
        items = temp;
//index = 1; items[index] ,
    }
    void add(int num1, int num2){
        if(num1> items.length){return;}
        int[] temp = new int[items.length+1];
        temp[num1] =num2;
        for (int i = 0; i < items.length ; i++)
        {
            if(i<num1){
                temp[i] = items[i];
            }

            else {
                temp[i+1] = items[i];
            }

        }
        items = temp;
    }

    void remove(int index){
        int[] temp = new int[items.length-1];
        temp[items.length] = index;
        for (int i = index; i < items.length-1; i++) {  //remove(3)이면 remove(4)부터 당겨야함 길이끝까지
        temp[i] = items[i];                          //item안에 배열 2번째방이 3번째방과 같아야함
        }
       items = temp;

        }

    }
