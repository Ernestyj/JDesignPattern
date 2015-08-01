package eugene.behavioral.memento;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * Star uses "mementos" to store and restore state.
 *
 */
public class Star {
    private int ageYears;
    private int massTons;
    private StarType type;

    public Star(StarType type, int ageYears, int massTons) {
        this.ageYears = ageYears;
        this.massTons = massTons;
        this.type = type;
    }

    public void timePasses(){
        ageYears *= 2;
        massTons *= 8;
        switch (type) {
            case RED_GIANT:
                type = StarType.WHITE_DWARF;
                break;
            case SUN:
                type = StarType.RED_GIANT;
                break;
            case SUPERNOVA:
                type = StarType.DEAD;
                break;
            case WHITE_DWARF:
                type = StarType.SUPERNOVA;
                break;
            case DEAD:
                ageYears *= 2;
                massTons = 0;
                break;
            default:
                break;
        }
    }

    StarMemento getMemento(){
        StarMementoInternal state = new StarMementoInternal();
        state.setAgeYears(ageYears);
        state.setMassTons(massTons);
        state.setType(type);
        return state;
    }
    void setMemento(StarMemento memento){
        StarMementoInternal state = (StarMementoInternal) memento;
        this.type = state.getType();
        this.ageYears = state.getAgeYears();
        this.massTons = state.getMassTons();
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type.toString(),
                ageYears, massTons);
    }

    /**
     *
     * StarMemento implementation
     *
     */
    private static class StarMementoInternal implements StarMemento{
        private int ageYears;
        private int massTons;
        private StarType type;

        public StarType getType(){
            return type;
        }

        public void setType(StarType type){
            this.type = type;
        }

        public int getAgeYears() {
            return ageYears;
        }

        public void setAgeYears(int ageYears) {
            this.ageYears = ageYears;
        }

        public int getMassTons() {
            return massTons;
        }

        public void setMassTons(int massTons) {
            this.massTons = massTons;
        }

        private StarMementoInternal() {
        }
    }
}
