// 1181602012 Ali Atakan Küçük
// 1181602018 Atakan Ertürk

public class F1Araclari {
    private int id;
    private String aracadi;
    private int aracgucu;
    private int aracdayaniklilik;
    private int aracyakitverim;


    public F1Araclari(int id,String aracadi,int aracgucu, int aracdayaniklilik,int aracyakitverim) {
        this.id = id;
        this.aracadi = aracadi;
        this.aracgucu = aracgucu;
        this.aracdayaniklilik = aracdayaniklilik;
        this.aracyakitverim = aracyakitverim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAracadi() {
        return aracadi;
    }

    public void setAracadi(String aracadi) {
        this.aracadi = aracadi;
    }

    public int getAracgucu() {
        return aracgucu;
    }

    public void setAracgucu(int aracgucu) {
        this.aracgucu = aracgucu;
    }

    public int getAracdayaniklilik() {
        return aracdayaniklilik;
    }

    public void setAracdayaniklilik(int aracdayaniklilik) {
        this.aracdayaniklilik = aracdayaniklilik;
    }

    public int getAracyakitverim() {
        return aracyakitverim;
    }

    public void setAracyakitverim(int aracyakitverim) {
        this.aracyakitverim = aracyakitverim;
    }

    @Override
    public String toString() {
        return aracadi+" "+"Arac " + id + " = " + "Arac Gucu: " + aracgucu + " Arac Dayanikliligi: " + aracdayaniklilik + " Yakit Verimliligi: " + aracyakitverim;
    }

    public int aracpuanlariToplami(){
        return (aracdayaniklilik + aracgucu + aracyakitverim)*2;
    }



}

