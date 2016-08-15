package adapter;

import common.Product;

import java.util.HashMap;

/**
 * Created by yishan on 15/8/16.
 */
public class DBToProductAdapter extends Product {
    HashMap productDB;
    public DBToProductAdapter(HashMap productDB){
        this.productDB = productDB;
    }

}
