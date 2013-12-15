using namespace std;
#include <cstdio>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/RelationalOperators.in","r",stdin);

    int cases, num1, num2;

    scanf("%d",&cases);
    while(cases--)
    {
        scanf("%d %d",&num1,&num2);
        char rta=(num1<num2)?'<':'>';
        rta=(num1==num2)?'=':rta;

        printf("%c\n",rta);
    }
    return 0;
}
