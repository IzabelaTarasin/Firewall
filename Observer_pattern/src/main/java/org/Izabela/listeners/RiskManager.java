package org.Izabela.listeners;

import org.Izabela.incident.Incident;

import java.util.Random;

public class RiskManager implements IEventListener {
    private Random fate = new Random();

    public void assessment(Incident incident){
        System.out.println("risk assessment...");
        if((fate.nextInt(200) % 4) > 2){
           manager(incident);
        } else {
            System.out.println("false incident");
        }
    }
    @Override
    public void update(Incident incident) {
        assessment(incident);
    }

    private void manager(Incident incident){
        System.out.println("incident " + incident + " removed !!!!");
    }
}
