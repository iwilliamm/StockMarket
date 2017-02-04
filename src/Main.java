
import exchange.USA_Exchanges;

public class Main {

    public static void main(String[] args) {

    USA_Exchanges exchanges = new USA_Exchanges();
    exchanges.add_Exchange_Name("nasdaq");
        exchanges.add_Exchange_Name("nyse");
        exchanges.add_Exchange_Name("amex");
        System.out.println(exchanges.exchange_Names);


    }

}
