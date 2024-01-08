package org.Izabela.publisher;

import org.Izabela.incident.Incident;
import org.Izabela.listeners.IEventListener;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

;

public class Firewall {
    private Incident[] incidents = EnumSet.allOf(Incident.class).toArray(new Incident[0]);
    public List<IEventListener> eventListener = new ArrayList<IEventListener>();
    private Random fate = new Random();

    public void startFirewall(){
        for(;;){
            try{
                Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                Incident incident = incidents[fate.nextInt(200) % incidents.length];
                for (IEventListener observer: eventListener){
                    observer.update(incident);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
