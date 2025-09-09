function isPalindrome(x: number): boolean {
    const num = x;
    if (x < 0) return false;

    let ans = 0;

    while (x > 0) {
        let lastDigit = x % 10;
        ans = 10 * ans + lastDigit;
        x = Math.floor(x / 10);
    }
    return num === ans;
};