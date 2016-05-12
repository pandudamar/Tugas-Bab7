package Laporan7Bab7;
import java.util.*;
public class Main {
        static Scanner s = new Scanner (System.in);
        static Scanner d = new Scanner (System.in);
    
        public static void main(String[] args) {
        ArrayList<Anggota> anggota = new ArrayList<Anggota>();
        menu(anggota);
    }
            public static void menu(ArrayList<Anggota> anggota) {
        do{
            System.out.println("=====Menu=====");
            System.out.println("|1. Input    |");
            System.out.println("|2. Tampil   |");
            System.out.println("|3. Keluar   |");
            System.out.print  ("|Pilih : "+"  |");
            int pilih = d.nextInt();
            switch (pilih){
                case 1: input(anggota);break;
                case 2: tampil(anggota);break;
                case 3: System.out.println("Pandu Damar Priambodo/ 155150401111134");System.exit(0);break;
            } 
        } while (true);
    }
    public static void tampil(ArrayList<Anggota> anggota) {     System.out.println("=================SALON===================");
        System.out.printf("%-8s%-15s%-8s%-10s\n","   id","     nama","Member","biaya");
        for (Anggota ang : anggota){ 
            System.out.printf("%-8s",ang.getID());
            System.out.printf("%-15s",ang.getNama());
            System.out.printf("%-8s",ang.getMember());
            System.out.printf("%-10.2f\n",ang.getHargaTotal());
        }
    }
    public static void input(ArrayList<Anggota>anggota) {
        back:
        do{
            System.out.print("\nMasukkan nama: ");
            String nama= s.nextLine();
            System.out.print("Masukkan ID:");
            String id = s.nextLine();
            System.out.print("apakah anda member? ");
            String member= s.nextLine();
            String memb="";
            if (member.equalsIgnoreCase("ya")){
                System.out.println("premium/gold/silver?");
                memb= s.nextLine();
            } else if (member.equalsIgnoreCase("tidak")){
                memb="biasa";
            }
        
            System.out.println("Mau jasa atau Barang? ");
            String mau= s.nextLine();
            boolean creambath =  false,potong =  false,rebonding =  false, bedak =  false, lipstik =  false;
            if (mau.equalsIgnoreCase("Jasa")){
              System.out.println("\n1. Creambath :  Rp. 65000");
                System.out.println("2. Potong    :  Rp. 15000");
                System.out.println("3. Rebonding :  Rp. 75000");
                String jasa=s.nextLine();
                if (jasa.equals("1")){
                    creambath= true;
                } else if (jasa.equals("2")){
                    potong=true;
                } else if (jasa.equals("3")){
                    rebonding=true;
                }
            } else if( mau.equalsIgnoreCase("Barang")){
              System.out.println("\n1. Bedak     : Rp. 15000");
                System.out.println("2. Lipstik   : Rp. 30000");
                String bara=s.nextLine();
                if (bara.equals("1")){
                    bedak=true;
                } else if (bara.equals("2")){
                    lipstik=true;
                }
            }
            if (memb.equalsIgnoreCase("premium")){
                anggota.add(new Premium(nama,id,memb,creambath,potong,rebonding,bedak,lipstik));
            }else if (memb.equalsIgnoreCase("gold")){
                anggota.add(new Gold(nama,id,memb,creambath,potong,rebonding,bedak,lipstik));    
            }else if (memb.equalsIgnoreCase("silver")){
                anggota.add(new Silver(nama,id,memb,creambath,potong,rebonding,bedak,lipstik));
            }else if (memb.equalsIgnoreCase("Biasa")){
                anggota.add(new Biasa(nama,id,memb,creambath,potong,rebonding,bedak,lipstik));
            }
            System.out.print("Masukkan data lagi Y/N ? ");
			String tambah = s.nextLine();
				if(tambah.equalsIgnoreCase("y")) continue back;
				else break;
        }while (true);
    }
}