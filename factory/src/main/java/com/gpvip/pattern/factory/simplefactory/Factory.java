package com.gpvip.pattern.factory.simplefactory;

import com.gpvip.pattern.factory.HuaweiPhone;
import com.gpvip.pattern.factory.IPhone;
import com.gpvip.pattern.factory.Phone;
import com.gpvip.pattern.factory.SamsungPhone;

public class Factory {
     Factory(){

    }

//    public Phone CreatePhone(String name){
//        if ("iphone".equals(name)){
//            return new IPhone();
//        }
//        else if ("samsung".equals(name)){
//            return new SamsungPhone();
//        }
//        else if ("huawei".equals(name))
//            return new HuaweiPhone();
//        else
//            return null;
//
//    }



    public Phone CreatePhone(Class<? extends Phone> clazz){
      try {
          if (null != clazz)
             return clazz.newInstance();
      }
      catch (Exception e){
          e.printStackTrace();
      }
      return null;

    }
}
