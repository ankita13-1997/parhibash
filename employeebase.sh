#! /bin/bash -x
echo "_________welcome employee to employee desk_____________"
isPresent=1
c=$(($RANDOM%2))

if [[ $c -eq $isPresent ]]
then
salary=$((8*20))
echo $salary
else
salary=$((20*0))
echo $salary
fi
