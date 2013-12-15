using namespace std;
#include<cstdio>
#include<cstring>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/Hajj_e_Akbar.in","r",stdin);

    char comando[6];
    scanf("%s",comando);
    for(int i=1;strcmp(comando,"*")!=0;i++)
    {
        printf("Case %d: ",i);
        if(strcmp(comando,"Hajj")==0) printf("Hajj-e-Akbar\n");
        else  printf("Hajj-e-Asghar\n");
        scanf("%s",comando);
    }
    return 0;
}
