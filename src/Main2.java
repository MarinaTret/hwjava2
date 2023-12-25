public class Main2 {
    public static void main(String[] args) {
        int initialAccount = 200;
        int replenishmentAmount = 2000;
        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        int balance = initialAccount + replenishmentAmount + bonus;

        System.out.println("Баланс: "+ balance + " руб. Бонус: " + bonus + "руб");


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
