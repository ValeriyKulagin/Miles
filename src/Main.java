public class Main {
    public static void main(String[] args) {
        int amount = 75;
        int bonusAmount = 20;

        int bonusMiles;
        if (amount >= bonusAmount) {
            bonusMiles = amount / bonusAmount;
        } else {
            bonusMiles = 0;
        }
        System.out.println("Количество бонусных миль = " + bonusMiles);
    }
}