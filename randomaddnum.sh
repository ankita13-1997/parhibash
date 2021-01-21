#! /bin/bash -x

rc1=$(($RANDOM%6))
rc2=$(($RANDOM%6))
sum=$(($rc1+$rc2 ))

echo  $sum
