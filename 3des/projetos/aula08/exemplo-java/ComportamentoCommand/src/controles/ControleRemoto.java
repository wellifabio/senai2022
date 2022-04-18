package controles;

import modelos.Command;

public class ControleRemoto {
	
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressionarBotao() {
		command.executar();
	}
}
