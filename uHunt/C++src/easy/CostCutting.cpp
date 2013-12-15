using namespace std;
#include <cstdio>
#include <algorithm>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/CostCutting.in","r",stdin);

    int datos[3];
    int casos;

    scanf("%d",&casos);
    for(int i=0;i<casos;i++)
    {

        scanf("%d %d %d",&datos[0],&datos[1],&datos[2]);
        sort(datos,datos+3);

        printf("Case %d: %d\n",(i+1),datos[1]);
    }
    return 0;
}
