package carregabanco;

import java.util.Scanner;

import carregabanco.model.AlunoModel;
import carregabanco.repository.AlunoDao;
import carregabanco.view.CarregaBancoView;

public class CarregaBanco {
	public static void main(String[] args) {
		new CarregaBancoView();
		int opcao;
		Scanner scan= new Scanner(System.in);
		
		//menu
		System.out.println("\t---- Menu ----\n");
		System.out.println("1- Cadastrar aluno \n2- Buscar aluno \n3- Editar aluno");
		System.out.println("4- Remover aluno \n0- Sair");
		opcao= scan.nextInt();
		
		switch (opcao) {
		case 0:
			System.out.println("Programa encerrado!");
			break;
		case 1:
			cadastrarAluno(scan);
			break;
		default:
			break;
		}
//		AlunoModel alunoModel = AlunoDao.getInstance().getById(1);    
	}

	public static void cadastrarAluno(Scanner scan) {
		System.out.println(">>> CADASTRO DE ALUNO <<<\n");
		AlunoModel aluno= new AlunoModel();
		System.out.println("Informe o nome: ");
		String nome= scan.nextLine();
		System.out.println("Informe a coordenaçao: ");
		String coordenacao= scan.nextLine();
		System.out.println("Informe o curso: ");
		String curso= scan.nextLine();
		System.out.println("Informe sobre a situaçao(Ex.: Em curso, pendente): ");
		String  situacao= scan.nextLine();
		System.out.println("Informe a data de entrada(Ex.:2023/1): ");
		String periodoEntrada= scan.nextLine();
		
		aluno.setNome_estudante(nome);
		aluno.setCoordenacao(coordenacao);
		aluno.setCurso(curso);
		aluno.setSituacao(situacao);
		aluno.setPeriodo_entrada(periodoEntrada);
		
		AlunoDao.getInstance();
		System.out.println(aluno.toString());
	}	
}
