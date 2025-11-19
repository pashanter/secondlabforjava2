public class Main {
    public static void main(String[] args) {
        int startSumma = 100;
        int summaP = 2500;
        int bonus;
        if (summaP > 1000) {
            bonus = summaP / 100;
            startSumma = startSumma + bonus + summaP;
            System.out.println("Итоговый счет " +  startSumma + " рублей");
            System.out.println("Бонусы " + bonus);
        } else {
            bonus = 0;
            startSumma = startSumma + summaP;
            System.out.println("Итоговый счет" +  startSumma + " рублей");
            System.out.println("Бонусы" + bonus);
        }
    }
}