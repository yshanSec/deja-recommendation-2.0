package common;

import com.google.common.base.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by yishan on 15/8/16.
 */
public class Product extends HashMap{
    public static String[] validFieldList = {"id", "category", "subcategory", "brand", "color", "price", "cutting"};
    public Product(){
        for(int i = 0; i < validFieldList.length; i++){
            this.put(validFieldList[i],null);
        }
    }



//    boolean isValidKey(String[] keyList){
//    //TODO
//        ArrayList<String> validFieldArray = new ArrayList<String>(Arrays.asList(validFieldList));
//        ArrayList<String> keyArray = new ArrayList<String>(Arrays.asList(keyList));
//        for(int i = 0; i < keyList.length; i++){
//            if(validFieldArray.contains(i)){
//                continue;
//            }
//            else{
//                return false;
//            }
//        }
//        if(keyArray.contains("id")){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

}
