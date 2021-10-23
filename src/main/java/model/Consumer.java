package model;

public class Consumer {
    private String consumerId;


    private String consumerType;
    private String city;
    private String state;
    private int maximumRequirement;

    public void setMaximumRequirement(int maximumRequirement) {
        this.maximumRequirement = maximumRequirement;
    }


    @Override
    public String toString() {
        return "Consumer{" +
                "consumerId='" + consumerId + '\'' +
                ", consumerType='" + consumerType + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", maximumRequirement=" + maximumRequirement +
                '}';
    }
    //default constructor
    public Consumer() {
    }

    public Consumer(String consumerId, String consumerType, String city, String state, int maximumRequirement) {
        this.consumerId = consumerId;
        this.consumerType = consumerType;
        this.city = city;
        this.state = state;
        this.maximumRequirement = maximumRequirement;
    }

//    public Consumer registerConsumer(String consumerId, String consumerType, String city, String state, int maximumRequirement){
//        Consumer consumer = new Consumer(consumerId,consumerType,city,state,maximumRequirement);
//        return consumer;
//    }

    public String getConsumerId() {
        return consumerId;
    }

    public String getConsumerType() {
        return consumerType;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getMaximumRequirement() {
        return maximumRequirement;
    }
}

/*
* registerConsumer(consumerId, consumerType  ,city, state, maximum requirement)
registerConsumer(‘H1’, ‘Hospital’, ‘Bengaluru’, ‘‘Karnataka’, 150)

 *
* */