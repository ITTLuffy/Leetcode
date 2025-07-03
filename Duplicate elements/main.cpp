#include <iostream>
#include <vector>

int removeDuplicates(std::vector<int>& nums) {
    if (nums.empty()) return 0;

    int k = 1;

    for (int i = 1; i < nums.size(); ++i) {
        if (nums[i] != nums[k - 1]) {
            nums[k] = nums[i];
            ++k;
        }
    }

    return k;
}

int main() {
    std::vector<int> nums = {1, 1, 2};

    int k = removeDuplicates(nums);

    std::cout << "k = " << k << std::endl;
    std::cout << "Modified nums: ";
    for (int i = 0; i < k; ++i) {
        std::cout << nums[i] << " ";
    }
    std::cout << std::endl;

}
