package Person;

public class Testperson {
    public static void main(String[]args){
        Student st1 = new Student("Adexa", 20, "Dong hoi", 8);
        Student st2 = new Student("Phonekham", 24, "Minh hoa", 9);
        Teacher t1 = new Teacher("Hoang Van Thanh", 30, "Dong hoi", 1000000);
        Teacher t2 = new Teacher("Pham Xuan Hau", 34, "Le thuy", 2000000);
        st1.display();
        st2.display();
        t1.display();
        t2.display();
    }
}