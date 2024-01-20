# kotlin入門
kotlinの勉強をしたい人はmainブランチから取得すれば動く・・・・はず・・・・笑

## ブランチ説明  
- main  
基本変えないかも？
作品ができたら入れるかもしれない
- study_debelop  
純粋のkotlin勉強用ブランチ。
好き勝手にコミットしてもらって大丈夫です。  
- spring_kotlin  
管理者がJava + Spring Bootを使用したWebアプリケーションでkotlin勉強するためのブランチです。
当ブランチがそのうちmainに上がっているかもしれないです。

## ローカル環境構築方法
- ローカルにgradleをダウンロードしてください  
https://gradle.org/releases/
- コマンドプロンプトでgradle -versionと打って、gradleが動くことを確認してください。    
システム環境変数を設定すればできます。
- ローカルにJDKをダウンロードしてください  
https://www.oracle.com/jp/java/technologies/downloads/#jdk21-windows
- 残念ながら当プロジェクトでは最新バージョンを追ってないので、バージョン管理は各自で行ってください、、、  
確か、build.gradle.ktsファイルでコンパイルバージョンとかバージョン管理できたはずなので提案いただければ合わせられます。
- いったんはjava version18.0.2 kotlin version 1.9.22 gradle version 8.5で動くことは確認しています。
