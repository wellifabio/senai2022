package model;

public interface Estoque {
	public void registar(Observador o);
	public void excluirRegistro(Observador o);
	public void notificar();
}
