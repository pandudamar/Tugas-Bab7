package Laporan7Bab7;

public class Gold extends Anggota {
    
private double discount;
    public Gold (String n,String id,String member,boolean cream, boolean pot, boolean rebon,boolean bed, boolean lips){
        super(n,id,member,cream,pot,rebon,bed,lips);
        discount=0.15;
        super.member="Gold";
    }
    public double getCream(){
        return creambath*discount;
    }
    public double getPotong(){
        return potong*discount;
    }
    public double getRebo(){
        return rebonding*discount;
    }
    public double getBedak(){
        return bedak*(discount+0.1);
    }
    public double getLipstik(){
        return lipstik*(discount+0.1);
    }
    public double getHargaTotal(){
        double hargaT=0.0;    
        if (super.cream==true){
            hargaT+=creambath;
        } else if(super.pot==true){
            hargaT+=potong;
        } else if (super.rebon==true){
            hargaT+=rebonding;
        } else if (super.bed==true){
            hargaT+=bedak;
        } else if (super.lips==true){
            hargaT+=lipstik;
        }
        return super.hargaTotal=hargaT;
    }
}