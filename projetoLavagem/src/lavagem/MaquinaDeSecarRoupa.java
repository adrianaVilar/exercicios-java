package lavagem;

public class MaquinaDeSecarRoupa {

    public void seca(Roupa roupa) {
        if(roupa.getRoupaSeca()){
            return;
        }

        roupa.setRoupaSeca(true);
        roupa.setRoupaGuardada(false);
    }
}
