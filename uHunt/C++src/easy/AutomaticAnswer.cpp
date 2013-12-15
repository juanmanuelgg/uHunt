using namespace std;
#include<cstdio>
#include<string>
#include<sstream>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/AutomaticAnswer.in","r",stdin);

    int casos, num;
    stringstream s;
    string temp;

    scanf("%d",&casos);
    while(casos--)
    {
        scanf("%d",&num);
        num=((((num*63)+7492)*5)-498);

        //num=(num<0)?-num:num;
        //printf("%d\n",(num/10)%10);

        s << num;
        temp=s.str();
        printf("%c\n",temp[temp.length()-2]);
    }
    return 0;
}
