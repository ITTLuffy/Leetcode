#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result(2); // vettore per contenere gli indici della soluzione
        for (int i = 0; i < nums.size(); i++) { // ciclo per il primo numero
            for (int j = i + 1; j < nums.size(); j++) { // ciclo per il secondo numero
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // ritorna i due indici trovati
                }
            }
        }
        return result; // ritorno di default (può contenere valori non validi se non trovata la somma)
    }
};

int main() {
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;

    Solution sol;
    vector<int> indices = sol.twoSum(nums, target);

    cout << "Indici trovati: [" << indices[0] << ", " << indices[1] << "]" << endl;

    return 0;
}