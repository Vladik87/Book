public class Dog {
    int suze;
    String name;

    void dark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (suze > 60) {
                System.out.println("Гав, Гав!");
            } else if (suze > 14) {
                System.out.println("Вуф, Вуф!");
            } else {
                System.out.println("Тяф, Тяф!");
            }
            numOfBarks = numOfBarks - 1;
        }
    }
}