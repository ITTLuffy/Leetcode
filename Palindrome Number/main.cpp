#include <iostream>
#include <string>
using namespace std;

class Palindroma {
public:
    static bool isPalindrome(int x) {
        string numero = to_string(x);
        int left = 0;
        int right = numero.length() - 1;

        while (left < right) {
            if (numero[left] != numero[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
};

int main() {
    int numero = 121; // esempio di numero palindromo
    bool risultato = Palindroma::isPalindrome(numero);
    cout << "Il numero " << numero << " e palindromo? " << (risultato ? "Si" : "No") << endl;

    return 0;
}
