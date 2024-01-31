public class Main {
    public static void main(String[] args) {


        int refill = 2000;
        int initialAccount = 100;
        int bonus = (initialAccount + refill) / 100;
        System.out.println("Ввести сумму пополнения: " + refill);
        if (refill > 1000) {

            int totalAmount = refill + initialAccount + bonus;


            System.out.println("Итого сумма на счету: " + totalAmount);

        } else {
            int totalAmount = refill + initialAccount;


            System.out.println("Итого сумма на счету" + totalAmount);
        }



    }
}