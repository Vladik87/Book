public class Main {
    public static void main(String[] args) {
//        Dog one = new Dog();
//        one.suze = 70;
//        Dog two = new Dog();
//        two.suze = 8;
//        Dog three = new Dog();
//        three.suze = 35;
//
//        one.dark(2);
//        two.dark(3);
//        three.dark(4);
//        GoodDog one = new GoodDog();
//        one.setSize(8);
//        GoodDog two = new GoodDog();
//        two.setSize(70);
//        System.out.println("Первая собака: " + one.getSize());
//        System.out.println("Вторая собака: " + two.getSize());
//        one.dark();
//        two.dark();
        GoodDog[] pets;
        pets = new GoodDog[7];
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(30);
        pets[1].setSize(8);
        int x = pets[0].getSize();
        int y = pets[1].getSize();
        System.out.println("Первая собака: " + x);
        System.out.println("Вторая собака: " + y);
    }


}
