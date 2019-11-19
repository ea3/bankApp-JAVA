public class Main {
    public static void main(String [] args){

        Bank bank = new Bank("Bancolombia");
        bank.addBranch("Barranquilla");
        bank.addCustomer("Barranquilla", "Emilio", 1000.11);
        bank.addCustomer("Barranquilla", "Andres", 99.11);
        bank.addCustomer("Barranquilla", "Ramiro", 9999.122);

        bank.addCustomerTransaction("Barranquilla", "Emilio", 983.33);
        bank.addCustomerTransaction("Barranquilla", "Ramiro", 12.33);

        bank.listCustomers("Barranquilla", true);
        bank.listCustomers("Medellin", true);

        bank.addBranch("Codazzi");
        bank.addBranch("Patillal");

        if(!bank.addCustomer("Patillal", "Andres", 23.44)){
            System.out.println("The branch does not exist" );
        }

    }
}
