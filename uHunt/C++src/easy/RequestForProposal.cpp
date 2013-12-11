using namespace std;
#include <iostream>
#include <string>
#include <vector>

struct propuesta
{
    string nombre;
    double precio;
    int numReqCumlplidos;
};

int main()
{
    int numRequisitos;cin >> numRequisitos;
    int numEmpresas;cin >> numEmpresas;
    for(int i=0; numEmpresas!=0 && numRequisitos!=0; i++)
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
            cin >> props[j].numReqCumlplidos;

            int auxl=props[j].numReqsCumplidos;
            if(props[j].numReqCumlplidos>maxReqsCumplidos)maxReqsCumplidos=props[j].numReqCumlplidos;}

            string reqcumple;
            for (int k = 0; k < auxl ; k++)getline(cin,reqcumple);
		}

		vector<propuesta> primerFiltro;
		double menorPrecio=-1.0;
		int tamSegFiltro=0;
		for (int j = 0; j < numEmpresas; j++)
        {
            if(props[j].numReqCumlplidos==maxReqsCumplidos)
            {
                primerFiltro.push_back(props[j]);
                if(props[j].precio<menorPrecio || menorPrecio==-1)menorPrecio=props[j].precio;
                tamSegFiltro++;
            }
        }

        vector<propuesta> segundoFiltro;
        for (int j = 0; j < tamSegFiltro; j++) if(primerFiltro[j].precio==menorPrecio)segundoFiltro.push_back(primerFiltro[j]);

        cout << "RFP #" << i << endl;
        cout << segundoFiltro[0] << endl;

        cin >> numRequisitos;
        cin >> numEmpresas;
    }
    return 0;
}
