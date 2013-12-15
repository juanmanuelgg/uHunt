using namespace std;
#include<cstdio>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/PackingForHoliday.in","r",stdin);

    int casos,L,W,H;
    scanf("%d",&casos);

    for(int i=1;i<=casos;i++)
    {
        scanf("%d %d %d",&L,&W,&H);

        printf("Case %d: ",i);
        if(L<=20 && W<=20 && H<=20) printf("good\n");
        else printf("bad\n");
    }
    return 0;
}
