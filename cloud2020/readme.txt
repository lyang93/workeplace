spring cloud study 
#去掉登陆
git config --system --unset credential.helper
git config --global --unset credential.helper
#添加密码缓存
git config --global credential.helper store