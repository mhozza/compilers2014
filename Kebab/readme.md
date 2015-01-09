Kompilatory KEBAB
=============


Zmeny v specifikacii
--------------------
Zmena deklaracie premenych:
premente sa deklaruju:
<type> VAR;
VAR = <value>;
napriklad:
int i;
i = 10;


Kyeword:
nie vsetky su implemtovane, zostava doimplementovat:
break, case, const, continue, default, do, elseif, enum, new, private, protected, public,  switch, this, void, IN

Nie je implementovane:
a) objects
b) set
c) hashmap
d) forcycles (je zatial iba while)
e) conditions (je zatial iba if () { } else { })
g) functions (deklarovat sa daju bez specifikacie typu a su defaulte int)
h) class - nie su deklarovanie visibilities a volania method class
