# 概要

Nablarch Application Frameworkを使用する際に、
処理方式毎のライブラリを集約したpomを提供します。


例えば、Webアプリケーションを作成する場合、
web用のプロファイルを使用します。


```xml
  <dependencies>
    <dependency>
      <groupId>com.nablarch.profile</groupId>
      <artifactId>nablarch-web</artifactId>
      <version>1.0.0</version>
    </dependency>
  </dependencies>
```

これにより以下のような依存関係が設定されます。

```
    com.nablarch.profile:nablarch-web:jar:1.0.0
    +- com.nablarch.framework:nablarch-fw-web-extension:jar:1.0.0:compile
    |  +- com.nablarch.framework:nablarch-fw-web:jar:1.0.0:compile
    |  |  +- com.nablarch.framework:nablarch-core-beans:jar:1.0.0:compile
    |  |  +- com.nablarch.framework:nablarch-fw:jar:1.0.0:compile
    |  |  +- com.nablarch.framework:nablarch-core-validation:jar:1.0.0:compile
    |  |  |  \- com.nablarch.framework:nablarch-core-message:jar:1.0.0:compile
    |  |  \- com.nablarch.framework:nablarch-core-repository:jar:1.0.0:compile
    |  +- com.nablarch.framework:nablarch-core-jdbc:jar:1.0.0:compile
    |  |  +- com.nablarch.framework:nablarch-core-transaction:jar:1.0.0:compile
    |  |  +- com.nablarch.framework:nablarch-core-applog:jar:1.0.0:compile
    |  |  \- org.apache.geronimo.specs:geronimo-jpa_2.0_spec:jar:1.1:compile
    |  \- com.nablarch.framework:nablarch-core-dataformat:jar:1.0.0:compile
    |     \- com.nablarch.framework:nablarch-core:jar:1.0.0:compile
    \- com.nablarch.framework:nablarch-fw-web-tag:jar:1.0.0:compile
       +- taglibs:standard:jar:1.1.2:runtime
       +- com.nablarch.framework:nablarch-common-code:jar:1.0.0:compile
       +- com.nablarch.framework:nablarch-common-exclusivecontrol:jar:1.0.0:compile
       +- com.nablarch.framework:nablarch-common-encryption:jar:1.0.0:compile
       \- com.nablarch.framework:nablarch-common-auth:jar:1.0.0:compile
```



