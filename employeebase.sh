#! /bin/bash -x
echo "_________welcome employee to employee desk_____________"
isfull=1
ishalf=2
c=$((RANDOM%3))

case $c in
  $isfull)
      emphrs=20
      ;;
  $ishalf)
      emphrs=8
       ;;
      *)
      emphrs=0
       ;;
esac
salary=$(($emphrs*20))
echo $salary

