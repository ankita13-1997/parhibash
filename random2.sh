#!/bin/bash -x
isP=2
isf=1;
r=$(($RANDOM%3))
if [[ $r -eq $isf ]]
then
   echo "employee is present in full time"
elif [[ $r -eq $isP ]]
then
   echo "employee is presnt half time"
else
echo "employee is absent"
fi
