package lavagem;

public class GuardaRoupa {

    public void guardaRoupa(Roupa roupa){
        if(roupa.getRoupaGuardada()){
            return;
        }

        roupa.setRoupaGuardada(true);
    }
}
