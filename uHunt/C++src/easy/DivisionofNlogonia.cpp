using namespace std;
#include<cstdio>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/DivisionofNlogonia.in","r",stdin);

    int x, y, xp, yp, casos;

    scanf("%d",&casos);
    while(casos!=0)
    {
        scanf("%d %d",&x,&y);
        while(casos--)
        {
            scanf("%d %d",&xp,&yp);

            if(xp==x||yp==y) printf("divisa\n");
            else if(xp>x&&yp>y) printf("NE\n");
            else if(xp<x&&yp>y) printf("NO\n");
            else if(xp<x&&yp<y) printf("SO\n");
            else if(xp>x&&yp<y) printf("SE\n");
        }
        scanf("%d",&casos);
    }
    return 0;
}
