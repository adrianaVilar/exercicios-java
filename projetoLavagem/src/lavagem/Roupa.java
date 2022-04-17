package lavagem;

public class Roupa {

    private boolean roupaLimpa;
    private boolean roupaSeca;
    private boolean roupaGuardada;

    public Roupa (boolean roupaLimpa, boolean roupaSeca, boolean roupaGuardada) {
        this.roupaLimpa = roupaLimpa;
        this.roupaSeca = roupaSeca;
        this.roupaGuardada = roupaGuardada;
    }

    public boolean getRoupaLimpa() {
        return this.roupaLimpa;
    }

    public void setRoupaLimpa(boolean roupaLimpa) {
        this.roupaLimpa = roupaLimpa;
    }

    public boolean getRoupaSeca() {
        return this.roupaSeca;
    }

    public void setRoupaSeca(boolean roupaSeca) {
        this.roupaSeca = roupaSeca;
    }

    public boolean getRoupaGuardada() {
        return roupaGuardada;
    }

    public void setRoupaGuardada(boolean roupaGuardada) {
        this.roupaGuardada = roupaGuardada;
    }
}
