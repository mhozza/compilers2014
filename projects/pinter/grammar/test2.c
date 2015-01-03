#include <stdio.h>
#include <string.h>
#include <math.h>

int func(int z) {
	return z;
}

int main() {
	int x=47;
	int bitx=42;
	int poc1=0;
	int err=0;
	int y=0;
	while ((x/2)>0) {
		x/=2;
		poc1++;
	}
	if (poc1>(bitx-1)) {
		bitx*=2;
		y=func(x);
	} else {
		y=46;
		bitx*=1;
	}
	printf("%d %d",y,bitx);
}