package common;


import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by yishan on 15/8/16.
 */
public class ProductDBFactory implements Serializable{
//    mysql connection
    static String mysqlURLprefix = "jdbc:mysql://";
    private String productQuery = "select * from deja.product";
    protected String fieldList;
    protected HashMap<String, HashMap<String, String>> productHashMap = new HashMap<String, HashMap<String, String>>();

    public ProductDBFactory(){
//        get config value

    }
}
