public class Domino
{
    //# of dots it has
    int top;
    int bottom;

    public Domino()
    {
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString() {
        return top + "/" + bottom;
    }

    public void flip()
    {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle()
    {
        if(bottom < top)
        {
            flip();
        }
    }

    public int compareTo(Domino other)
    {
        int thisSmallest;
        int thisLargest;
        if(this.bottom < this.top || this.bottom == this.top)
        {
            thisSmallest = this.bottom;
            thisLargest = this.top;
        }
        else
        {
            thisSmallest = this.top;
            thisLargest = this.bottom;
        }

        int otherSmallest;
        int otherLargest;
        if(other.getBottom() < other.getTop() || other.getBottom() == other.getTop())
        {
            otherSmallest = other.getBottom();
            otherLargest = other.getTop();
        }
        else
        {
            otherSmallest = other.getTop();
            otherLargest = other.getBottom();
        }

        if(thisSmallest < otherSmallest)
        {
            return -1;
        }
        else if(thisSmallest > otherSmallest)
        {
            return 1;
        }

        if(thisLargest < otherLargest)
        {
            return -1;
        }
        else if(thisLargest > otherLargest)
        {
            return 1;
        }
        return 0;
    }

    public int compareToWeight(Domino other)
    {
        int thisTotal = this.bottom + this.top;
        int otherTotal = other.getBottom() + other.getTop();

        if(thisTotal < otherTotal)
        {
            return -1;
        }
        else if(thisTotal > otherTotal)
        {
            return 1;
        }
        return 0;
    }

    public boolean canConnect(Domino other)
    {
        if(this.top == other.getTop())
        {
            return true;
        }
        else if(this.top == other.getBottom())
        {
            return true;
        }
        else if(this.bottom == other.getTop())
        {
            return true;
        }
        else if(this.bottom == other.getBottom())
        {
            return true;
        }
        return false;
    }
}
