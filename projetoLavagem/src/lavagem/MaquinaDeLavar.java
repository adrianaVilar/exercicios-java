package lavagem;

public class MaquinaDeLavar {

    public void lava(Louca louca){
        if(louca.getLoucaLimpa()){
            return;
        }

        louca.setLoucaLimpa(true);
        louca.setLoucaSeca(false);
        louca.setLoucaGuardada(false);
    }

}
