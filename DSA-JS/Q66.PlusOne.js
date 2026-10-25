/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
  const arra = [];

  for (let i = 0; i < digits.length; i++) {
    arra.push(digits[i]);
  }

  for (let i = arra.length - 1; i >= 0; i--) {
    if (arra[i] < 9) {
      arra[i]++;
      return arra;
    }

    arra[i] = 0;
  }

  arra.unshift(1);
  return arra;
};
