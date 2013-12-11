using namespace std;
#include <cstdio>
#include <iostream>

int test=false;

char solve()
{
    int num1; cin >> num1;
    int num2; cin >> num2;
    char rta=(num1<num2)?'<':'>';
    rta=(num1==num2)?'=':rta;
    return rta;
    //cout << rta << endl;
}

int main()
{
    int cases; cin >> cases;
    for(int i=0;i<cases;i++)
    {
      char rta=solve();
      printf("%c\n",rta);
    }
    return 0;
}
