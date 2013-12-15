using namespace std;
#include<cstdio>
#include<iostream>
#include<string>

bool test=true;

int main()
{
    if(test) freopen("../data/easy/LanguageDetection.in","r",stdin);

    string s;cin>>s;
    cout<<s<<endl;
    for(int i=1; i<10 ;i++)
    {
        printf("Case %d: ",i);
        if(s=="HELLO") printf("ENGLISH\n");
        else if(s=="HOLA") printf("SPANISH\n");
		else if(s=="HALLO") printf("GERMAN\n");
		else if(s=="BONJOUR") printf("FRENCH\n");
        else if(s=="CIAO") printf("ITALIAN\n");
        else if(s=="ZDRAVSTVUJTE") printf("RUSSIAN\n");
		else printf("UNKNOWN\n");
		cout << s<<endl;

		cin>>s;
    }
    return 0;
}
