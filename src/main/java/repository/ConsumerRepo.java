package repository;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import model.Consumer;

import java.util.ArrayList;
import java.util.HashMap;

public class ConsumerRepo {

    ArrayList<Consumer> consumers = new ArrayList<>();

   //public static ConsumerRepo INSTANCE =new ConsumerRepo();

    public ArrayList<Consumer> getConsumers() {
        return consumers;
    }

    public Consumer getConsumer(String id) {
        for(Consumer c : consumers){
            if(c.getConsumerId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public void addConsumers(Consumer con) {
       // System.out.println("called");
        consumers.add(con);
    }
}
