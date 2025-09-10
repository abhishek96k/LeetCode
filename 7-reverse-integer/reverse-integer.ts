function reverse(x: number): number {
    let xCopy = x;
    let rev = 0;
    x = Math.abs(x);

    while (x > 0) {
        let last_digit = x % 10;
        rev = (rev * 10) + last_digit;
        x = Math.floor(x / 10);
    }

    let limit = Math.pow(2, 31);
    if (rev < -limit || rev > limit) return 0;

    return (xCopy < 0) ? -rev : rev;
};