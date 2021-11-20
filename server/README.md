# サーバサイド
|                      |            |
| -------------------- | ---------- |
| 言語                 | Java 8     |
| ビルドツール         | Gradle     |
| フレームワーク       | Spring Boot|
| Webコンテナ          | Tomcat (Spring Boot内包)    |

## 1. Gradleのバイナリダウンロード
https://gradle.org/next-steps/?version=7.2&format=bin \
今回はGradle 7.2をインストール

## 2. ダウンロードしたGradleバイナリを解凍して、任意のディレクトリに保存する
例 : `C:\Gradle\gradle-7.2`

## 3. Windowsの環境変数に、2.で保存したgradleのbinディレクトリを追加する
例 : `C:\Gradle\gradle-7.2\bin`

## 4. コマンドプロンプトを再起動して、gradleの環境変数が通っているか確認する
`gradle --version`

## 5. /server ディレクトリでコマンドプロンプトを開いて、コンパイルを実行する
`gradle compileJava`

## 6. プロジェクト作成
VSCodeの場合：
1. フォルダを開く
2. gitからcloneしたwork-shop-2021を開く

Eclipseの場合：
1. 新しいワークスペースを任意のディレクトリに作成する
2. 「ファイル」 > 「インポート」を選択する
3. 「Gradle」 > 「既存の Gradle プロジェクト」を選択し、「次へ」を押下
4. 「プロジェクト・ルート・ディレクトリー」に、gitでcloneしてきたディレクトリパス「・・・work-shop-2021\server」を指定して「完了」を押下


## 7. アプリ起動
1. `Application.java`を右クリック
2. 実行する \
   VSCodeの場合：`Run Java`を選択 \
   Eclipseの場合：`実行` > `Spring Boot アプリケーション`
3. http://localhost:8080 を開く \
   `{"value":"start"}` が表示されればサーバアプリ起動完了！


## 起動できないとき
VSCodeの場合：
- JDKを指定する
VSCodeのsetting.jsonに下記を追加
    "java.home": "java11のJDKパス",
    "java.configuration.runtimes": [
        {
            "default": true,
            "name": "JavaSE-1.8",
            "path": "Java8のJDKパス"
        }
    ],
    →VSCodeのJavaの拡張機能を実行するのにJDK11が必要であるため