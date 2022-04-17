package lavagem;

public class MaquinaDeLavarRoupa {

    public void lava(Roupa roupa) {
        if (roupa.getRoupaLimpa()) {
            return;
        }

        roupa.setRoupaLimpa(true);
        roupa.setRoupaSeca(false);
        roupa.setRoupaGuardada(false);
    }
}

