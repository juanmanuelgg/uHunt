using namespace std;
#include <iostream>
#include <cstdio>

int main()
{
    int casos;cin >> casos;
    while(casos!=0)
    {
        int x;cin >> x;
        int y;cin >> y;

        for(int i=0;i<casos;i++)
        {
            //int xp;cin >> xp;
            //int yp;cin >> yp;
            int xp,yp;
            scanf("%d %d",&xp,&yp);

            if(xp==x||yp==y)cout << "divisa";
            else if(xp>x&&yp>y)cout << "NE";
            else if(xp<x&&yp>y)cout << "NO";
            else if(xp<x&&yp<y)cout << "SO";
            else if(xp>x&&yp<y)cout << "SE";
            cout << endl;
        }
        cin >> casos;
    }
    return 0;
}
