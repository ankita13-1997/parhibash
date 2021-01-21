#! /bin/bash
echo "enter the value of = n"
read n
mul=1
i=0
while [ $n -ne $i ]
do
mul=`$mul \* 2`
i=`expr $i-1`
done
echo $mul
