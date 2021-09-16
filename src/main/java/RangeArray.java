public class RangeArray
{
    private int _indexMin = -3;
    private int _indexMax = 1;

    public RangeArray(int indexMin, int indexMax)
    {
        _indexMin = indexMin;
        _indexMax = indexMax;
    }

    public int getIndexMin() {
        return _indexMin;
    }

    public int getIndexMax() {
        return _indexMax;
    }

    public void set(int index, int i) {
        _indexMin = index;
        _indexMax = i;
    }

    public int rangeSize()
    {
        return _indexMax - _indexMin;
    }

    public int get(int index)
    {

    }
}
