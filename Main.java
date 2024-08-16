import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello Word");
        System.out.print("Hello guys");
        System.out.println("pertemuan 1");
        int age = 20;
        System.out.printf("umur saya %d\n", age);
        System.out.format("umur saya %d\n", age);

        String nama = "Nur Jamilah";
        System.out.println(nama);
        System.out.println(nama.charAt(2));

        if(nama.equalsIgnoreCase("nur jamilah")){
            System.out.println("sama");
        }

        if(nama.equals("Nur Jamilah")){
            System.out.println("sama2");
        }

        int[] arr = {22, 52, 15, 7, 8, 18};
        System.out.println(arr[2]);

        int[] number = new int[5]; 
        number[0] = 10; 
        number[1] = 20; 
        number[2] = 30; 
        number[3] = 70; 
        number[4] = 90; 
        System.out.println(number[2]); 

        Arrays.sort(arr);
        System.out.println("Hasil pengurutan : " + Arrays.toString(arr));
        Integer[] arr2 = {20, 12, 15, 7, 8, 18};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Hasil pengurutan : " + Arrays.toString(arr2));

        Integer[] arr3 = Arrays.copyOf(arr2, 8);
        System.out.println(Arrays.toString(arr3));

        Integer[] arr4 = new Integer[5];
        Arrays.fill(arr4,7);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {2, 4, 6, 8, 10, 12, 14};
        int index = Arrays.binarySearch(arr5, 8);
        if (index >= 0) {
            System.out.println("Elemen 8 ditemukan pada indeks: " + index);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }

        // membuat ArrayList 
        ArrayList<String> listName = new ArrayList<>(); 
        // menambahkan nilai ke elemen ArrayList 
        listName.add("Dilan"); 
        listName.add("Milea"); 
        // mengambil nilai ArrayList 
        System.out.println(listName.get(0)); 
        System.out.println(listName.get(1));
        
        System.out.println(listName.size());

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
        String nama2; 
        System.out.print("Masukan nama : "); 
        nama2 = input.readLine(); 
        System.out.println("Selamat datang " + nama2); 
        
        Scanner input2 = new Scanner(System.in); 
        System.out.print("Nama : "); 
        String nama3 = input2.nextLine(); 
        System.out.println("Selamat Datang " + nama3); 
        
    }
}