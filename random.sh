#!/bin/bash -x
isP=1
r=$(($RANDOM%2))
if [[ $r -eq $isP ]]
then
   echo "employee is present"
else
   echo "employee is absent"
fi
