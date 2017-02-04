
import Exchange.ExchangeList.USA_Exchanges;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

    USA_Exchanges exchanges = new USA_Exchanges();
    exchanges.add_Exchange_Name("nasdaq");
        System.out.println(exchanges.exchange_Names);


    }

}
