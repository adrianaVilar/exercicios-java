package lavagem;

public class MaquinaDeSecar {

    public void seca(Louca louca){
        if(louca.getLoucaSeca()){
            return;
        }

        louca.setLoucaSeca(true);
        louca.setLoucaGuardada(false);
    }
}
