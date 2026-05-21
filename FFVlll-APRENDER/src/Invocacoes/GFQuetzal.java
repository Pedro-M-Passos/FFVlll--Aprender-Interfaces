package Invocacoes;
import models.Enemy;
import models.GuardianForces;
import Interface.BattleCommands;



public class GFQuetzal implements BattleCommands {
    
    @Override
    public void Invocar(GuardianForces GF, Enemy enemy) {
        int enemyHP = enemy.getHP();  
        int DMG = GF.getPoderBase() * (((GF.getMAG() * 3) / 2 ) + 20);
        enemyHP -= DMG;
        System.out.println("\n\nQuetzalcoatl Invocado!");


        System.out.println("  _______  _    _  _    _  _   _  _____   ______  _____     _____  _______   ____   _____   __  __ ");
        System.out.println(" |__   __|| |  | || |  | || \\ | ||  __ \\ |  ____||  __ \\   / ____||__   __| / __ \\ |  __ \\ |  \\/  |");
        System.out.println("    | |   | |__| || |  | ||  \\| || |  | || |__   | |__) | | (___     | |   | |  | || |__) || \\  / |");
        System.out.println("    | |   |  __  || |  | || . ` || |  | ||  __|  |  _  /   \\___ \\    | |   | |  | ||  _  / | |\\/| |");
        System.out.println("    | |   | |  | || |__| || |\\  || |__| || |____ | | \\ \\   ____) |   | |   | |__| || | \\ \\ | |  | |");
        System.out.println("    |_|   |_|  |_| \\____/ |_| \\_||_____/ |______||_|  \\_\\ |_____/    |_|    \\____/ |_|  \\_\\|_|  |_|");


        System.out.println("           _______");
        System.out.println("          /      /");
        System.out.println("         /      /");
        System.out.println("        /      /");
        System.out.println("       /      /");
        System.out.println("      /      /");
        System.out.println("     /      /");
        System.out.println("    /      /_____");
        System.out.println("   /____        /");
        System.out.println("        /     / ");
        System.out.println("       /    /");
        System.out.println("      /   /");
        System.out.println("     /  /");
        System.out.println("    / /");
        System.out.println("    /");


        System.out.println("\n \nCausou " + DMG + " de dano!");
        System.out.println("HP restante do inimigo: " + enemyHP);
    }
    
}