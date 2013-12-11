using namespace std;
#include <iostream>

int main()
{
    int casos;cin >> casos;
    for(int i=0;i<casos;i++)
    {
        int numCorredores;cin >> numCorredores;
        int max=0;
        for(int j=0;j<numCorredores;j++)
        {
            int vEste;cin >> vEste;
            if(vEste>max)max=vEste;
        }
        cout << "Case " << (i+1) << ": " << max << endl;
    }
    return 0;
}
