
def int Find(int[] pr, int x){
    if (pr[x] == x){
        return x;
    }
    int t = Find(pr, pr[x]);
    return t;
}
def int Union(int[] pr, int x, int y){
    int rx = Find(pr, x);
    int ry = Find(pr, y);
    pr[rx] = ry;
    return 0;
}
def int Check(int[] pr, int n){
    int x = Find(pr, 0);
    for (int i = 1; i<=n; i=i+1) {
        int tmp = Find(pr, i);
        if (tmp != x){
            return 0;
        }
    }
    return 1;
}

int n = read();
n = n-1;
int m = read();
int[] pole = [0];

for (int l = 1; l<=n; l=l+1) {
    pole[l] = l;
}

for (int i = 1; i<=m; i=i+1) {
    int x = read();
    int y = read();
    Union(pole, x, y);
}
int p = Check(pole, n);
if (p == 1){
    print(1);
} else{
    print(0);
}
