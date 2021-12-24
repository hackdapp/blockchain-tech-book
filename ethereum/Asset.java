package org.fisco.bcos.asset.contract;

public class Asset extends Contract {
// Asset.sol合约 transfer接口生成
public TransactionReceipt transfer(String from_account, String to_account, BigInteger amount);
// Asset.sol合约 register接口生成
public TransactionReceipt register(String account, BigInteger asset_value);
// Asset.sol合约 select接口生成
public Tuple2<BigInteger, BigInteger> select(String account) throws ContractException;

// 加载Asset合约地址，生成Asset对象
public static Asset load(String contractAddress, Client client, CryptoKeyPair credential);


// 部署Assert.sol合约，生成Asset对象
public static Asset deploy(Client client, CryptoKeyPair credential) throws ContractException;
}
