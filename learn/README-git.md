
1、报OpenSSL 443错误
    解除ssl验证  
    git config http.postBuffer 524288000 
    git config --global http.sslVerify "false"
    更新 git pull
	git config --global http.proxy  查询代理
	git config --global --unset http.proxy  取消代理
	git config --global http.proxy http:172.16.13.171:8080 设置代理
	git config --global https.proxy http:172.16.13.171:8080
	
2、取消文件夹版本控制  find . -name ".git" | xargs rm -Rf