package org.Izabela;

import org.Izabela.publisher.Firewall;
import org.Izabela.listeners.Logger;
import org.Izabela.listeners.RiskManager;

public class Main {
    public static void main(String[] args) {
        Firewall firewall = new Firewall();
        Logger logger = new Logger();
        RiskManager riskManager = new RiskManager();

        try {
            firewall.eventListener.add(logger);
            firewall.eventListener.add(riskManager);

            firewall.startFirewall();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}