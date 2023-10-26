public class Square {
    private int row, col, type;
    public Square (int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public int getType()
    {
        return type;
    }

    public String toString()
    {
        if(type == 0)
        {
            return("_");

        }

        else if (type == 1)
        {
            return("#");
        }

        else if (type == 2)
        {
            return("S");
        }

        else
        {
            return("E");
        }
    }
}
