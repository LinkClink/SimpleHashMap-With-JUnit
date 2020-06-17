import java.util.HashMap;

public class HashMapInit {

    private HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>();

    public HashMap<Integer, Long> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Integer, Long> hashMap) {
        this.hashMap = hashMap;
    }

    public long getValue(int objectKey) {
        if(hashMap.containsKey(objectKey))
        return hashMap.get(objectKey);
        return 0;
    }

    public void putObject(int objectKey, long objectValue) {
        hashMap.put(objectKey, objectValue);
    }

    public int getSize() {
        return hashMap.size();
    }
}
