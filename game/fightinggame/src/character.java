

public class character 
{
    private String nama;
    private int nyawa;
    private int attackHitPoint;
    private int attackKickPoint;

    public character(String nama, int attackHitPoint, int attackKickPoint )
    {
        this.nama = nama;
        this.nyawa = 100;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getNama()
    {
        return nama;
    }

    public int getNyawa()
    {
        return nyawa;
    }

    public void hit(character karB)
    {
        karB.nyawa -= this.attackHitPoint;
    }

    public void kick(character karB)
    {
        karB.nyawa -= this.attackKickPoint;
    }
}