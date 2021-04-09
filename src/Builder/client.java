package Builder;

/**
 * @author wengyinbing
 * @data 2021/4/9 20:34
 **/
public class client {
    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();

        sb.append('o');
        sb.append('p');

        System.out.println(sb);
    }
}
