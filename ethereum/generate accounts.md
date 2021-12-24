
# 预先生成挖矿帐户以及预置资金帐户；

## 1. 创建密码文件，后续生成帐户统一使用此密码
> echo "111111" > .passwd
## 2. 创建两个帐户，一个挖矿帐户，一个预置资金帐户
> for ((n=0;n<2;n++)); do geth account new --password .passwd --datadir ./data; done