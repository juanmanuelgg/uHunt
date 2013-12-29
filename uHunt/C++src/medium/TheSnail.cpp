using namespace std;
#include<cstdio>
#include<iostream>
#include<string>

bool test=true;

int main()
{
    if(test) freopen("../../data/medium/TheSnail.in","r",stdin);

    int H;cin >> H;
    int U;cin >> U;
    int D;cin >> D;
    int F;cin >> F;
    while(H!=0 && U!=0 && D!=0 && F!=0)
    {
        double i=1,posSnail=0;
        while(true)
        {
            double subida=(U-(U*(i-1)*F/100));
            posSnail+=(subida>=0)?subida:0;
            if(posSnail>H)break;
            posSnail-=D;
            if(posSnail<0)break;
            i++;
        }

        string r1=(posSnail<0)?"failure":"success";
        cout << r1 << " on day " << (int)i << endl;

        cin >> H;
        cin >> U;
        cin >> D;
        cin >> F;
    }
    return 0;
}
