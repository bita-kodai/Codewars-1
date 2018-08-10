def aliquot_sum(x):
    return sum(set(d for pair in ([i, x//i] for i in range(1, int(x**0.5)+1) if not x % i) for d in pair)) - x

def buddy(start, limit):
    for n in range(start,limit):
        s_m = n + 1
        s_n = aliquot_sum(n)
        m_candidate = s_n - 1
        if(m_candidate < start):
            continue
        if(aliquot_sum(m_candidate) == s_m):
            return [n,m_candidate]

    return 'Nothing'