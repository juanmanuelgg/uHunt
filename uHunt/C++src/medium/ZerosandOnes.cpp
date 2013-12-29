//ID: 10324
using namespace std;
#include<cstdio>
#include<algorithm>

bool test=true;

int main()
{
    if(test) freopen("../../data/medium/ZerosandOnes.in","r",stdin);

    char linea[1000005];
    int i=1, casos, a, b, init, fin;
    char anterior;
    bool iguales;

    while(scanf("%s",linea)!=EOF)
    {
        printf("Case %d:\n",i++);

        scanf("%d",&casos);
        while(casos--)
        {
            scanf("%d %d",&a,&b);
            init=min(a,b);
            fin=max(a,b);

            anterior=linea[init];
            iguales=true;
            for(int j=init+1;j<=fin;j++)
            {
                if(anterior!=linea[j])
                {
                    iguales=false;
                    break;
                }
                anterior=linea[j];
            }

            if(iguales) printf("Yes\n");
            else printf("No\n");
        }
    }
    return 0;
}
