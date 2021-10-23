package repository;

import model.Vendor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class VendorRepo {


    ArrayList<Vendor> vendors = new ArrayList<>();

//    public HashMap<String, Vendor> getVendors() {
//        return vendors;
//    }

    public void addVendors(Vendor vendor) {
       vendors.add(vendor);
    }

    public ArrayList<Vendor> getVendors() {
        return vendors;
    }

    public Vendor getVendorCity(String city){
        for(Vendor v: vendors){
            if(v.getCity() == city){
                return v;
            }

        }
        return null;
    }
//    public ArrayList<HashMap<String, Vendor>> getVendorList() {
//        return vendorList;
//    }

//    Iterator it = vendorList.iterator();
//
//    Vendor getMaxIndusrtyCapa(){
//
//        int max = Integer.MIN_VALUE;
//        while(it.hasNext()){
//            it.next();
//        }
//
//    }
}
