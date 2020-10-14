package Board;

public class Position {
    private int row,column;

    public void setRown(int rown) {
        this.row = rown;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Position(int rown, int column) {
        this.row = rown;
        this.column = column;
    }

    public int getRown() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return row + "," + column;
    }
}
