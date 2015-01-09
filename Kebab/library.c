#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int printBoolean(int a) {
	if (a == 1) {
	        printf("%s\n", "true");
	} else {
		printf("%s\n", "false");
	}
        return 0;
}

int printByte(int a) {
        printf("%d\n", a);
        return 0;
}

int printShort(int a) {
        printf("%d\n", a);
        return 0;
}

int printLong(int a) {
        printf("%d\n", a);
        return 0;
}

int printInt(int a) {
        printf("%d\n", a);
        return 0;
}

int printFloat(float a) {
        printf("%f\n", a);
        return 0;
}

int printDouble(double a) {
        printf("%f\n", a);
        return 0;
}

int printString(char* s) {
        printf("%s\n", s);
        return 0;
}

int printChar(int a) {
	char c = a;
        printf("%c\n", c);
        return 0;
}

int my_puts(char *a) {
  return puts(a);
}

int iexp(int a, int b) {
        int ret = 1;
        for (int i = 0; i < b; i++) {
                ret *= a;
        }
        return ret;
}

float fexp(float a, float b) {
        return powf(a, b);
}

float IntToFloat(int a) {
    return (float) a;
}

int FloatToInt(float a) {
    return (int) a;
}

int readInt() {
  int a;
  scanf("%d",&a);
  return a;
}
