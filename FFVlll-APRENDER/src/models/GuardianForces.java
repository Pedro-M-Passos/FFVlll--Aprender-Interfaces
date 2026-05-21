package models;

public class GuardianForces{
    
    
    private double  SumMag;
    private final int PoderBase = 26;
    private int Level;
    private int MAG;

    public GuardianForces(int SumMag, int Level){
        this.SumMag = SumMag;
        this.Level = Level;
    }

    public int getMAG() {
        // Fórmula de crescimento base adaptada para Java
        double magBase = (this.Level * 1.2) + 12;
        
        // Aplica os bônus de habilidades (ex: MAG +20% e +40%)
        double magFinal = magBase * (1.0 + this.SumMag);
        
        // Retorna como int, pois atributos no FF8 são números inteiros
        return (int) magFinal; 
    }

    public int getLevel() {
        return Level;
    }

    public int getPoderBase() {
        return PoderBase;
    }

    public double getSumMag() {
        return SumMag;
    }
}