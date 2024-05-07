import java.util.Date;
public class Cliente {

        String nome;

        String endereco;

        Date data;
        public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }
        public Date getData() {
            return data;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

}