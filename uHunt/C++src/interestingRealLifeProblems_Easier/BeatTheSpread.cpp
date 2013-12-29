//ID: 10812
using namespace std;
#include<cstdio>

bool test=true;

int main()
{
    if(test) freopen("../../data/interestingRealLifeProblems_Easier/BeatTheSpread.in","r",stdin);

    int casos, a, b, max, min;
    scanf("%d",&casos);

    while(casos--)
    {
        scanf("%d %d",&a,&b);
        max=((a+b)/2);
        min=((a-b)/2);

        if(max>=0 && min >=0 && (max+min==a)) printf("%d %d\n",max,min);
        else printf("impossible\n");
    }
    return 0;
}
