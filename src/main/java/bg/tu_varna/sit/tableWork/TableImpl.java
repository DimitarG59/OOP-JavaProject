package bg.tu_varna.sit.tableWork;

import java.util.HashMap;
import java.util.Map;

public class TableImpl extends IllegalArgumentException {
    private String typeC;
    Map<String,TableImpl> table = new HashMap<>();

    protected void typeConvertor(boolean check){
        try{
            if(typeC.contains(".")) {
                Double.parseDouble(typeC);
                 check = true;
            }
            else if(!check){
                Integer.parseInt(typeC);
            }
        }
        catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }

}
