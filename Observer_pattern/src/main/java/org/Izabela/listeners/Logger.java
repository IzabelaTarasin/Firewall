package org.Izabela.listeners;

import org.Izabela.incident.Incident;

public class Logger implements IEventListener {

    public void log(Incident incident){
        System.out.println("detect : " + incident);
    }
    @Override
    public void update(Incident incident) {
        log(incident);
    }
}
