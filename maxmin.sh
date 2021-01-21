echo "enter size(n)"
read n
  i=1
  max=0
  min=0
echo "enter the numbers"
     while [ $i -le $n ]
          do
             read num
               if [ $i -eq 1 ]
                  then
                      max=$num
                       else
                         if [ $num -gt $max ]
                          then
                           max=$num
                          fi
                      fi
              if [ $i -eq 1 ]
                 then 
                   min=$num
                    else 
                           if [ $num -lt $min ]
                            then
                              min=$num
                            fi
                  fi
                 i=$(($i+1))
                 done
                   echo $max " is maximum"
                   echo $min " is minimum"
