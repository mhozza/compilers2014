int n = read();
n = n-1;
int first = read();
int[] p = [first];
for (int k = 1; k <=n; k=k+1) {
    p[k] = read();
}
int t = 0;
for (int i = 0; i <=n; i=i+1) {
    for (int j = i+1; j<=n; j=j+1) {
          if (p[i] > p[j]){
                t= p[i];
                p[i] = p[j];
                p[j] = t;
          }
    }
}
for (int c = 0; c <=n; c=c+1) {
    print(p[c]);
}