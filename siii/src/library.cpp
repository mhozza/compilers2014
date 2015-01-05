#include <vector>
#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

template <class T>
class Range {
    T start;
    T end;
    T jump;
public:
    T at(long i) {
        return start + i * jump;
    }

    bool last(long i) {
        return i >= end;
    }

    long size() {
        return ((long)((end - start)/jump));
    }

    Range(T s, T e, T j) {
        start = s;
        end = e;
        jump = j;
    }
};

template <class T>
long print(T v) {
    cout << v << endl;
    return 0;
}

template <class T>
T read() {
    T v;
    cin >> v;
    return v;
}

template <class T>
vector<T>* createList(long size) {
    vector<T>* v = new vector<T>(size);
    // cout << "List:" << v << endl;
    return v;
}

template <class T>
vector<T>* createListFromRange(Range<T>* range) {
    vector<T>* v = new vector<T>(range->size());
    for (int i  = 0; i < range->size(); i++) {
        (*v)[i] = range->at(i);
    }
    return v;
}

template <class T>
T getListItem(vector<T> *list, long index) {
    T item = (*list)[index];
    // cout << "Get:" << item << endl;
    return item;
}

template <class T>
void setListItem(vector<T> *list, long index, T item) {
    (*list)[index] = item;
    //cout << "Set:" << (*list)[index] << endl;
}


#ifdef __cplusplus
extern "C"
{
#endif

//--Int------------------
long printInt(long a) {
    return print(a);
}

long readInt() {
    return read<long>();
}

void* createListInt(long size) {
    return (void*) createList<long>(size);
}

void* createListFromRangeInt(void* range) {
    return (void*) createListFromRange<long>((Range<long>*) range);
}

void* createRangeInt(long start, long end, long jump) {
    return (void*) new Range<long>(start, end, jump);
}

void setListItemInt(void* list, long index, long item) {
    setListItem<long>((vector<long>*) list, index, item);
}

long getListItemInt(void* list, long index) {
    getListItem<long>((vector<long>*) list, index);
}

long getRangeItemInt(void* range, long index) {
    return ((Range<long>*) range)->at(index);
}

long sizeListInt(void* list1) {
    return ((vector<long> *)list1)->size();
}

long sizeRangeInt(void* range1) {
    return ((Range<long> *)range1)->size();
}

//--Char------------------

long printChar(char a) {
    return print(a);
}

long printString(vector<char>* list) {
    for (int i = 0; i < list->size(); i++) {
        cout << (*list)[i];
    }
    cout << endl;
}

void* createRangeChar(char start, char end, char jump) {
    return (void*) new Range<char>(start, end, jump);
}

void* createListChar(long size) {
    return (void*) createList<char>(size);
}

void* createListFromRangeChar(void* range) {
    return (void*) createListFromRange<char>((Range<char>*) range);
}

void setListItemChar(void* list, long index, char item) {
    setListItem<char>((vector<char>*) list, index, item);
}

char getListItemChar(void* list, long index) {
    getListItem<char>((vector<char>*) list, index);
}

long sizeListChar(void* list1) {
    return ((vector<char> *)list1)->size();
}

#ifdef __cplusplus
}
#endif
