package exchange;

import exchange.stocks.Stock;

/**
 * Created by william on 2/3/17.
 */
public class Corporation extends Corporation_List {

    public String name;
    public String industry;
    public String region;
    public String market_Cap_Type;
    public Stock corpStock;
    public int number_Of_Stock;


    //TODO add validation
    public Corporation(String name, String industry, String region, String market_Cap_Type){

        this.name = name;
        this.industry = industry;
        this.region = region;
        this.market_Cap_Type = market_Cap_Type;

    }





}
