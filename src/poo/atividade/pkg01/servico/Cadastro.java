package poo.atividade.pkg01.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import poo.atividade.pkg01.vo.Funcionario;
import poo.atividade.pkg01.vo.Setor;

public class Cadastro {

    private List<Funcionario> listadefuncionario;
    
    public Cadastro(){
        listadefuncionario = new ArrayList<>();
        
        Funcionario fun1 = new Funcionario();
        fun1.setCodigo(1);
        fun1.setNome("Breno");
        fun1.setIdade(20);
        fun1.setSetor(new Setor(123,"vendas"));
        
        Funcionario fun2 = new Funcionario();
        fun2.setCodigo(2);
        fun2.setNome("Brendo");
        fun2.setIdade(27);
        fun2.setSetor(new Setor(123,"Compra"));
        
        listadefuncionario.add(fun1);
        listadefuncionario.add(fun2);
    
    
    }

    public void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("---------------------------------");
         
        System.out.println("Cadastrando Funcionario");
        System.out.println("Informe o codigo do funcionario:");
        funcionario.setCodigo(scanner.nextInt());
        scanner = new Scanner(System.in);
        System.out.println("Informe o nome do funconario:");
        scanner = new Scanner(System.in);

        funcionario.setNome(scanner.nextLine());

        scanner = new Scanner(System.in);
        System.out.println("Informe a idade do funcionario:");
        funcionario.setIdade(scanner.nextInt());

        Setor setor = new Setor();

        System.out.println("Informe o Codigo do setor:");
        setor.setCodigo(scanner.nextInt());
        scanner = new Scanner(System.in);
        System.out.println("Informe o Nome do setor:");
        scanner = new Scanner(System.in);
        setor.setNome(scanner.nextLine());
        
        System.out.println("---------------------------------");
        
        funcionario.setSetor(setor);

        listadefuncionario.add(funcionario);
    }

    public void deletarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("---------------------------------");
        
        System.out.println("Deletando Funcionario...");
        System.out.println("Digite o codigo do Funcionario:");
        funcionario.setCodigo(scanner.nextInt());
        listadefuncionario.remove(funcionario);
        System.out.println("Funcionario Deletado com Sucesso!!!!\n\n");
        
        System.out.println("---------------------------------");

    }
     public void listarFuncionario(){
         for (Funcionario funcionariodalista: listadefuncionario) {
             System.out.println("---------Funcionarios-------------");
             
             System.out.println("Codigo:" +funcionariodalista.getCodigo());
             System.out.println("nome:" +funcionariodalista.getNome());
             System.out.println("idade:" +funcionariodalista.getIdade());
             System.out.println("setor codigo:" +funcionariodalista.getSetor().getCodigo());
             System.out.println("setor nome:" +funcionariodalista.getSetor().getCodigo());
             
             System.out.println("----------------------------");
             
             
         }
    
    
    
    }
}
