using namespace std;
#include<cstdio>
#include<cstring>

bool test=true;

int main()
{
    if(test) freopen("../../data/easy/One_Two_Three.in","r",stdin);

    char one[]={'o','n','e'};
    char linea[6];
    int casos, tam, num1;
    scanf("%d",&casos);

    while(casos--)
    {
        scanf("%s",linea);
        tam=strlen(linea);

        if(tam==5) printf("3\n");
        else
        {
            num1=0;
            for(int j=0;j<tam;j++)if(linea[j]==one[j]) num1++;
            if(num1>=2) printf("1\n");
            else printf("2\n");
        }

    }

    return 0;
}
