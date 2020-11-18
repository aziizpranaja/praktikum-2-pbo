

public class main 
{
    public static void main(String[] args)
    {
        character raiden = new character("Raiden", 10, 20);
        character subZero =  new character("Sub-Zero", 5, 25);

        System.out.println("ROUND 1 FIGHT!!!");
        
        System.out.println("Raiden Melakukan Tendangan Kepada Sub-Zero");
        raiden.kick(subZero);
        System.out.println("Nyawa Raiden : " + raiden.getNyawa());
        System.out.println("Nyawa Sub-Zero : " + subZero.getNyawa());

        System.out.println("Sub-Zero melakukan tendangan balik kepada Raiden");
        subZero.kick(raiden);
        System.out.println("Nyawa Raiden : " + raiden.getNyawa());
        System.out.println("Nyawa Sub-Zero : " + subZero.getNyawa());

        System.out.println("Sub-Zero menyerang Raiden dengan pukulan berturut-turut sebanyak 3 kali");
        for(int i = 0; i < 3; i++)
        {
            subZero.hit(raiden);
        }
        System.out.println("Nyawa Raiden : " + raiden.getNyawa());
        System.out.println("Nyawa Sub-Zero : " + subZero.getNyawa());

        System.out.println("Raiden menyerang Sub-Zero dengan tendangan berturut-turut sebanyak 4 kali");
        for(int i = 0; i < 4; i++)
        {
            raiden.kick(subZero);
        }
        System.out.println("Nyawa Raiden : " + raiden.getNyawa());
        System.out.println("Nyawa Sub-Zero : " + subZero.getNyawa());

        String pemenang = raiden.getNyawa() > subZero.getNyawa() ? "Raiden" : "Sub-Zero";
        System.out.println("Pemenangnya Adalah : " + pemenang + "\n");
        System.out.println("GAME OVER");
    }
}
