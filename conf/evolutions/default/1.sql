# picture_properties schema

# --- !Ups

create table picture_properties(
  picture_id bigint(20) not null auto_increment comment '写真のID',
  status varchar(255) not null comment '変換の状態',
  twitter_id bigint(20) not null comment 'Twitter 上でのユーザーID',
  file_name varchar(255) not null comment '元のファイル名',
  content_type varchar(255) not null comment 'コンテントタイプ',
  overlay_text varchar(255) not null comment 'オーバーレイするテキスト',
  overlay_text_size int(4) not null comment 'オーバーレイするテキストのサイズ',
  original_filepath varchar(255) not null comment '元画像のファイルパス',
  converted_filepath varchar(255) comment '変換後のファイルパス',
  created_time datetime not null comment '作成日時',
  primary key (picture_id),
  index(twitter_id),
  index(created_time)
) engine=innodb charset=utf8mb4;

# --- !Downs

drop table picture_properties;
