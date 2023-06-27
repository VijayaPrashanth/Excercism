class PrimeCalculator {

    public boolean isprime(int num) {
        for(int i=2;i<=num/2;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    int nth(int nth) {
        int prime=0,num=2,nth_prime_number=0;
        if(nth<1) 
            throw new IllegalArgumentException();
        
        while(prime!=nth) {
            if(isprime(num)) {
                prime++;
                nth_prime_number=num;
            }
            num++;
        }
        return nth_prime_number;
    }

}
