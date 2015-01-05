#include <vector>
#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

#define LL long

template <class T>
class Range {
    T start;
    T end;
    T jump;
public:
    T at(LL i) {
        return start + i * jump;
    }

    bool last(LL i) {
        return i >= end;
    }

    LL size() {
        return ((LL)((end - start)/jump));
    }

    Range(T s, T e, T j) {
        start = s;
        end = e;
        jump = j;
    }
};

template <class T>
LL print(T v) {
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
vector<T>* createList(LL size) {
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
T getListItem(vector<T> *list, LL index) {
    T item = (*list)[index];
    // cout << "Get:" << item << endl;
    return item;
}

template <class T>
void setListItem(vector<T> *list, LL index, T item) {
    (*list)[index] = item;
    //cout << "Set:" << (*list)[index] << endl;
}


#ifdef __cplusplus
extern "C"
{
#endif

//--Int------------------
LL printInt(LL a) {
    return print(a);
}

LL readInt() {
    return read<LL>();
}

void* createListInt(LL size) {
    return (void*) createList<LL>(size);
}

void* createListFromRangeInt(void* range) {
    return (void*) createListFromRange<LL>((Range<LL>*) range);
}

void* createRangeInt(LL start, LL end, LL jump) {
    return (void*) new Range<LL>(start, end, jump);
}

void setListItemInt(void* list, LL index, LL item) {
    setListItem<LL>((vector<LL>*) list, index, item);
}

LL getListItemInt(void* list, LL index) {
    getListItem<LL>((vector<LL>*) list, index);
}

LL getRangeItemInt(void* range, LL index) {
    return ((Range<LL>*) range)->at(index);
}

LL sizeListInt(void* list1) {
    return ((vector<LL> *)list1)->size();
}

LL sizeRangeInt(void* range1) {
    return ((Range<LL> *)range1)->size();
}

//--Bool------------------

LL printBool(bool a) {
    return print(a);
}

void* createListBool(LL size) {
    return (void*) createList<bool>(size);
}

void* createListFromRangeBool(void* range) {
    return (void*) createListFromRange<bool>((Range<bool>*) range);
}

void setListItemBool(void* list, LL index, bool item) {
    setListItem<bool>((vector<bool>*) list, index, item);
}

bool getListItemBool(void* list, LL index) {
    getListItem<bool>((vector<bool>*) list, index);
}

LL sizeListBool(void* list1) {
    return ((vector<bool> *)list1)->size();
}

//--Char------------------

LL printChar(char a) {
    return print(a);
}

LL printString(vector<char>* list) {
    for (int i = 0; i < list->size(); i++) {
        cout << (*list)[i];
    }
    cout << endl;
}

void* createRangeChar(char start, char end, char jump) {
    return (void*) new Range<char>(start, end, jump);
}

void* createListChar(LL size) {
    return (void*) createList<char>(size);
}

void* createListFromRangeChar(void* range) {
    return (void*) createListFromRange<char>((Range<char>*) range);
}

void setListItemChar(void* list, LL index, char item) {
    setListItem<char>((vector<char>*) list, index, item);
}

char getListItemChar(void* list, LL index) {
    getListItem<char>((vector<char>*) list, index);
}

LL sizeListChar(void* list1) {
    return ((vector<char> *)list1)->size();
}


//--List----------------------

void* createListPointer(LL size) {
    return (void*) createList<void*>(size);
}

void setListItemPointer(void* list, LL index, void* item) {
    setListItem<void*>((vector<void*>*) list, index, item);
}

void* getListItemPointer(void* list, LL index) {
    getListItem<void*>((vector<void*>*) list, index);
}

LL sizeListPointer(void* list1) {
    return ((vector<void*> *)list1)->size();
}

#ifdef __cplusplus
}
#endif
