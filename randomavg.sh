#! /bin/bash -x
r1=$((1+$RANDOM%1000))
r3=$((1+$RANDOM%1000))
r3=$((1+$RANDOM%1000))
r4=$((1+$RANDOM%1000))
r5=$((1+$RANDOM%1000))

sum=$(($r1 +$r2 + $r3 +$r4 +$r5))
avg=$(($sum/5))
echo $sum
echo $avg
