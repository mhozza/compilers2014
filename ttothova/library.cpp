#include <cstdlib>
#include <cstdio>
#include <cmath>
#include <vector>
#include <iostream>

using namespace std;

template <class T>
vector<T>* createArray(int size) {
        vector<T>* v = new vector<T>(size);
return v;
}

template <class T>
T getArrayItem(vector<T> *array, int index) {
        T item = (*array)[index];
        return item;
}

template <class T>
void setArrayItem(vector<T> *array, int index, T item) {
        (*array)[index] = item;
}

#ifdef __cplusplus
extern "C"
{
#endif

int readInt() {
    int a;
    cin >> a;
    return a;
}

float readFloat() {
    float a;
    cin >> a;
    return a;
}

char readChar() {
    char a;
    cin >> a;
    return a;
}

int printInt(int a) {
    printf("%d\n", a);
    return 0;
}

int printFloat(float a) {
    printf("%f\n", a);
	return 0;
}

int printChar(char a) {
    printf("%c\n", a);
    return 0;
}

int iexp(int a, int b) {
    int ret = 1;
    for (int i = 0; i < b; i++) {
        ret *= a;
    }
    return ret;
}

float fexp(float a, float b) {
	float c = powf(a,b);
    return c;
}

int floatToInt(float a) {
	return (int) round(a);
}

float intToFloat(int a) {
    return (float) a;
}

int* createIntArray(int size) {
    return (int*) createArray<int>(size);
}

void setArrayItemInt(int* array, int index, int item) {
    setArrayItem<int>((vector<int>*) array, index, item);
}

int getArrayItemInt(int* array, int index) {
   return getArrayItem<int>((vector<int>*) array, index);
}

int* createFloatArray(int size) {
    return (int*) createArray<float>(size);
}

void setArrayItemFloat(int* array, int index, float item) {
    setArrayItem<float>((vector<float>*) array, index, item);
}

float getArrayItemFloat(int* array, int index) {
   return getArrayItem<float>((vector<float>*) array, index);
}

int* createCharArray(int size) {
    return (int*) createArray<char>(size);
}

void setArrayItemChar(int* array, int index, char item) {
    setArrayItem<char>((vector<char>*) array, index, item);
}

char getArrayItemChar(int* array, int index) {
   return getArrayItem<char>((vector<char>*) array, index);
}

#ifdef __cplusplus
}
#endif