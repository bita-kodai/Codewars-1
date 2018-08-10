def unique_in_order(iterable):
    prev = 'PLACEHOLDER_VALUE-------------'
    uniques = []
    for i in range(0,len(iterable)):
        if(not (iterable[i] == prev) ):
            uniques.append(iterable[i])
        prev = iterable[i]
      
    return uniques