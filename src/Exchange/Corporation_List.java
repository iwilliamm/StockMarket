package exchange;

import java.util.ArrayList;

/**
 * Created by william on 2/3/17.
 */
public class Corporation_List {
    protected ArrayList corp_Names;

    public Corporation_List(){
        this.corp_Names = new ArrayList<Corporation>();
    }

    //TODO add other attributes
    public void add_Corp(Corporation name){
        this.corp_Names.add(name);
    }



}
