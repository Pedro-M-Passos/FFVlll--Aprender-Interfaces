package Invocacoes;
import models.Enemy;
import models.GuardianForces;
import Interface.BattleCommands;

public class GFEmAcao {
    public void Executar(BattleCommands comando,GuardianForces GF, Enemy enemy) {
        comando.Invocar(GF, enemy);
    }
}
