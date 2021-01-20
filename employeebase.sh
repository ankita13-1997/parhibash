#! /bin/bash -x
echo "_________welcome employee to employee desk_____________"
isPresent=1
c=$(($RANDOM%2))
salary=1000
if [[ $c -eq $isPresent ]]
then
salary=$(($salary*20))
echo $salary
else
salary=$(($salary*8))
echo $salary
fi
