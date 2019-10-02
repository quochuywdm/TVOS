package startup;


import java.util.ArrayList;
import java.util.List;

import Service.HomeScreenService;
import materialien.Kanal;
import werkzeug.HomeScreenWerkzeug;

/**
 * Startet die Anwendung.
 * 
 * @author Quoc Huy Nguyen
 */
public class StartUp
{

    public static void main(String[] args)
    {
        HomeScreenService homeScreenService = erzeugeHomeScreenService();
        HomeScreenWerkzeug homescreen = new HomeScreenWerkzeug(homeScreenService);
        
    }
    
    /**
     * Erzeugen das HomeScreenService 
     * @return gomeScreenService
     */
    private static HomeScreenService erzeugeHomeScreenService()
    {
        HomeScreenService homeScreenService = new HomeScreenService(erzeugeBeispielKanaele());
        
        return homeScreenService;
        
    }

    /**
     * Erzeugen eine Liste der Kanälen
     * @return List<Kanal>
     */
    private static List<Kanal> erzeugeBeispielKanaele()
    {
        List<Kanal> kanalListe = new ArrayList<Kanal>();
        kanalListe.add(new Kanal ("VTV", "Vietnam Television", "Vietnamese", "Vietnam", "Videos/VTV.mp4"));
        kanalListe.add(new Kanal ("VTC", "Vietnam Multimedia Corporation", "Vietnamese", "Vietnam", "Videos/VTC.mp4"));
        kanalListe.add(new Kanal ("PRO7", "ProSieben", "Deutsch", "Deutschland", "Videos/PRO7.mp4"));
        return kanalListe;
        
    }
}
