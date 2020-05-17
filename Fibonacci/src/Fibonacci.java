
public class Fibonacci {
    int count = 2;
    int[] a = new int[25];
    public static void main(String[] args){
        Fibonacci fs = new Fibonacci();
        fs.fibonnacci(10);

    }
    int[] fibonnacci(int n){
        assert n >= 2;
        if (n == 2){
            a[0] = 0;
            a[1] = 1;
            count += 2;
            return a;
        }else{
            a[0] = 0;
            a[1] = 1;
            a[count] = a[count - 1] + a[count - 2];
            System.out.print(a[count] + ", ");
            count++;
            fibonnacci(n -1);
        }
        return a;
    }
}
