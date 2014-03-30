using namespace std;
#include<cstdio>
#include<algorithm>

bool test=true;

int main()
{
    if(test) freopen("../../data/extra/FallingAnts.in","r",stdin);

    int T, L, W, H, rta;
    double max;

    for(scanf("%d",&T); T!=0; scanf("%d",&T))
    {
        int volums[T];
        double accs[T];
        rta=0;max=0.0;

        for(int i=0;i<T;i++)
        {
            scanf("%d %d %d",&L,&W,&H);
            volums[i]=L*W*H;
            accs[i]=(10.0-(10.0/(2*H)));
            max=std::max(accs[i],max);
        }

        for(int i=0;i<T;i++) if(accs[i]==max) rta=std::max(rta,volums[i]);

        printf("%d\n",rta);
    }

    return 0;
}
