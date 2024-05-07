public class PessoaJuridica extends Cliente{

    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, String setor, int numFuncionarios){
        super(nome,endereco);
        this.cnpj = cnpj;
        this.setor = setor;
        this.numFuncionarios = numFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public int getnumFuncionarios() {
        return numFuncionarios;
    }

    public void setnumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cnpj);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de cadastro: " + getData());
        System.out.println("Setor: " + setor);
        System.out.println("Numero de Funcionarios: " + numFuncionarios);
    }

}
