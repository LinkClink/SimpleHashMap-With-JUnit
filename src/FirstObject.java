import java.util.Objects;

public class FirstObject {
    private int objectKey;
    private long objectValue;

    public FirstObject(int objectKey, long objectValue) {
        this.objectKey = objectKey;
        this.objectValue = objectValue;
    }

    public int getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(int objectKey) {
        this.objectKey = objectKey;
    }

    public long getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(long objectValue) {
        this.objectValue = objectValue;
    }


    @Override
    public int hashCode() {
        return Objects.hash(objectKey, objectValue);
    }
}
