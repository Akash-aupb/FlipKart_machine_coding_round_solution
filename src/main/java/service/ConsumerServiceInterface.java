package service;

import model.Consumer;

public interface ConsumerServiceInterface {

    Consumer registerConsumer(String consumerId, String consumerType, String city, String state, int maximumRequirement);

    boolean bookOxygen(String consumerId, int requirement);

    void showHospital(String city);
    void showIndustries(String city);

   // boolean bookOxygen(String consumerId, int requirement);
}
