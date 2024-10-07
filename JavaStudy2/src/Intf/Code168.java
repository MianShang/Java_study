package Intf;

interface Data
{
    int count = 100;

    void print();
}

class ChildData implements Data
{
    public void print(){
        System.out.println("ChildData printing");
    }
}


public class Code168
{
    public static void main(String[] args) {
        Data x = new ChildData();

        x.print();
        System.out.println(Data.count);

    }
}
