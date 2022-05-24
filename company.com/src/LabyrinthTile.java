public class LabyrinthTile {


    private Direction entry;
    private Direction exit;

    public Direction getEntry() {
        return entry;
    }

    public Direction getExit() {
        return exit;
    }

    public void setEntry(Direction entry) {
        this.entry = entry;
    }

    public void setExit(Direction exit) {
        this.exit = exit;
    }

    public LabyrinthTile(Direction entry, Direction exit) {
        this.entry = entry;
        this.exit = exit;
    }
}
