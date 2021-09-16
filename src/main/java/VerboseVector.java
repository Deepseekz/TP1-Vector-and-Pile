public class VerboseVector extends Vector
{
    public void add(Object element)
    {
        super.add(element);
        System.out.print("\nadd(" + element.toString() + ")");
    }

    public void set(int index, Object element)
    {
        super.set(index, element);
        System.out.print("\nset(" + index + "," + element.toString() + ")");
    }

    public Object get(int index)
    {
        System.out.print("\nget(" + index + ")");
        return super.get(index);
    }

}
