package Invocacoes;
import models.GuardianForces;
import Interface.BattleCommands;
import models.Enemy;

public class GFDiablos implements BattleCommands {
    
    @Override
    public void Invocar(GuardianForces GF, Enemy enemy) {
        int enemyHP = enemy.getHP();
         //CORREÇÃO DA DIVISÃO: Multiplicamos primeiro para depois dividir.
        // Assim o Java não zera o resultado!
        int DMG = (enemy.getHP() * GF.getLevel()) / 100;
        if (DMG > 9999) {
            DMG = 9999;
         }
        enemyHP -= DMG;
        System.out.println("\n\nDiablos Invocado!");
        System.out.println("\n \nCausou " + DMG + " de dano!");
        System.out.println("HP restante do inimigo: " + enemyHP);
    }
    
}