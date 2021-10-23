package service;


import model.Consumer;
import model.Vendor;
import repository.ConsumerRepo;
import repository.VendorRepo;

public class ConsumerServiceImp implements ConsumerServiceInterface{

    ConsumerRepo consumerRepo ;
    VendorRepo vendorRepo ;


   public ConsumerServiceImp(ConsumerRepo cr, VendorRepo vr){
        this.consumerRepo = cr;
        this.vendorRepo = vr;
    }

    @Override
    public Consumer registerConsumer(String consumerId, String consumerType, String city, String state, int maximumRequirement) {

        Consumer  consumer = new Consumer(consumerId,consumerType,city,state,maximumRequirement);

        consumerRepo.addConsumers(consumer);

        return consumer;
    }

    void updateReq(String consumerId,int req){
        Consumer consumer = consumerRepo.getConsumer(consumerId);
       consumer.setMaximumRequirement(req);

    }

    @Override
    public boolean bookOxygen(String consumerId, int requirement) {


        Consumer consumer = consumerRepo.getConsumer(consumerId);
        String consumerType = consumer.getConsumerType();
        int Maxreq = consumer.getMaximumRequirement();

        if(consumerType.equals("Industry")) {
        System.out.println("inside industry use");
            for (Vendor v : vendorRepo.getVendors()) {


                if (v.getIndustrialOxygenCapacity() >= requirement) {
                    System.out.println("Successfull");
                    v.setIndustrialOxygenCapacity(v.getIndustrialOxygenCapacity() - requirement);
                    int remainingreq = Maxreq - requirement;
                    updateReq(consumerId, remainingreq);
                    return true;
                }


            }
                System.out.println("no");
                return false;

        }

        if(consumerType.equals("Hospital")){
            for (Vendor v : vendorRepo.getVendors()){
                if(v.getMedicalOxygenCapacity() > requirement){
                    System.out.println("Successfull");
                    v.setMedicalOxygenCapacity(v.getMedicalOxygenCapacity() - requirement);
                    int remainingreq = Maxreq - requirement;
                    updateReq(consumerId, remainingreq);
                    return true;
                }
            }

            int high = Integer.MIN_VALUE;
            String city="";
            for (Vendor v : vendorRepo.getVendors()){
                int capa = v.getIndustrialOxygenCapacity() + v.getMedicalOxygenCapacity();
                if(high < capa){
                    high = capa;
                    city = v.getCity();
                }
                Vendor vendor = vendorRepo.getVendorCity(city);
                System.out.println("Successfull");
                vendor.setMedicalOxygenCapacity(vendor.getMedicalOxygenCapacity() - requirement);
                int remainingreq = Maxreq - requirement;
                updateReq(consumerId, remainingreq);
                return true;
            }
        }
        return false;
    }

    @Override
    public void showHospital(String city) {
        System.out.println("---------");
        System.out.println("Hospitals present in "+city);
        for (Consumer c : consumerRepo.getConsumers()) {
        //System.out.println(c);
            if (c.getCity() == city) {

                if ( (c.getConsumerId().charAt(0)) =='H' ){
                    System.out.println("Hospital :"+c);
                }
            }
        }
        System.out.println("---------");
    }

    @Override
    public void showIndustries(String city) {
        System.out.println("---------");
        System.out.println("Indutries present in "+city);
        for (Consumer c : consumerRepo.getConsumers()) {
           // System.out.println(c);
            if (c.getCity().equals(city)) {
                if (c.getConsumerId().charAt(0) == 'l') {
                    System.out.println("Industry :"+c);
                }
            }
        }
        System.out.println("---------");
    }

}
