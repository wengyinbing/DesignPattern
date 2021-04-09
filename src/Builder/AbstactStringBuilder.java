package Builder;

import java.util.Arrays;

/**
 * @author wengyinbing
 * @data 2021/4/9 19:40
 **/
public class AbstactStringBuilder {
    public char[] value;
    protected int count;

    public AbstactStringBuilder(int capacity){
        count = 0;
        value = new char[capacity];
    }

    public AbstactStringBuilder append(char c){
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    private void ensureCapacityInternal(int n){
        if(n - value.length > 0){
            expandCapacity(n);
        }
    }

     void expandCapacity(int n){
        int newlength = value.length * 2 + 2;//计算得到的新的容量
        if(newlength - n < 0){
            newlength = n;
        }
        if(newlength < 0){
            if (n < 0)//溢出了
            {
                throw new OutOfMemoryError();
            }
            newlength = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value,newlength);
     }
}
