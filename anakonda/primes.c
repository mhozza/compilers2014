def int testprime(int x){
    for(int i=2;i*i<=x;i=i+1) {
        int number = x%i;
        if(number==0){
            return 0;
        }
    }
    return 1;
}

int n=0;
int test=0;
n = read();
if (n >= 2) {
  for (int i = 2; i <=n; i=i+1) {
     test=testprime(i);
     if(test==1){
        print(i);
     }
  }
}