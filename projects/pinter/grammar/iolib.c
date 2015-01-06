#include <stdlib.h>
#include <stdio.h>
 
int mr() {
    int x;
    scanf("%d",&x);
    return x;
}
 
void mw(int n){
    printf("%d\n",n);
}

int readInt() {
	int x;
	scanf("%d",&x);
	return x;
}

void readString(int* s,int max_length) {
	int i;
	char* c=malloc((max_length+1)*sizeof(char));
	int* s=malloc(max_length*sizeof(int));
	//int* ic=malloc(max_length*sizeof(int));
	scanf("%s",c);
	for(i=0;i<max_length;i++) {
		if (c[i]==0) break;
		s[i]=(int)c[i];
	}
	free(c);
}

void printInt(int x,int* separator, int separator_length) {
	int i;
	char* c=malloc((separator_length+1)*sizeof(char));
	for(i=0;i<separator_length;i++) {
		c[i]=(char)(separator[i]%256);
	}
	c[i]=0;
	printf("%d%s",x,c);
	free(c);
}

void printString(int* s,int string_length, int* separator, int separator_length) {
	int i;
	char* c=malloc((separator_length+1)*sizeof(char));
	char* cs=malloc((string_length+1)*sizeof(char));
	for(i=0;i<string_length;i++) {
		cs[i]=(char)(s[i]%256);
	}
	cs[i]=0
	for(i=0;i<separator_length;i++) {
		c[i]=(char)(separator[i]%256);
	}
	c[i]=0;
	printf("%s%s",cs,c);
	free(c);
}

void printInt(int x) {
	printf("%d",x);
}

void printString(int* s,int string_length) {
	int i;
	char* cs=malloc((string_length+1)*sizeof(char));
	for(i=0;i<string_length;i++) {
		cs[i]=(char)(s[i]%256);
	}
	cs[i]=0
	printf("%s",cs);
}

void printLine() {
	printf("\n");
}