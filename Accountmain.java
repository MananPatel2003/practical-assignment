public class Accountmain {
    public static void main(String[] args) {
        Account a = new Account();

        a.setId(273);
        System.out.println(a.getId());
        a.setBalance(40000);
        System.out.println(a.getBalance());
        a.setAnnualInterestRate(0.07);
        System.out.println(a.getAnnualInterestRate());
        a.getMonthlyInterestRate();
        System.out.println(a.getMonthlyInterestRate());

    }

}
