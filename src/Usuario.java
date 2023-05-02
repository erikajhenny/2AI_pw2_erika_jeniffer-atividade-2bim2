import java.time.LocalDate;
public class Usuario {
    private int Codigo;
    private String Nome;
    private String senha;
    private int tentativasDeAcesso;
    private Boolean PrimeiroAcesso;
    private LocalDate DataDeInativacao;
    private String Status;
    public String usuario;

    public Usuario() {
        this.PrimeiroAcesso = true;
        this.senha = "etec#123";
        this.Status = "ATIVO";
    }

    public void setsenha( String senha){
        this.PrimeiroAcesso = false;
        this.Status = "ATIVO";
        this.tentativasDeAcesso = 0;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTentativasDeAcesso() {
        return tentativasDeAcesso;
    }

    public void setTentativasDeAcesso(int tentativasDeAcesso) {
        this.tentativasDeAcesso = tentativasDeAcesso;
    }

    public Boolean getPrimeiroAcesso() {
        return PrimeiroAcesso;
    }

    public void setPrimeiroAcesso(Boolean primeiroAcesso) {
        PrimeiroAcesso = primeiroAcesso;
    }

    public LocalDate getDataDeInativacao() {
        return DataDeInativacao;
    }

    public void setDataDeInativacao(LocalDate dataDeInativacao) {
        DataDeInativacao = dataDeInativacao;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
