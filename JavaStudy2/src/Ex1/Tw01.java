package Ex1;

public class Tw01  {
    public static class Tv {    // <Tv의 속성(멤버 변수) + Tv의 기능(메서드)>
        String model;
        String color;
        boolean power;
        int channel;
        int volume;
        int size;

        void power()         {power = true; }
        void channelUp()    { ++channel; }
        void channelDown()  { --channel; }
        void volumeUp()     { ++volume; }
        void volumeDown()  { --volume; }
    }

    public static void main(String[] args) {
        Tv t= new Tv();

        t.model = "Ultra";
        t.size = 64;
        t.color = "black";
        t.channel = 9;
        t.volume = 5;

        System.out.println
                ("Tv는 " + t.model + " Model의 " + t.color + " 색상 입니다");
        System.out.println("현재 channel number : "+t.channel);
        System.out.println("현재 Volume 정도는 : "+t.volume);
        System.out.println();

        t.channelDown();
        t.volumeUp();
        System.out.println
                ("지금 channel은 "+ t.channel + "번을 시청하고 있으며,");
        System.out.println
                ("지금 Volume 정도는 "+t.volume + "입니다");
    }

}
