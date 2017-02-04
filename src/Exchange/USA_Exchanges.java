package exchange;

import java.util.*;

/**
 * Created by william on 2/3/17.
 */
public class USA_Exchanges {

    public ArrayList<String> exchange_Names;

    //TODO make a singleton data structure
    public USA_Exchanges() {
        this.exchange_Names = new ArrayList<>();
    }


    public void add_Exchange_Name(String exchange){
        this.exchange_Names.add(exchange);

    }
}
