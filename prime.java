public class prime {
    public static void main(String[] args) {
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            boolean isPrime = num > 1;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(num + (isPrime ? " prime" : " not prime"));
        }
    }
}
