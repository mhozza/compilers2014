#include <vector>
#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

template <class T>
long print(T v) {
    cout << v << endl;
    return 0;
}
template <class T>
vector<T>* createArray(long size) {
    vector<T>* v = new vector<T>(size);
    return v;
}

template <class T>
T getArrayItem(vector<T> *Array, long index) {
    T item = (*Array)[index];
    return item;
}

template <class T>
void setArrayItem(vector<T> *Array, long index, T item) {
    (*Array)[index] = item;

}
template <class T>
vector<T> * mergeArrays(vector<T> *Array1, vector<T> *Array2) {
    vector<T> *v = createArray<T>(0);
    v->insert(v->end(), Array1->begin(), Array1->end());
    v->insert(v->end(), Array2->begin(), Array2->end());
    return v;
}

template <class T>
vector<T> * multiplyArray(vector<T> *Array1, long val) {
    vector<T> *v = createArray<T>(0);
    for (long i = 0; i < val; i++) {
        v->insert(v->end(), Array1->begin(), Array1->end());
    }
    return v;
}

template <class T>
T read() {
    T v;
    cin >> v;
    return v;
}
#ifdef __cplusplus
extern "C"
{
#endif

long readInt() {
    return read<long>();
}
long printInt(long a) {
    return print(a);
}

void* createArrayInt(long size) {
    return (void*) createArray<long>(size);
}

void setArrayItemInt(void* Array, long index, long item) {
    setArrayItem<long>((vector<long>*) Array, index, item);
}

long getArrayItemInt(void* Array, long index) {
    getArrayItem<long>((vector<long>*) Array, index);
}

void* mergeArraysInt(void *Array1, void *Array2) {
    return (void*) mergeArrays<long>((vector<long> *)Array1, (vector<long> *)Array2);
}

void* multiplyArrayInt(void *Array1, long val) {
    return (void*) multiplyArray<long>((vector<long> *)Array1, val);
}

long sizeArrayInt(void* Array1) {
    return ((vector<long> *)Array1)->size();
}

#ifdef __cplusplus
}
#endif
