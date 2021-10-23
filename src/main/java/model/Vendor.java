package model;

public class Vendor {

    private String city;
    private String state;
    private int medicalOxygenCapacity;
    private int industrialOxygenCapacity;

    @Override
    public String toString() {
        return "Vendor{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", medicalOxygenCapacity=" + medicalOxygenCapacity +
                ", industrialOxygenCapacity=" + industrialOxygenCapacity +
                '}';
    }

    //default constructor
    public Vendor() {
    }

    public Vendor(String city, String state, int medicalOxygenCapacity, int industrialOxygenCapacity) {
        this.city = city;
        this.state = state;
        this.medicalOxygenCapacity = medicalOxygenCapacity;
        this.industrialOxygenCapacity = industrialOxygenCapacity;
    }

    public void setMedicalOxygenCapacity(int medicalOxygenCapacity) {
        this.medicalOxygenCapacity = medicalOxygenCapacity;
    }

    public void setIndustrialOxygenCapacity(int industrialOxygenCapacity) {
        this.industrialOxygenCapacity = industrialOxygenCapacity;
    }
//    public Vendor registerVendor(String city, String state, int medicalOxygenCapacity, int industrialOxygenCapacity){
//
//        Vendor vendor = new Vendor(city,state,medicalOxygenCapacity,industrialOxygenCapacity);
//        return vendor;
//    }


    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getMedicalOxygenCapacity() {
        return medicalOxygenCapacity;
    }

    public int getIndustrialOxygenCapacity() {
        return industrialOxygenCapacity;
    }
}


/*
* registerVendor(city, state, medicalOxygenCapacity, industrialOxygenCapacity)
* registerVendor(‘Bengaluru’, ‘Karnataka’, 100, 100)

 * */