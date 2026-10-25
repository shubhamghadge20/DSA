var longestCommonPrefix = function (strs) {
  const first = strs[0];
  let prefix = "";

  for (let i = 0; i < first.length; i++) {
    if (strs.every((s) => s[i] === first[i])) {
      prefix += first[i];
    } else {
      break;
    }
  }

  return prefix;
};
