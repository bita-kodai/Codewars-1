def DNA_strand(dna)
    map = { "A" => "T", "T" => "A", "G" => "C", "C" => "G" }
    t = dna.clone
    for i in 0...t.length
      t[i] = map[t[i]]
    end
    return t
  end