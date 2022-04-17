package lavagem;

public class Armario {

    public void guarda(Louca louca){
        if(louca.getLoucaGuardada()){
            return;
        }

        louca.setLoucaGuardada(true);
    }
}
