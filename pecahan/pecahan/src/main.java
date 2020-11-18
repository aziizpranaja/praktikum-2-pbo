public class main 
{
    public static void main(String[] args) 
    {
        pecahan angka1 = new pecahan(3, 2);

        System.out.println("PECAHAN \n");
        System.out.println("Angka 1 = " + angka1.getPembilang() + "/" + angka1.getPenyebut());

        pecahan p;
        int x, y;	
           
        p = angka1.tambah(angka1);
    
        x = p.pembilang;
        y = p.penyebut;        
        System.out.println("Hasil = " + x + "/" + y);
    }
}
