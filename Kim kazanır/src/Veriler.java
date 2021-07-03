// 1181602012 Ali Atakan Küçük
// 1181602018 Atakan Ertürk

import java.util.ArrayList;

public class Veriler {
    public ArrayList<F1Araclari> AracListesi(){
        F1Araclari arac1 = new F1Araclari(1,"Ferrarı",9,9,9);
        F1Araclari arac2 = new F1Araclari(2,"Mercedes",9,10,9);
        F1Araclari arac3 = new F1Araclari(3,"Red Bull",8,9,7);
        F1Araclari arac4 = new F1Araclari(4,"Mclaren",8,8,6);
        F1Araclari arac5 = new F1Araclari(5,"Renault",7,6,7);
        F1Araclari arac6 = new F1Araclari(6,"Alfa Romeo",6,5,6);
        F1Araclari arac7 = new F1Araclari(7,"Haas",7,4,4);
        F1Araclari arac8 = new F1Araclari(8,"Toro Rosso",7,3,5);
        F1Araclari arac9 = new F1Araclari(9,"Racing Point",4,5,3);
        F1Araclari arac10 = new F1Araclari(10,"Williams",6,2,5);


        ArrayList<F1Araclari> araclar = new ArrayList<F1Araclari>();
        araclar.add(arac1);
        araclar.add(arac2);
        araclar.add(arac3);
        araclar.add(arac4);
        araclar.add(arac5);
        araclar.add(arac6);
        araclar.add(arac7);
        araclar.add(arac8);
        araclar.add(arac9);
        araclar.add(arac10);

        return araclar;

    }
    public ArrayList<F1Suruculeri> SurucuListesi(){
        F1Suruculeri surucu1 = new F1Suruculeri(1,"Michael Schumacher",9,9);
        F1Suruculeri surucu2 = new F1Suruculeri(2,"Sebastian Vettel",7,7);
        F1Suruculeri surucu3 = new F1Suruculeri(3,"Kimi Raikkonen",6,8);
        F1Suruculeri surucu4 = new F1Suruculeri(4,"Charles Lecrec",7,8);
        F1Suruculeri surucu5 = new F1Suruculeri(5,"Lewis Hamilton",5,7);
        F1Suruculeri surucu6 = new F1Suruculeri(6,"Valtteri Bottas",7,8);
        F1Suruculeri surucu7 = new F1Suruculeri(7,"Lando Norris",5,4);
        F1Suruculeri surucu8 = new F1Suruculeri(8,"Nicholas Latifi",8,5);
        F1Suruculeri surucu9 = new F1Suruculeri(9,"Fernando Alonso",8,8);
        F1Suruculeri surucu10 = new F1Suruculeri(10,"Max Verstappen",7,8);

        ArrayList<F1Suruculeri> suruculer = new ArrayList<F1Suruculeri>();
        suruculer.add(surucu1);
        suruculer.add(surucu2);
        suruculer.add(surucu3);
        suruculer.add(surucu4);
        suruculer.add(surucu5);
        suruculer.add(surucu6);
        suruculer.add(surucu7);
        suruculer.add(surucu8);
        suruculer.add(surucu9);
        suruculer.add(surucu10);

        return suruculer;
    }


    public int VeriToplam(int aracID,int surucuID){
        return AracListesi().get(aracID-1).aracpuanlariToplami() + SurucuListesi().get(surucuID-1).surucupuanlariToplami();
    }



}


