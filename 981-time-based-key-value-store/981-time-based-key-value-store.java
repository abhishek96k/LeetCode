class TimeMap {

    Map<String, TreeMap<Integer, String>> map;
    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap());
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = map.get(key);
        
        if (treeMap == null) return "";
        
        Integer floorKey = treeMap.floorKey(timestamp);
        
        if (floorKey == null) return "";
        return treeMap.get(floorKey);
    }
}