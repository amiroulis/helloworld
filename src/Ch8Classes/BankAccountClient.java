package Ch8Classes;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccountV1 Andrew = new BankAccountV1("Andrew Miroulis", "2458543",
                "123, 123 Avenue, Paris, France","10/21/02" );
        Andrew.deposit(150.0);
        System.out.println(Andrew.toString());

    }
}
