package main;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    Scanner scan = new Scanner(System.in);
    Vector<Barang> listBarang = new Vector<>();
    int counter = 0;


   
    private void clearScreen(){
        for(int i=0; i<25; i++){
            System.out.println("");
        }
    }

    public void tampilkanBarang(){
        if (listBarang.isEmpty()){
            System.out.println("\nBelum ada data barang");
        } else {
            for (int i=0; i < listBarang.size(); i++) {
              System.out.println("---------------");
              System.out.println("ID: "+listBarang.get(i).getId());
              System.out.println("Nama: "+listBarang.get(i).getNama());
              System.out.println("Harga: "+listBarang.get(i).getHarga());
              
            }
        }
    }
    private String generateID(){
//         String id = "BR" +String.format("%03d", counter);
//         counter++;
//         return id;

        return String.format("BR%03d",counter++);
    }
    public void tambahBarang(){
        String id;
        String nama;
        int harga;
        clearScreen();
        tampilkanBarang();

        System.out.printf("Nama Barang : ");
        nama = scan.nextLine();

        System.out.printf("Harga Barang : Rp. ");
        harga = scan.nextInt(); scan.nextLine();

        id = generateID();

        System.out.println("\n"+nama+" berhasil ditambahkan");

        // Barang barang = new Barang(id,nama,harga);
        // listBarang.add(barang);

        listBarang.add(new Barang(id,nama,harga));



        
    }
    public void hapusBarang(){

    }
    
    public Main(){
        int pilihan;

     do {
        System.out.println("Gudang Digital");
        System.out.println("--------------");
        System.out.println("1. Tampilkan List Barang");
        System.out.println("2. Tambah Barang");
        System.out.println("3. Hapus Barang");
        System.out.println("4. Exit");

        System.out.printf("Pilihan : ");

        pilihan = scan.nextInt(); scan.nextLine();

        if (pilihan==1) tampilkanBarang();
        else if (pilihan==2) tambahBarang();
        else if (pilihan==3) hapusBarang();
        else if (pilihan==4) System.out.println("\n Terima kasih telah menggunakan program ini :");
    
        scan.nextLine();
        clearScreen();
    } while (pilihan != 4);

    }
    public static void main(String[] args) {
        new Main();
    }
    
}
