public class GoblinArmyFactory implements Army{

    @Override
    public Commander createCommander() {
        return new GoblinCommander();
    }

    @Override
    public General createGeneral() {
        return new GoblinGeneral();
    }

    @Override
    public Soldier createSoldier() {
        return new GoblinSoldier();
    }
}
