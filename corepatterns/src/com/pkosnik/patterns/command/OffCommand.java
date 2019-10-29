package com.pkosnik.patterns.command;

public class OffCommand implements Command {
	Television television = null;

	public OffCommand(Television television) {
	this.television = television;
}

	@Override
	public void execute() {
		television.off();

	}

}
