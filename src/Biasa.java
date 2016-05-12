package Laporan7Bab7;

public class Biasa extends Anggota {
    
public Biasa (String n,String id,String member,boolean cream, boolean pot, boolean rebon,boolean bed, boolean lips){
        super(n,id,member,cream,pot,rebon,bed,lips);
        super.member="Biasa";
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

