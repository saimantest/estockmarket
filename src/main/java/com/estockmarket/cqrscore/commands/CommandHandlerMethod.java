package com.estockmarket.cqrscore.commands;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
	void handle(T command);
}
