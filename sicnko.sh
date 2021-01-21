#! /bin/bash -x

#touch abc.log.1 def.log.1 ghi.log.1 jkl.log.1 mno.log.1

d=`date + '%d%m%Y'`

for file in `ls *.log`
do
    a=`echo $file | awk -F. '{print $1}'`
#abc|def|ghi|jkl
    b=`echo $file | awk -F. '{print $2}'`
#log
    c=`echo $file | awk -F. '{print $3}'`#1
    newFile = 'echo "$a.$d.$b.$c"'
#abc.11012021.log.1
   #echo $newFile
    mv $file $abc.log.1
done
