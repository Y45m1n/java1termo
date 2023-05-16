package POOIntroducao;

public class App {
 public static void main(String[] args) {
    //criando objetos
    RegistraAluno aluno1 = new RegistraAluno(); //criei um obj
    RegistraAluno aluno2 = new RegistraAluno();
    //setando os atributos SET
    aluno1.setNome("Yasmin Vitória");
    aluno1.setEndereco("Estrada Municipal João Peruchi, N° 45, cascalho, cordeirópolis");
    aluno1.setIdade(18);
    aluno1.setNotaMatematica(8.5);
    aluno1.setNotaPortugues(10);
    aluno1.setNotaCiencias(8);
    aluno2.setNome("Lucas Fabiano");
    aluno2.setEndereco(", Limeira");
    aluno2.setIdade(18);
    aluno2.setNotaMatematica(10);
    aluno2.setNotaPortugues(7.5);
    aluno2.setNotaCiencias(8);
    
  
    //GET
    System.out.println("Nome:"+aluno1.getNome());
    System.out.println("Endereço:"+aluno1.getEndereco());
    System.out.println("Idade:"+aluno1.getIdade());
    System.out.println("Média"+aluno1.getMedia());
    System.out.println("------------------------");
    System.out.println("Nome:"+aluno2.getNome());
    System.out.println("Endereço:"+aluno2.getEndereco());
    System.out.println("Idade:"+aluno2.getIdade());
    System.out.println("Média"+aluno2.getMedia());
 }   
}
