using namespace std;
#include <cstdio>
#include <iostream>
#include <algorithm>

int main()
{
    int casos;cin >> casos;
    for(int i=0;i<casos;i++)
    {
        int datos[3];
        cin >> datos[0];
        cin >> datos[1];
        cin >> datos[2];

        std::sort(datos,datos+3);

        printf("Case %d: %d\n",(i+1),datos[1]);
    }
    return 0;
}
