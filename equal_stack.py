# Complete the 'equalStacks' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY h1
#  2. INTEGER_ARRAY h2
#  3. INTEGER_ARRAY h3

def equalStacks(h1, h2, h3):
    s1 = sum(h1)
    s2 = sum(h2)
    s3 = sum(h3)

    while s1 != s2 or s2 != s3:
        max_sum = max(s1, s2, s3)
        if s1 == max_sum:
            s1 = s1 - h1.pop(0)
        elif s2 == max_sum:
            s2 = s2 - h2.pop(0)
        else:
            s3 = s3 - h3.pop(0)

    return s1
