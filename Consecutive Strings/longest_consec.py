def longest_consec(strarr, k):
    if(not strarr or k > len(strarr) or k <= 0):
        return ""
        
    longest=""
    #Range is to account for our lookahead distance of "k" in the array
    for i in range(0,len(strarr)-k+1):
        #Keep building a composite string of k strings.
        new = "".join(strarr[x] for x in range(i,i+k))
        
        #If our new composite is longer than our old, replace the old
        if(len(new) > len(longest)):
            longest = new
    
    return longest