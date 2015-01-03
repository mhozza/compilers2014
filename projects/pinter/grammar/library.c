#include <stdlib.h>
#include <stdio.h>

int printInt(int* a,int size) {
        printf("%d", a);
        return 0;
}

int printLine() {
	printf("\n");
}

int printString(char* c,int start,int end) {
	//todo
}

int iexp(int a, int b) {
        int ret = 1;
        for (int i = 0; i < b; i++) {
                ret *= a;
        }
        return ret;
}
