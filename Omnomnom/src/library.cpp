#include <iostream>
#include <string>
#include <vector>

using namespace std;

template <class T>
long print(T x) {
    cout << x << endl;
    return 0;
}

template <class T>
vector<T>* createArray(long size) {
    return new vector<T>(size);
}

template <class T>
long size(vector<T> *list) {
    return list->size();
}

template <class T>
T get(vector<T> *list, long index) {
    return list->at(index);
}

template <class T>
void set(vector<T> *list, long index, T x) {
    list->at(index) = x;
}

template <class T>
void append(vector<T> *list, T x) {
    list->push_back(x);
}

template <class T>
void remove(vector<T> *list, long index) {
    list->erase((list->begin()) + index);
}

template <class T>
void deleteArray(vector<T> *list) {
    delete(list);
}

#ifdef __cplusplus
extern "C" { 
#endif
    long GG(long a, float b) {
        return a+b;
    }

    long read_i(long a) {
        cin >> a;
        return a;
    }

    long print_i(long a) {
        return print(a);
    }

    long print_f(double a) {
        return print(a);
    }

    long print_b(bool a) {
        if (a) return print("true");
        else return print("false");
    }

    long print_s(vector<char>* a) {
        for (long i = 0; i < a->size(); i++) {
            cout << a->at(i);
        }
        cout << endl;
        return 0;
    }
    
    long iexp(long a, long b) {
        long ret = 1;
        for (long i = 0; i < b; i++) {
            ret *= a;
        }
        return ret;
    }

    double fexp(double a, long b) {
        double ret = 1;
        for (long i = 0; i < b; i++) {
            ret *= a;
        }
        return ret;
    }

    /* Array */
    void* createArray_i(long size) {
        return (void*) createArray<long>(size);
    }

    long size_i(void* list) {
        return size<long>((vector<long>*)list);
    }

    void set_i(void* list, long index, long item) {
        set<long>((vector<long>*) list, index, item);
    }
    
    long get_i(vector<long> *list, long index) {
        return list->at(index);
    }
    
    void append_i(void* list, long item) {
        append<long>((vector<long>*)list,item);
    }
    
    void remove_i(void* list, long index) {
        remove<long>((vector<long>*)list, index);
    }
    
    void deleteArray_i(void* list) {
        deleteArray<long>((vector<long>*)list);
    }
 
    void* createArray_f(long size) {
        return (void*) createArray<double>(size);
    }

    long size_f(void* list) {
        return size<double>((vector<double>*)list);
    }

    void set_f(void* list, long index, double item) {
        set<double>((vector<double>*) list, index, item);
    }
    
    double get_f(vector<double> *list, long index) {
        return list->at(index);
    }
    
    void append_f(void* list, double item) {
        append<double>((vector<double>*)list,item);
    }
    
    void remove_f(void* list, long index) {
        remove<double>((vector<double>*)list, index);
    }
    
    void deleteArray_f(void* list) {
        deleteArray<double>((vector<double>*)list);
    }
    
    void* createArray_b(long size) {
        return (void*) createArray<bool>(size);
    }

    long size_b(void* list) {
        return size<bool>((vector<bool>*)list);
    }
    
    bool get_b(vector<bool> *list, long index) {
        return list->at(index);
    }

    void set_b(void* list, long index, bool item) {
        set<bool>((vector<bool>*) list, index, item);
    }
    
    void append_b(void* list, bool item) {
        append<bool>((vector<bool>*)list,item);
    }
    
    void remove_b(void* list, long index) {
        remove<bool>((vector<bool>*)list, index);
    }
    
    void deleteArray_b(void* list) {
        deleteArray<bool>((vector<bool>*)list);
    }
    
    void* createArray_s(long size) {
        return (void*) createArray<char>(size);
    }

    long size_s(void* list) {
        return size<char>((vector<char>*)list);
    }
    
    bool get_s(vector<char> *list, long index) {
        return list->at(index);
    }

    void set_s(void* list, long index, char item) {
        set<char>((vector<char>*) list, index, item);
    }
    
    void append_s(vector<char> *list, vector<char>* item) {  
        long size = item->size();
        for (long i = 0; i < size; i++) {
            append<char>(list,item->at(i));
        }
    }
    
    void remove_s(void* list, long index) {
        remove<char>((vector<char>*)list, index);
    }
    
    void deleteArray_s(void* list) {
        deleteArray<char>((vector<char>*)list);
    }


#ifdef __cplusplus
}
#endif