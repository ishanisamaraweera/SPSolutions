public class Problem3 {

    public static void main(String args[]){
        for(int i = 1; i<=100; i++){
            System.out.println(fibonacci(i));
        }

    }
    public static int fibonacci(int n){
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else{
            return fibonacci(n-2) + fibonacci(n - 1);
        }
    }
}
