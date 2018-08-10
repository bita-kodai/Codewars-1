def wordify(n)
    returnString = ''
    outliers = ['','one','two','three','four','five','six','seven','eight','nine','ten','eleven','twelve','thirteen','fourteen','fifteen','sixteen','seventeen','eighteen','nineteen']
    tens = ['twenty','thirty','forty','fifty','sixty','seventy','eighty','ninety']
    if(n <= 20)
      return outliers[n]
    elsif(n<100)
      returnString << tens[n/10 - 2]
      if(n%10 != 0) 
        returnString << " "
        returnString << outliers[n%10]
      end
    else
      returnString << outliers[n/100]
      returnString << " hundred"
      if(n%100 == 0)
        return returnString
      elsif(n%100 > 19)
        returnString << " "
        n = n % 100
        returnString << tens[n/10 - 2]
        if(n%10 != 0) 
          returnString << " " << outliers[n%10]
        end
      else
        returnString << " " << outliers[n%100]
      end
    end
    return returnString
  end