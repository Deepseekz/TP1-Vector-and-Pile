import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.junit.Test;

public class StackTest
{
    @Test
    public void TestStackVector()
    {
        Stack stack = new Stack();
        Assert.assertNotNull(stack.vector);
    }

    @Test
    public void TestStack()
    {
        Stack stack = new Stack(new Vector(15));
        Assert.assertNotNull(stack.vector);
    }

    @Test
    public void TestPush()
    {
        Stack stack = new Stack(new Vector(15));
        stack.push(6);
        Assert.assertEquals(6, stack.vector.get(stack.vector.size()-1));
    }

    @Test
    public void TestPeek()
    {
        Stack stack = new Stack(new Vector(15));
        stack.push(12);
        stack.push(32);
        Assert.assertEquals(stack.peek(), 32);
    }

    @Test
    public void TestPop()
    {
        Stack stack = new Stack(new Vector(15));
        stack.push(12);
        stack.push(32);
        stack.pop();
        Assert.assertEquals(stack.peek(), 12);
    }

    @Test
    public void TestSize()
    {
        Stack stack = new Stack(new Vector(15));
        stack.push(12);
        stack.push(32);
        Assert.assertEquals(2,stack.size());
    }

    @Test
    public void TestIsEmpty()
    {
        Stack stack = new Stack(new Vector(15));
        stack.push(12);
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }
}
