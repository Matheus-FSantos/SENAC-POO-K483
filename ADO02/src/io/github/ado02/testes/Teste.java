package io.github.ado02.testes;

import java.util.Arrays;

import javax.swing.JOptionPane;

import io.github.ado02.domain.model.Aluno;
import io.github.ado02.domain.model.Pessoa;
import io.github.ado02.domain.model.Professor;
import io.github.ado02.domain.model.Funcionario;

import io.github.ado02.domain.model.enumeradores.Contrato;
import io.github.ado02.domain.model.enumeradores.Matricula;

public class Teste {
	public static void main(String[] args) {
		Pessoa [] pessoas = new Pessoa[10];
		
		for(int i = 0; i < pessoas.length; i++) {
			switch(i) {
				case 0:
				case 2:
				case 4:
				case 7:
					try {
						pessoas[i] = new Aluno(("aluno" + i), ("aluno" + i) + "@gmail.com", Matricula.ATIVA);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 1:
				case 3:
				case 5:
					try {
						pessoas[i] = new Professor(("professor" + i), ("professor" + i) + "@gmail.com", Contrato.ATIVA, 32);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 6:
				case 8:
				case 9:
					try {
						pessoas[i] = new Funcionario(("funcionario" + i), ("funcionario" + i) + "@gmail.com", Contrato.ATIVA, "Tecnologia");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
			}
		}
		
		Integer option = 0;
		
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja fazer?\n\n[1] - Mandar email para os alunos\n[2] - Mandar email para os funcionarios\n[3] - Mandar email para os professores"));
			
			switch(option) {
				case 1:
					mensagemAlunos(pessoas, JOptionPane.showInputDialog("Informe a mensagem que deseja passar aos alunos"));
					System.out.println("\n\n" + Arrays.toString(pessoas));
					break;
				case 2:
					mensagemFuncionarios(pessoas, JOptionPane.showInputDialog("Informe a mensagem que deseja passar aos funcionarios"));
					System.out.println("\n\n" + Arrays.toString(pessoas));
					break;
				case 3: 
					mensagemProfessores(pessoas, JOptionPane.showInputDialog("Informe a mensagem que deseja passar aos professores"));
					System.out.println("\n\n" + Arrays.toString(pessoas));
					break;
				default:
					JOptionPane.showMessageDialog(null, "Mensagem inválida", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			
			option = JOptionPane.showConfirmDialog(null, "Deseja enviar outro email?");
		} while(option != 1);
	}

	private static void mensagemAlunos(Pessoa[] dados, String mensagem) {
		Boolean teste = false;
		
		for(Pessoa pessoa : dados) {
			if(pessoa != null) {
				if(pessoa instanceof Aluno) {
					pessoa.updateMensagem(mensagem);
					teste = true;
				}
			}
		}
		
		if(teste)
			JOptionPane.showMessageDialog(null, "Email enviado com sucesso!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
	}

	private static void mensagemFuncionarios(Pessoa[] dados, String mensagem) {
		Boolean teste = false;
		
		for(Pessoa pessoa : dados) {
			if(pessoa != null) {
				if(pessoa instanceof Funcionario) {
					pessoa.updateMensagem(mensagem);
					teste = true;
				}
			}
		}
		
		if(teste)
			JOptionPane.showMessageDialog(null, "Email enviado com sucesso!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	private static void mensagemProfessores(Pessoa[] dados, String mensagem) {
		Boolean teste = false;
		
		for(Pessoa pessoa : dados) {
			if(pessoa != null) {
				if(pessoa instanceof Professor) {
					pessoa.updateMensagem(mensagem);
					teste = true;
				}
			}
		}
		
		if(teste)
			JOptionPane.showMessageDialog(null, "Email enviado com sucesso!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
		
	}
}