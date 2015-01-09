#include <iostream>
#include <cmath>
#include <cstring>

using namespace std;

extern "C"
int printInt(int a) {
        cout << a << endl;
        return 0;
}

extern "C"
int printString(char* pole){
        cout << pole << endl;
        return 0;
}

extern "C"
int printString2(char* pole, int length){
        string myString;
        myString.assign(pole, length);
        cout << myString << endl;
        return 0;
}

extern "C"
int printFloat(double a) {
        cout << a << endl;
        return 0;
}

extern "C"
int readInt() {
        int i;
        cin >> i;
        return i;
}

extern "C"
char* readString() {
        string s;
        getline (cin,s);
        return strcpy((char*)malloc(s.length()+1), s.c_str());
}

extern "C"
int getLengthString(char* pole){
    return strlen(pole);
}

extern "C"
int iexp(int a, int b) {
        int ret = 1;
        for (int i = 0; i < b; i++) {
                ret *= a;
        }
        return ret;
}

extern "C"
double fexp(double a, double b) {
        return pow(a, b);
}

extern "C"
int* createArrayInt(int length) {
    int* pole = new int[length];
    for(int i = 0; i < length; i++) pole[i] = 0;
    return pole;
}

extern "C"
int* getElementArrayInt(int* pole, int index){
    return pole+index;
}

extern "C"
char* createArrayChar(int length) {
    char* pole = new char[length];
    for(int i = 0; i < length; i++) pole[i] = '\0';
    return pole;
}

extern "C"
char* getElementArrayChar(char* pole, int index){
    return pole+index;
}

extern "C"
double* createArrayFloat(int length) {
    double* pole = new double[length];
    for(int i = 0; i < length; i++) pole[i] = 0.0;
    return pole;
}

extern "C"
double* getElementArrayFloat(double* pole, int index){
    return pole+index;
}

extern "C"
bool* createArrayBool(int length) {
    bool* pole = new bool[length];
    for(int i = 0; i < length; i++) pole[i] = false;
    return pole;
}

extern "C"
bool* getElementArrayBool(bool* pole, int index){
    return pole+index;
}

extern "C"
int myrandom() {
       return 47;
}

