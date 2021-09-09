public class Stack {

    public Vector vector;

    public Stack(Vector vector)
    {
        this.vector = vector;
    }

    public Stack()
    {
        this.vector = new Vector();
    }

    public void push(int value)
    {
        this.vector.add(value);
    }

    public int peek()
    {
        return this.vector.getElements()[this.vector.size()-1];
    }

    public void pop()
    {
        this.vector.resize(this.vector.size()-1);
    }

    public int size()
    {
        return this.vector.size();
    }

    public boolean isEmpty()
    {
        return this.vector.isEmpty();
    }
}
