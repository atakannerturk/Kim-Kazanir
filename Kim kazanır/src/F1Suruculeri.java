// 1181602012 Ali Atakan Küçük
// 1181602018 Atakan Ertürk

public class F1Suruculeri {
    private int id;
    private String adsoyad;
    private int surucukabiliyet;
    private int surucudeneyim;


    public F1Suruculeri(int id,String adsoyad,int surucukabiliyet, int surucudeneyim) {
        this.id = id;
        this.adsoyad = adsoyad;
        this.surucukabiliyet = surucukabiliyet;
        this.surucudeneyim = surucudeneyim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public int getSurucukabiliyet() {
        return surucukabiliyet;
    }

    public void setSurucukabiliyet(int surucukabiliyet) {
        this.surucukabiliyet = surucukabiliyet;
    }

    public int getSurucudeneyim() {
        return surucudeneyim;
    }

    public void setSurucudeneyim(int surucudeneyim) {
        this.surucudeneyim = surucudeneyim;
    }

    @Override
    public String toString() {
        return adsoyad+" "+"Surucu " + id + " = " + "Surucu Kabiliyeti: " + surucukabiliyet + " Surucu Deneyimi: " + surucudeneyim;
    }

    public int surucupuanlariToplami(){
        return (surucudeneyim + surucukabiliyet)*2;
    }


}