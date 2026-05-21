
import Interface.BattleCommands;
import Invocacoes.GFDiablos;
import Invocacoes.GFEmAcao;
import Invocacoes.GFQuetzal;
import models.GuardianForces;




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         GuardianForces gf = new GuardianForces(
                0, // SumMag
                6   // Level
        );

        GFEmAcao gfEmAcao = new GFEmAcao();

        BattleCommands Diablos  = new GFDiablos();
        BattleCommands Quetzalcoatl = new GFQuetzal();
        
        System.out.println("\nInvocando Diablos:");
        gfEmAcao.Executar(Diablos, gf, new models.Enemy(3000));
        System.out.println("\nInvocando Quetzalcoatl:");
        gfEmAcao.Executar(Quetzalcoatl, gf, new models.Enemy(3000));
        }

    }

