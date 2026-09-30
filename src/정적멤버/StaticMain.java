package 정적멤버;

public class StaticMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("원이", 1000);
        Bank bank2 = new Bank("제나", 2000);
        Bank bank3 = new Bank("리브", 3000);

        bank1.setDeposit(35000);
        bank1.setWithdraw(10000);
        bank1.printBalance();

        System.out.println(Bank.getCount());
    }
}
