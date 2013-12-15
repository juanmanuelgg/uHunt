using namespace std;
#include <cstdio>

int test=true;

int main()
{
    if(test) freopen("../../data/easy/TeXQuotes.in","r",stdin);

    char c;
    int aux=0;

    while(scanf("%c",&c)!=EOF)
    {
        if(c=='"')
        {
            if(aux%2==0) printf("``");
            else printf("''");
            aux++;
        }
        else printf("%c",c);
    }
    return 0;
}
