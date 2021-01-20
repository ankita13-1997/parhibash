#! /bin/bash -x
echo "_________welcome employee to employee desk_____________"
isPresent=1
c=$(($RANDOM%2))
if [[ $c -eq $isPresent ]]
then
  echo"employee is present"
else
echo "employee is absent"
fi
