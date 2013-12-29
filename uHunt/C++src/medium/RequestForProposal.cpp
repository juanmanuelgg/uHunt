using namespace std;
#include<cstdio>
#include<iostream>
#include<string>
#include<vector>

bool test=true;

struct propuesta
{
    string nombre;
    double precio;
    double numReqsCumplidos;
};

int main()
{
    if(test) freopen("../../data/medium/RequestForProposal.in","r",stdin);

    int numRequisitos;cin >> numRequisitos;
    int numEmpresas;cin >> numEmpresas;
    for(int i=0; numEmpresas!=0 && numRequisitos!=EOF; i++)
    {
        string req;
        for(int j=0; j<numRequisitos; j++) getline(cin,req);

        vector<propuesta> props;
        int maxReqsCumplidos=0;
        for (int j = 0; j < numEmpresas; j++)
        {
            props.push_back(propuesta());
            cin >> props[j].nombre;
            cin >> props[j].precio;
            cin >> props[j].numReqsCumplidos;

            int auxl=props[j].numReqsCumplidos;
            if(auxl>maxReqsCumplidos) maxReqsCumplidos=auxl;

            string reqcumple;
            for (int k = 0; k < auxl ; k++)getline(cin,reqcumple);
		}

		vector<propuesta> primerFiltro;
		double menorPrecio=-1.0;
		int tamSegFiltro=0;
		for (int j=0; j<numEmpresas; j++)
        {
            if(props[j].numReqsCumplidos==maxReqsCumplidos)
            {
                primerFiltro.push_back(props[j]);
                if(props[j].precio<menorPrecio || menorPrecio==-1)menorPrecio=props[j].precio;
                tamSegFiltro++;
            }
        }

        vector<propuesta> segundoFiltro;
        for (int j = 0; j < tamSegFiltro; j++) if(primerFiltro[j].precio==menorPrecio)segundoFiltro.push_back(primerFiltro[j]);

        cout << "RFP #" << i << endl;
        cout << segundoFiltro[0].nombre << endl;

        cin >> numRequisitos;
        cin >> numEmpresas;
    }
    return 0;
}
