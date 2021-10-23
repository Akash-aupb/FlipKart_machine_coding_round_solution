import model.Consumer;
import model.Vendor;
import repository.ConsumerRepo;
import repository.VendorRepo;
import service.ConsumerServiceImp;
import service.ConsumerServiceInterface;
import service.VendorServiceImp;
import service.VendorServiceInterface;

public class DriverClass {

    public static void main(String args[]){



        ConsumerRepo consumerRepo = new ConsumerRepo();
        VendorRepo vendorRepo = new VendorRepo();
        VendorServiceInterface vendor = new VendorServiceImp(consumerRepo,vendorRepo);
        ConsumerServiceInterface consumer = new ConsumerServiceImp(consumerRepo,vendorRepo);
        consumer.registerConsumer("H1", "Hospital", "Bengaluru", "Karnataka", 150);
        consumer.registerConsumer("H3", "Hospital", "Varanasi", "UP", 150);
        consumer.registerConsumer("H2", "Hospital", "Bengaluru", "Karnataka", 150);
        consumer.registerConsumer("l1", "Industry", "Bengaluru", "Karnataka", 150);
        vendor.registerVendor("Bengaluru", "Karnataka", 100, 100);
       vendor.registerVendor("Mysuru", "Karnataka", 50, 100);
//

        consumer.showHospital("Bengaluru");
        consumer.showIndustries("Bengaluru");
       consumer.bookOxygen("l1", 100);
       vendor.showVendors("Karnataka");

    }
}
