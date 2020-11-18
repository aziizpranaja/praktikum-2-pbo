public class pecahan 
{
    public int pembilang;
    public int penyebut;
    
    public pecahan(int pembilang, int penyebut)
    {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public int getPembilang()
    {
        return pembilang;
    }

    public int getPenyebut()
    {
        return penyebut;
    }

    public pecahan tambah(pecahan p)
    {
        int atas;   
        int bawah;
      
        pecahan angka1;
	    angka1 = p;       
	
	    atas = p.pembilang;
        bawah = p.penyebut;

        pecahan angka2 = new pecahan(5,6); 
        System.out.println("Angka 2 = " + angka2.getPembilang() + "/" + angka2.getPenyebut());
        System.out.println("\n");

        if(bawah == angka2.penyebut) {
            p.pembilang = atas + angka2.pembilang;
            p.penyebut = bawah;
            
        } else {
            p.pembilang = (angka2.penyebut * atas) + (bawah * angka2.pembilang);
            p.penyebut = bawah * angka2.penyebut;     
        
        }
        return p;
    }
}
