# 快速开始 Getting Started

滴滴云Java开发者工具套件（didiyun-java-sdk）可让您在java语言环境下不用复杂编程即可访问滴滴云下计算产品线产品及账单类操作。本节介绍如何获取滴滴云java sdk并开始调用。

## 环境准备
* 滴滴云java sdk基于java语言，因此，本文默认您已安装java的基本语言环境，将不再进行赘述。
* 滴滴云java sdk使用OAuth 2.0协议Bearer Token(RFC 6750)形式进行API访问授权。为使用滴滴云Java SDK，您需要为账号生成一个滴滴云API Token。您可在滴滴云控制台中的API Token管理页面上创建您的Token。

## 安装滴滴云Java SDK

### 通过Maven来管理项目依赖

如果您使用Apache Maven来管理您的Java项目，只需要在`pom.xml`中添加依赖即可，如下所示：

```xml
<dependency>
    <groupId>com.didiyun</groupId>
    <artifactId>didiyun-java-sdk</artifactId>
    <version>1.0.3</version>
</dependency>
```

## 使用滴滴云Java SDK
以下代码示例展示了调用滴滴云Java SDK的四个主要步骤：

1. 创建一个gRPC Channel
2. 使用OAuth2 Token验证方式，根据channel创建一个stub
3. 组装请求体
4. 发起请求并处理应答或错误

```java
package com.didiyun.compute.v1;

import com.didiyun.base.v1.Header;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.protobuf.util.JsonFormat;
import io.grpc.ManagedChannel;
import io.grpc.auth.MoreCallCredentials;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

public class Example {

    private static String ServerHost = "open.didiyunapi.com";
    private static int ServerPort = 8080;
    private static String Token = "token";

    public static void main(String[] args) throws Exception {
        //1. 创建一个gRPC Channel
        ManagedChannel channel = NettyChannelBuilder.forAddress(ServerHost, ServerPort)
                .sslContext(GrpcSslContexts
                        .forClient()
                        .build())
                .negotiationType(NegotiationType.TLS)
                .userAgent("didiyun-java-sdk-client/v1")
                .build();
        //2. 使用OAuth2 Token验证方式，根据channel创建一个stub
        Dc2Grpc.Dc2BlockingStub stub = Dc2Grpc.newBlockingStub(channel).withCallCredentials(
                MoreCallCredentials.from(
                        OAuth2Credentials.create(
                                new AccessToken(Token, null)
                        )
                ));
        //3. 组装请求体
        ListDc2Request request = ListDc2Request.newBuilder()
                .setHeader(Header.newBuilder()
                        .setRegionId("gz")
                        .build())
                .setStart(0)
                .setLimit(10)
                .build();
        //4. 发起请求并处理应答或错误
        ListDc2Response response = stub.listDc2(request);
        if (response.getError().getErrno() != 0) {
            throw new Exception(response.getError().getErrmsg());
        }
		System.out.println(JsonFormat.printer().print(response));
    }

}
```

# 返回结构与错误处理
调用滴滴云Java SDK中的所有Client的相应方法均会返回对应的Response，所有类型的Response均包含一个通用的滴滴云Error类型和一个Data字段，如下所示。

```java
public final class ListDc2Response {
	public java.util.List<com.didiyun.compute.v1.Dc2Info> getDataList() {...}
	public com.didiyun.base.v1.Error getError() {...}
}

public final class Error {
	public int getErrno() {...}
	public java.lang.String getErrmsg() {...}
	public java.lang.String getRequestId() {...}
}
```

滴滴云Java SDK在服务端出错时，会返回相应的的错误信息。在调用结束时，建议您遵循以下步骤对调用响应进行处理：
1. 对返回响应中的Error中的Errno进行判断，如果不为0，表示服务端产生了错误。
2. 若没有错误，处理返回响应中的Data部分。

```java
ListDc2Response response = stub.listDc2(request);
    if (response.getError().getErrno() != 0) {
        throw new Exception(response.getError().getErrmsg());
    }
System.out.println(JsonFormat.printer().print(response));
```
   
# 异步调用
滴滴云Java SDK中，所有对于资源的操作类请求都是异步实现的。在调用例如DC2开机等一系列异步操作类请求时，您可在返回值中获取到任务信息。

> 滴滴云API的任务（job）具有两个关键概念`done`和`success`，表示任务的执行状态。

| done | success | 说明 | 建议的操作 |
|---|---|---|---|
| false | false | 任务尚未结束运行 | 继续轮询此任务进度 |
| true | false | 任务结束但结果为失败 | 查看result字段中的失败原因，并重新发起操作请求 |
| true | true | 任务结束，结果为成功 | 进行下一步操作 | 


```java
public class CreateDc2Response {
	public com.didiyun.base.v1.Error getError() {...}
	public java.util.List<com.didiyun.base.v1.JobInfo> getDataList() {...}
}
public class JobInfo {
	public java.lang.String getJobUuid() {...}
	public java.lang.String getResourceUuid() {...}
	public double getProgress() {...}
	public java.lang.String getType() {...}
	public boolean getDone() {...}
	public boolean getSuccess() {...}
	public java.lang.String getResult() {...}
}
```

您需要初始化CommonStub，并调用jobResult方法，通过jobUuid来轮询获取此任务的进度。
其中，Done字段表示服务端是否还在处理此任务，Success字段表示处理结果是否成功。
建议您遵循以下步骤对异步任务进行处理：
1. 先判断调用响应是否有错误。
2. 对返回响应中的Done字段进行判断，若为false，则等待片刻重新轮询，若为true，表示任务完成，继续第3步。
3. 判断Success字段，若为true，表示任务操作成功，若为false，表示任务失败，此时可读取result字段查看错误信息。

另外，我们在didiyun-java-sdk工程目录中简单实现了一个具有轮询任务功能的简易客户端`com/didiyun/compute/v1/ExampleCommon.java`，谨作参考。

# 常量与变量规则
本节对滴滴云java sdk中涉及到的一些常量与变量规则进行说明。

## 资源类型（resourceType）
在滴滴云java sdk中，如未进行特殊说明，名为`resourceType`的字段均遵循以下规则。

| resourceType | 说明 |
| ---- | ---- |
| dc2 | 弹性计算主机 |
| eip | 弹性公网IP |
| ebs | 弹性块存储 |
| snap | 磁盘快照，某一个时间点上某一个磁盘的数据备份 |
| vpc | 安全、隔离、IP地址可自定义配置的专有网络 |
| subnet | VPC下所划分的子网 |
| sg | 安全组产品，管控云环境的流量 |
| sgRule | 安全组规则，描述流量出入规则 |
| slb | 滴滴云负载均衡产品 | 

## 云盘类型（diskType）
在滴滴云java sdk中，在EBS以及相关产品中，云盘类型以及对应`diskType`字段共有以下三种。

| 云盘类型 | diskType |
| ---- | ---- |
| SSD云盘 | SSD |
| 高效云盘 | HE |
| 普通云盘 | HDD |

## 网络协议（protocol）
在滴滴云java sdk中，在安全组以及相关产品中，网络协议类型以及对应`protocol`字段共有以下三种。

| 协议类型 | protocol |
| ---- | ---- |
| TCP协议 | TCP |
| UDP协议 | UDP |
| ICMP协议 | ICMP |

## 安全组规则类型（type）
在滴滴云go sdk中，在安全组产品中，安全组规则类型机器对应`type`字段共有以下两种。

| 安全组规则类型 | type |
| ---- | ---- |
| 入方向 | Ingress |
| 出方向 | Egress |

## 地域Id与可用区Id（regionId&zoneId）
在滴滴云java sdk中，如未进行特殊说明，名为`regionId`与`zoneId`的字段均遵循以下规则。
目前

<table>
<tr>
	<th> 地域 </th>
	<th> 地域Id（regionId） </th>
	<th> 可用区 </th>
	<th> 可用区Id （zoneId）</th>
</tr>
<tr>
	<td rowspan="2"> 广州 </td>
	<td rowspan="2" > gz </td>
	<td> 广州一区</td>
	<td> gz01</td>
</tr>
<tr>
	<td> 广州二区</td>
	<td> gz02 </td>
</tr>
<tr>
	<td rowspan="1"> 北京</td>
	<td rowspan="1" > bj</td>
	<td> 北京一区 </td>
	<td> bj01 </td>
</tr>
</table>

## DC2密码规则
在滴滴云java sdk中，密码需要至少8位长度，并同时包含大写字母，小写字母和数字，且需要对密码进行16位编码后传输。

例如，若您想设置DC2的密码为`Aa123456`，则进行16位编码后，结果为`password: "4161313233343536"`。

您可使用`org.apache.commons.codec.binary.Hex`包的`encodeHex`方法编码您的密码。

## 时间戳（timestamp）规则
在滴滴云java sdk中，时间戳均遵循`Unix timestamp`标准，且单位为*毫秒*。

例如，`2019-01-01 00:00:00`对应时间戳为`1546272000000`。

## 网段（cidr）表示规则
在滴滴云java sdk中，在安全组以及VPC等相关产品中，对于网段的描述规则遵循`CIDR`表示法，使用子网掩码来划分。
例如，创建一个可用网段为`172.16.0.0/12`的VPC，则有其IP和掩码为：

|  | 十进制表示 | 二进制表示 |
|---- | ---- | ---- |
| IP | 172.16.0.0 | 10101100 00010000 00000000 00000000 |
| 掩码 | 255.240.0.0 | 11111111 11110000 00000000 00000000 |

可用IP为172.16.0.1~172.31.255.254共1048574个。

# 调用与错误示例
对于滴滴云Java SDK提供的所有接口，文件内均有调用示例，您可通过junit来运行每个接口的调用示例。（部分示例的正确运行需要您手动指定正确参数）。

在调用失败时，您可以通过错误码（Errno）与错误信息（Errmsg）得到调用错误的原因，若无法解决，可联系[滴滴云技术支持](#https://help.didiyun.com/hc/request/new/)。
常见错误码如下：

| 错误码  | 错误信息 |  描述  |
|-----|-----|-----|
| 0 | ok	| 调用成功 |
| 1 | 请求有点问题，请反馈客服 | 传入参数非法 |
| 2 | 服务开小差，请稍等| 系统错误，请联系技术支持 |
| 3 | 服务开小差，休息一会再试试 | 未知问题，请联系技术支持 |
| 4 | 认证错误/AccessDenied | token认证失败 |
| 13 | 调用方式有点小问题，请反馈客服 | 传入参数非法 |
| 40000 | 会话异常，请重新登录或稍后再试 |
| 41017 | 查询SNAP信息失败 |
| 41025 | 查询套餐失败 |
| 41026 | 查询镜像失败 |
| 41039 | 查询EIP信息失败 |
| 41049 | 找不到SG |
| 41050 | 创建SG失败 |
| 41052 | 查询SG信息失败 |
| 41053 | 查询安全组规则失败 |
| 41054 | 删除SG失败 |
| 41056 | 绑定DC2至安全组失败 |
| 41057 | DC2从安全组解绑失败 |
| 41059 | 不允许删除默认SG |
| 41060 | 找不到指定SG规则 |
| 41063 | 找不到指定DC2 |
| 41088 | 创建EBS失败 |
| 41094 | 查询EBS信息失败 |
| 41099 | 创建DC2失败 |
| 41107 | 修改DC2规格失败 |
| 41108 | 查询DC2信息失败 |
| 41113 | 查询EBS总量失败 |
| 41115 | 查询SNAP总量失败 |
| 41117 | 查询DC2总量失败 |
| 41121 | 查询VPC信息失败 |
| 41126 | 查询SUBNET信息失败 |
| 41135 | 查询SUBNET总量失败 |
| 41139 | 校验子网网段失败 |
| 41153 | 请先解绑所有关联到该安全组的DC2 |
| 41164 | 不允许更改为不同类型的DC2规格 |
| 41165 | 不允许更改为更低配置的DC2规格 |
| 41172 | 通用型DC2根盘超过大小限制 |
| 41181 | 安全组规则存在重复项，请检查输入 |
| 1000011 | 账户已欠费，无法进行该操作 |
| 1100017 | 包月到期策略设置失败 |
| 1100018 | 包月续费设置失败 |
| 1100020 | 余额不足 |
| 1100022 | 获取价格失败 |
| 1100026 | 包月信息获取失败 |
| 1100027 | 包月资源不能删除 |
| 1100029 | 所选资源暂不允许包月购买 |
| 1100036 | 资源已转换为包月，无需重复操作 |
| 1300000 | 资源价格获取失败 |
| 2000001 | sshkey增加错误 |
| 2000002 | sshkey查询错误 |
| 2000003 | sshkey删除错误 |
| 2000004 | 不合法的sshkey |
| 10000001 | 没有权限，请联系管理员 |
| 16000002 | 查询地域与可用区信息失败 |
