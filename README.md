# mojipic
[N予備校 プログラミングコース 大規模Webアプリ 実践大規模Webアプリ](https://www.nnn.ed.nico/courses/146/chapters/4028)  
LGTM (Looks good to me) 画像を作成するためのサービス

## URL 設計

| パス | メソッド | 内容 |
| --- | --- | --- |
| / | GET | トップページの表示 |
| /login | GET | Twitter を利用したログインの実施 |
| /logout | GET | Twitter を利用したログアウトの実施 |
| /oauth_callback | GET | Twitter からの OAuth 認証のコールバックを受け取る URL |
| /pictures | POST | 画像とプロパティ情報の投稿 |
| /pictures/:pictureId | GET | 変換された画像のバイナリの表示 |
| /properties | GET | プロパティ情報の一覧の JSON を取得する Web API |
| /users/:twitterId/properties | GET | Twitter ユーザーのプロパティ情報の一覧の JSON を取得する Web API |

## 環境構築
```bash
cd ./tool
docker-compose up -d
```
