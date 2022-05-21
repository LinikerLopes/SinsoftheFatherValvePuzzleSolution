#include <iostream>
using namespace std;
int main(){
	int num;
	cout << "Digite o numero do final da nota: " << endl;
	cin >> num;

	for (int i = 0;i<=5; i++){
		for (int i2 = 0; i2<=5; i2++){
			if (i * 7 + i2 * 4 == num){
				cout << "VAlvula norte: "<< i << endl;
				cout << "Valvula Sul: "<< i2 << endl;
				cout << "Finalizado" << endl;
			}
		}
	}
	cout << "Algoritmo feito pelo Woox" << endl;
	system("pause");
}

