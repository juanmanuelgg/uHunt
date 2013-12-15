using namespace std;
#include<cstdio>
#include<cstring>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/SaveSetu.in","r",stdin);

    char comando[7];
    int casos, total, estaDonacion;
    scanf("%d",&casos);
    while(casos--)
    {
        scanf("%s",comando);
        if(strcmp(comando,"donate")==0)
        {
            scanf("%d",&estaDonacion);
            total+=estaDonacion;
        }
        else  printf("%d\n",total);
    }
    return 0;
}
