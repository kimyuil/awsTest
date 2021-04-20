#!/bin/bash
test=`service --status-all|grep demoweb`
len=`echo $test |wc -L`
if [ ${len} -ne 0 ];then
        echo shut down!
        sudo service demoweb stop
fi


