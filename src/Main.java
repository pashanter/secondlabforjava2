public class Main {
    public static void main(String[] args) {
        int startSum = 100;
        int sumP = 2500;
        int bonus;
        if (sumP > 1000) {
            bonus = sumP / 100;
            startSum = startSum + bonus + sumP;
        } else {
            bonus = 0;
            startSum = startSum + sumP;
        }
        System.out.println("Итоговый счет " +  startSum + " рублей");
        System.out.println("Бонусы " + bonus);
    }
}