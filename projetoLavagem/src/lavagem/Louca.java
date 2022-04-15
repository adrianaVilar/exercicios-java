package lavagem;

public class Louca {

    private boolean loucaLimpa;
    private boolean loucaSeca;
    private boolean loucaGuardada;

    public Louca (boolean loucaLimpa, boolean loucaSeca, boolean loucaGuardada){
        this.loucaLimpa = loucaLimpa;
        this.loucaSeca = loucaSeca;
        this.loucaGuardada = loucaGuardada;
    }

    public boolean getLoucaLimpa(){
        return this.loucaLimpa;
    }

    public void setLoucaLimpa(boolean loucaLimpa){
        this.loucaLimpa = loucaLimpa;
    }

    public boolean getLoucaSeca(){
        return this.loucaSeca;
    }

    public void setLoucaSeca(boolean loucaSeca){
        this.loucaSeca = loucaSeca;
    }

    public boolean getLoucaGuardada(){
        return this.loucaGuardada;
    }

    public void setLoucaGuardada(boolean loucaGuardada){
        this.loucaGuardada = loucaGuardada;
    }
}
