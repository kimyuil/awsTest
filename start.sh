cd ~/build
mv * ../
cd ~
sudo chmod +x demo-0.0.1-SNAPSHOT.jar
sudo ln -sf /home/ubuntu/demo-0.0.1-SNAPSHOT.jar /etc/init.d/demoweb
sudo service demoweb start
exit 0
