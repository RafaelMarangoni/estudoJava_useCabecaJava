package ExercicioSantander;

public class Clientes {

    private int numeroCliente;
    protected String sobrenome;
    private int RG;
    private int CPF;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Clientes() {
    }

    public Clientes(int numeroCliente, String sobrenome, int RG, int CPF) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "numeroCliente=" + numeroCliente +
                ", sobrenome='" + sobrenome + '\'' +
                ", RG=" + RG +
                ", CPF=" + CPF +
                '}';
    }
}

