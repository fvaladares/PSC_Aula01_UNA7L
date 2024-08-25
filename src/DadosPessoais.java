public class DadosPessoais {
    private String nomeCompleto; // String - texto
    private int idade; // int - Número inteiro I = {0, 1, 2, ..., 8, 9...}

    // Construtor - Utilizado para criar a instância da classe já passando os dados mais importantes
    public DadosPessoais(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    // Construtor vazio - Permite criar um objeto sem inicializar os atributos
    public DadosPessoais() {
        this.nomeCompleto = "";
        this.idade = 0;
    }

    //region <Métodos Acessores>
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //endRegion


    @Override
    public String toString() {
        return "DadosPessoais{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", idade=" + idade +
                '}';
    }
}
