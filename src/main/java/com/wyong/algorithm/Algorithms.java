package com.wyong.algorithm;

public class Algorithms {
    
    private static final int NOT_FOUND = -1;
    
    /**
     * 折半查找
     * 给定一个整数X和整数A0,A1,...,An-1,后者已经预先排序并在内存中,求下标i使得Ai=X,如果X不在数据中,则返回i=-1.
     * @return 相同值的下标
     */
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a, AnyType x)
    {
        int low = 0;
        int high = a.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if (a[mid].compareTo(x) < 0)
            {
                low = mid + 1;
            }
            else if (a[mid].compareTo(x) > 0)
            {
                high = mid - 1;
            }
            else
            {
                return mid; // Found
            }
        }
        
        return NOT_FOUND; // NOT_FOUND is defined as -1
    }
}
