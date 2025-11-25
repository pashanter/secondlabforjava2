public class Main {
    public static void main(String[] args) {
        int startSum = 100;
        int depositAmount = 2500;
        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            startSum = startSum + bonus + depositAmount;
        } else {
            bonus = 0;
            startSum = startSum + depositAmount;
        }
        System.out.println("Итоговый счет " + startSum + " рублей");
        System.out.println("Бонусы " + bonus);
    }
}