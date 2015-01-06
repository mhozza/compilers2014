#include <stdlib.h>
#include <stdio.h>
#include <string.h>

void printInt(int *a) {
	printf("%d\n", *a);
}

void printFloat(double *f) {
	printf("%.4f\n", *f);
}

void printBool(char *b) {
	switch (*b) {
		case  3: printf("ošaľ\n"); break; // bool in saral is i2, so -1 value in i2 is value 3 in i8 type
		case  0: printf("skoroošaľ\n"); break;
		case  1: printf("pravda\n"); break;
		default: printf("neznáma logická hodnota %d\n", *b);
	}
}

void printChar(char *c) {
	printf("%c\n", *c);
}

void printString(char **s) {
	printf("%s\n", *s);
}

void scanInt(int *a) {
	scanf("%d", a);
}

void scanFloat(double *f) {
	scanf("%lf", f);
}

void scanBool(char *b) {
	char buf[16];
	scanf(" ");
	fgets(buf, sizeof(buf), stdin);
	buf[strlen(buf)-1] = '\0';
	if (strcmp(buf, "ošaľ") == 0) {
		*b = 3;
	} else if (strcmp(buf, "pravda") == 0) {
		*b = 1;
	} else {
		*b = 0;
	}
}

void scanChar(char *c) {
	scanf(" %c", c);
}

void scanString(char **s) {
	scanf(" ");
	char buf[1024];
	fgets(buf, sizeof(buf), stdin);
	int buf_len = strlen(buf);
	buf[buf_len-1] = '\0';
	char *str = (char *) malloc(buf_len);
	strncpy(str, buf, buf_len-1);
	*s = str;
}

char * strConcat(char *a, char *b) {
	int len = strlen(a) + strlen(b) + 1;
	char *ret = (char *) malloc(len);
	strcpy(ret, a);
	strcat(ret, b);

	return ret;
}

// return string allocated at heap
char * string(char *str) {
	int len = strlen(str) + 1;
	char *ret = (char *) malloc(len);
	strcpy(ret, str);

	return ret;
}

/*
int main() {
	int a = 47;
	printInt(&a);
	scanInt(&a);
	printInt(&a);
	float b = 123.456789;
	printFloat(&b);
	char c = -1;
	printBool(&c);
	char d = '@';
	printChar(&d);
	printString("Hello, World!");

	return 0;
}
*/
