class pr_12 {

    public static void main(String[] args) {

        Bank_12 b = new Bank_12("");
        Employee e = new Employee("Manan");
        System.out.println(e.getEmployeeName()
                + " is employee of "
                + b.getBankName());
    }
}