
public class Main {
    public static void main(String[] args) {
        Army orcArmy = new OrcArmyFactory();
        Army goblinArmy = new GoblinArmyFactory();

        General orcGeneral = orcArmy.createGeneral();
        General goblinGeneral = goblinArmy.createGeneral();
        Commander orcCommander = orcArmy.createCommander();
        Commander goblinCommander = goblinArmy.createCommander();
        Soldier orcSoldier = orcArmy.createSoldier();
        Soldier goblinSoldier = goblinArmy.createSoldier();

        orcGeneral.shout();
        orcCommander.shout();
        orcSoldier.shout();
        System.out.println();
        goblinGeneral.shout();
        goblinCommander.shout();
        goblinSoldier.shout();

    }
}