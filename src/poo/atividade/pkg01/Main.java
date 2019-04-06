package poo.atividade.pkg01;

import java.util.Scanner;
import poo.atividade.pkg01.servico.Cadastro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicializando o sistema.....\n\n");
        Cadastro cadastro = new Cadastro();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        whilePrograma:
        while (true) {
            System.out.println("=================================");
            System.out.println("Selecione uma opção:");
            System.out.println("[1] Adicionar Funcionario");
            System.out.println("[2] Deletar Funcioanrio");
            System.out.println("[3] Listar Funcionario");
            System.out.println("[4] Sair do Sistema");
            opcao = scanner.nextInt();
            System.out.println("=================================");
            switch (opcao) {
                case 1:
                    cadastro.cadastrarFuncionario();
                    break;
                case 2:
                    cadastro.deletarFuncionario();
                    break;
                case 3:
                    cadastro.listarFuncionario();
                    break;
                case 4:
                    System.out.println("Bye... Bye");
                    System.out.println("=================================");
                    break whilePrograma;
            }
        }

    }
}
