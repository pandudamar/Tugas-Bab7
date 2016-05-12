package Laporan7Bab7;
public abstract class  Anggota {
    protected String nama,id,member;
    protected boolean cream,pot,cur,rebon,bed,lips;
    protected double creambath,potong,rebonding,bedak,lipstik,hargaTotal;
    public Anggota (String nama, String id,String member,boolean cream, boolean pot, boolean rebon,boolean bed, boolean lips){
        this.nama=nama;
        this.id=id;
        this.member=member;
        this.creambath=65000;
        this.potong=15000;
        this.rebonding=75000;
        this.bedak=15000;
        this.lipstik=30000;
        this.cream=cream;
        this.pot=pot;
        this.rebon=rebon;
        this.bed=bed;
        this.lips=lips;
    }
    public String getNama(){
        return nama;
    }
    public String getID(){
        return id;
    }
    public String getMember(){
        return member;
    }
    public double getCream(){
        return creambath;
    }
    public double getPotong(){
        return potong;
    }
    public double getRebo(){
        return rebonding;
    }
    public double getBedak(){
        return bedak;
    }
    public double getLipstik(){
        return lipstik;
    }
    public abstract double getHargaTotal();
}

