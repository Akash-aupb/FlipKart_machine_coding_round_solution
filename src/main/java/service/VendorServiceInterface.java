package service;

import model.Vendor;

public interface VendorServiceInterface {

    Vendor registerVendor(String city, String state, int medicalOxygenCapacity, int industrialOxygenCapacity);

    void showVendors(String state);
}
