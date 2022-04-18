package views;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlls.Conversao;
import models.Contexto;

/*
 * Design Patterns Comportamental Interpreter
 * pouco utilizado, somente em casos específicos
 * onda interpretação ou conversão de tipos de dados
 * se faz necessária
 * Este exemplo converte galões americanos de gasolina
 * em litros, copos e MLs:
 * https://www.youtube.com/watch?v=6CVymSJQuJE
 *
 * */

public class Client {

	private static JFrame tela;
	private static Conversao frase;
	private static String de;
	private static String convertido;
	private static String resposta;
	private static double quantidade;

	public static void main(String[] args) {

		tela = new JFrame();
		frase = new Conversao(
				JOptionPane.showInputDialog(tela, "Digite a questão para conversao ex: 2 galoes em litros"));
		de = frase.getDe();
		convertido = frase.getPara();
		quantidade = frase.getQuantidade();

		try {
			Class temp = Class.forName(de);
			Constructor con = temp.getConstructor();
			Object converteDe = (Contexto) con.newInstance();
			Class[] parametros = new Class[] { Double.TYPE };
			Method metodo = temp.getMethod(convertido, parametros);
			Object[] params = new Object[] { new Double(quantidade) };
			String para = (String) metodo.invoke(converteDe, params);
			String resposta = frase.getResposta() + para + " " + convertido;		
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(tela, "ClassNotFoundException: " + e);
			tela.dispose();
		} catch (NoSuchMethodException e) {
			JOptionPane.showMessageDialog(tela, "NoSuchMethodException: " + e);
			tela.dispose();
		} catch (SecurityException e) {
			JOptionPane.showMessageDialog(tela, "SecurityException: " + e);
			tela.dispose();
		} catch (InstantiationException e) {
			JOptionPane.showMessageDialog(tela, "InstantiationException: " + e);
			tela.dispose();
		} catch (IllegalAccessException e) {
			JOptionPane.showMessageDialog(tela, "IllegalAccessException: " + e);
			tela.dispose();
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(tela, "IllegalArgumentException: " + e);
			tela.dispose();
		} catch (InvocationTargetException e) {
			JOptionPane.showMessageDialog(tela, "InvocationTargetException: " + e);
			tela.dispose();
		}

		JOptionPane.showMessageDialog(tela, resposta);
		tela.dispose();
	}

}


