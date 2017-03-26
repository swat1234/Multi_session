#!/bin/ksh

#Pre requisite : Install pssh 

#Copy the input to a temporary file
echo "$1" > tmp.txt

#Replace comma(,) with newline(\n) in the temp fil
sed -i 's/,/\n/g' tmp.txt

#Parallel-ssh is a command used to connect to multiple terminals from a single host. 
#Below command connects to all the hosts inputted and creates file named sample.txt

parallel-ssh -i -h a.txt -l root -A -i touch sample.txt
rm -f tmp.txt
