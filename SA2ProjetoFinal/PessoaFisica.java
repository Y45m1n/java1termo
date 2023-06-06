package SA2ProjetoFinal;

public abstract class PessoaFisica {
   
        // superclasse (fornecer herança para outras classes)
        //atributos genéricos (comuns a todas as classes herdeiras)
    
        //atributos
        String nome;
        int idade;
        String cpf;
    
         //metodos
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    
   
}
