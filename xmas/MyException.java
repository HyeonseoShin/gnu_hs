package xmas;

public class MyException extends Exception
{
    private int num;

    public MyException(int num)
    {
        this.num = num;
    }

    public MyException()
    {

    }

    public int getNum()
    {
        return num;
    }
}
