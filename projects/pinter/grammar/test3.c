#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* generate32(int x, int* maxsize) {
	int poc=0;
	char* newaddress=malloc(8*(*maxsize));
	while (x>0) {
		if (poc==(*maxsize)) {
			char* neweradress=malloc(8*((*maxsize)+1));
			memcpy(neweradress,newaddress,(*maxsize));
			free(newaddress);
			newaddress=neweradress;
			(*maxsize)++;
		}
		newaddress[poc]=x%256;
		x/=256;
		poc++;
		if ((*maxsize)>=8388608) {
			printf("Bigint overflow (wow, you must have really tried). Exiting...");
			exit(1);
		}
	}
	newaddress[poc]=0;
	*maxsize=poc;
	return newaddress;
}

int getSize32(int z) {
	int p=0;
	while (z/256>0) {
		z/=256;
		p++;
	}
	return p;
}

char* binMul(char* data1,char* data2,int size1,int size2,int* res_size) {
	int size_bigger,i;
	int mul=1; 
	//char* d1=(char*)data1;
	//char* d2=(char*)data2;
	int a=0;
	int b=0;
	if (size1>size2) {
		size_bigger=size1;
	} else {
		size_bigger=size2;
	}
	if (size_bigger<4) { //sizes are *8!! - cize do 24 bitov robime s obycajnymi intami, performance ftw
		for (i=0;i<size1;i++) {
			a+=((int)data1[i])*mul;
			b+=((int)data2[i])*mul;
			mul*=8;
		}
		int r=a*b;
		*res_size=1;
		return generate32(r,res_size);
	} else {
		printf("TODO");
	}
	return 0;
}


int main() {
	char d1[3];
	d1[0]=10;
	d1[1]=0;
	d1[2]=0;
	char d2[3];
	d2[0]=2;
	d2[1]=0;
	d2[2]=0;
	int s1=3;
	int s2=3;
	int* res_size=malloc(sizeof(int));
	char* res=binMul(d1,d2,s1,s2,res_size);
	printf("%d %d %d\n",(int)res[0],(int)res[2],*res_size);
	return 0;
}

/*char* generate(int x, int* maxsize) {
	int poc=0;
	char* newaddress=malloc(8*(*maxsize));
	while ((x/8)>0) {
		newaddress[poc]=x%8;
		x/=8;
		poc++;
		if (poc==((*maxsize)-1)) {
			char* neweradress=malloc(16*(*maxsize));
			memcpy(neweradress,newaddress,(*maxsize));
			free(newaddress);
			newaddress=neweradress;
			(*maxsize)*=2;
		}
		if ((*maxsize)>=8388608) {
			printf("Bigint overflow (wow, you must have really tried). Exiting...");
			exit(1);
		}
	}
	newaddress[poc]=0;
	*maxsize=poc;
	return newaddress;
}*/








/*
char* generate64(long long x, int* maxsize) {
	int poc=0;
	char* newaddress=malloc(8*(*maxsize));
	while ((x/((long long)8))>(long long)0) {
		newaddress[poc]=x%8;
		x/=8;
		poc++;
		if (poc==(*maxsize)) {
			char* neweradress=malloc(16*(*maxsize));
			memcpy(neweradress,newaddress,(*maxsize));
			free(newaddress);
			newaddress=neweradress;
			(*maxsize)*=2;
		}
		if ((*maxsize)>=8388608) {
			printf("Bigint overflow (wow, you must have really tried). Exiting...");
			exit(1);
		}
	}
	return newaddress;
}

int mem_size1=32;
	int mem_size2=48;
	int data1=8888888;
	int data2=7777777;
	int mem_size_bigger;
	int* res_size=malloc(sizeof(int));

	if (mem_size1>mem_size2) {
		mem_size_bigger=mem_size1;
	} else {
		mem_size_bigger=mem_size2;
	}
	if (mem_size_bigger<32) {
		int a=malloc(32*sizeof(int));
		int b=malloc(32*sizeof(int));
		memcpy(a,data1)
	}
	if (mem_size_bigger<64) {
		(*res_size)=64;
		res=generate(data2,res_size);
	} else {
		(*res_size)=128;
		res=generate(data1,res_size);
	}

*/