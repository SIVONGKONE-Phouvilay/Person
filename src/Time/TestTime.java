package Time;
public class TestTime {
    public static void main(String[] args){
        Time t1 = new Time(1,2,3);
        t1.display();
        System.out.println("+ Set Time");
        t1.setTime(18,19,58);
        t1.display();
        t1.nextSecond();
        System.out.println("them 1 second :");
        t1.display();
        t1.nextSecond();
        System.out.println("them 1 second :");
        t1.display();

        // Pervious Second
        System.out.println("+ Previous Second");
        t1.setTime(7, 0, 0);
        t1.display();
        System.out.println("Tru 1 second :");
        t1.previousSecond();
        t1.display();
    }
}
