package behavioral.command.practice;

public interface UndoableCommand extends Command {
    void undo();
}
