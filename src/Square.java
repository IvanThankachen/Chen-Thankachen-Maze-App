public class Square {
    private int row, col, type, value;
    public Square prev;
    public boolean marked;
    public Square (int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
        this.value = 0;
        this.prev = null;
        this.marked = false;
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

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    

    public Square getPrevious()
    {
        return prev;
    }
    public Square setPrevious(Square new_prev)
    {
        prev = new_prev;
        return prev;
    }

    public boolean setMarked(boolean temp)
    {
         marked = temp;
         return marked;
    }
    public boolean getMarked()
    {
        return marked;
    }

    public String toString()
    {
        if(type == 0)
        {
            if (value == 0)
                return ("_");
            else if (value == 1)
                return ("o"); // possibility
            else if (value == 2)
                return ("."); // traversed
            else if (value == 3)
                return ("x"); // traversed and correct
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

        return("Non");
    }
}
