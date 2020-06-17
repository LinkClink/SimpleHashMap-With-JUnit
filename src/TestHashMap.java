import org.junit.Assert;
import org.junit.Test;

public class TestHashMap {

    /* Verification of a nonexistent key */
    @Test
    public void getByNonExistedKey() {
        HashMapInit hashMapInit = new HashMapInit();
        Assert.assertEquals(0, hashMapInit.getValue(100));
    }

    /* Add a new key and verify it */
    @Test
    public void putAndCheckOk() {
        HashMapInit hashMapInit = new HashMapInit();

        hashMapInit.putObject(100, 1);
        hashMapInit.putObject(150, 2);
        hashMapInit.putObject(300, 3);
        Assert.assertEquals(3, hashMapInit.getSize());
        Assert.assertEquals(1, hashMapInit.getValue(100));
        Assert.assertEquals(2, hashMapInit.getValue(150));
        Assert.assertEquals(3, hashMapInit.getValue(300));
    }

    /* Adding a key with a null value */
    @Test
    public void putZeroKey() {
        HashMapInit hashMapInit = new HashMapInit();

        hashMapInit.putObject(0, 3);
        Assert.assertEquals(3, hashMapInit.getValue(0));
        Assert.assertEquals(1, hashMapInit.getSize());
        hashMapInit.putObject(0, 5);
        Assert.assertEquals(5, hashMapInit.getValue(0));
        Assert.assertEquals(1, hashMapInit.getSize());
    }

    /* Size check with empty value */
    @Test
    public void getSizeOfEmptyHashMap() {
        HashMapInit hashMapInit = new HashMapInit();

        Assert.assertEquals(0, hashMapInit.getSize());
    }

    @Test
    public void getSizeWithCollision() {
        HashMapInit hashMapInit = new HashMapInit();

        hashMapInit.putObject(150, 3);
        hashMapInit.putObject(300, 5);
        Assert.assertEquals(2, hashMapInit.getSize());
    }
}
