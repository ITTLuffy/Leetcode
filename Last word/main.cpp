#include <iostream>
#include <string>

int lengthOfLastWord(const std::string& s) {
    int length = 0;
    int i = s.length() - 1;

    // Ignora spazi finali
    while (i >= 0 && s[i] == ' ') {
        i--;
    }

    // Conta i caratteri dell'ultima parola
    while (i >= 0 && s[i] != ' ') {
        length++;
        i--;
    }

    return length;
}

int main() {
    std::string s;
    std::cout << "Inserisci una stringa: ";
    std::getline(std::cin, s);

    int result = lengthOfLastWord(s);
    std::cout << "Lunghezza dell'ultima parola: " << result << std::endl;

    return 0;
}
