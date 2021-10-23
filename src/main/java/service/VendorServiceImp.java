package service;

import model.Vendor;
import repository.ConsumerRepo;
import repository.VendorRepo;

import java.util.HashMap;

public class VendorServiceImp implements VendorServiceInterface {

    VendorRepo vendorRepo;
    ConsumerRepo consumerRepo;

    public VendorServiceImp(ConsumerRepo cr, VendorRepo vr){
    this.vendorRepo = vr;
    this.consumerRepo = cr;
    }

    @Override
    public Vendor registerVendor(String city, String state, int medicalOxygenCapacity, int industrialOxygenCapacity) {



        //HashMap<String, Vendor> vendors = vendorRepo.getVendors();

        for (Vendor v : vendorRepo.getVendors()) {
            if (v.getCity() == city) {
                System.out.println("no");
                return null;
            }
        }

                Vendor vendor = new Vendor(city, state, medicalOxygenCapacity, industrialOxygenCapacity);
                vendorRepo.addVendors(vendor);

                return vendor;



    }

    @Override
    public void showVendors(String state) {
        System.out.println("---------");
        System.out.println("Vendors present in "+state);
        for(Vendor v: vendorRepo.getVendors()){
            if(v.getState() == state){
                System.out.println("Vendor :"+v);
           }
        }
        System.out.println("---------");
    }

//    void showVendors(String state){
//
//    }



}
