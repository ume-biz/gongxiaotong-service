
DROP TABLE IF EXISTS `ALBUM_BASIC` ;
CREATE TABLE `ALBUM_BASIC` (
    `ALBUM_CODE` INT AUTO_INCREMENT PRIMARY KEY COMMENT '编号',
    `ALBUM_TITLE` VARCHAR(64) BINARY NOT NULL    COMMENT '标题',
    `ALBUM_ARTIST` VARCHAR(64) BINARY NOT NULL   COMMENT '作者',
    `ALBUM_LANGUAGE` VARCHAR(16) BINARY NOT NULL     COMMENT '语种',
    `ALBUM_ISSUE_DATE` DATE      COMMENT '发行时间',
    `ALBUM_ISSUE_COMPANY` VARCHAR(64) BINARY     COMMENT '出版商',
    `ALBUM_GENRE` VARCHAR(16) BINARY     COMMENT '风格',
    `ALBUM_COVER_PHOTO` BLOB     COMMENT '封面设计',
    `REMARK` VARCHAR(128) BINARY     COMMENT '备注',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '唱片基本信息' ;

DROP TABLE IF EXISTS `ALBUM_TRACK` ;
CREATE TABLE `ALBUM_TRACK` (
    `ALBUM_CODE` INT(8) NOT NULL     COMMENT '唱片编号',
    `TRACK_NO` INT NOT NULL  COMMENT '曲目顺序',
    `TRACK_NAME` VARCHAR(128) BINARY NOT NULL    COMMENT '歌名',
    `REMARK` VARCHAR(128) BINARY     COMMENT '备注',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '唱片曲目信息' ;
ALTER TABLE `ALBUM_TRACK` ADD CONSTRAINT `PK_ALBUM_TRACK` PRIMARY KEY ( ALBUM_CODE ,TRACK_NO ) ;

DROP TABLE IF EXISTS `ALBUM_CONTRIBUTOR` ;
CREATE TABLE `ALBUM_CONTRIBUTOR` (
    `ALBUM_CODE` INT NOT NULL    COMMENT '唱片编号',
    `CONTRIBUTOR` VARCHAR(64) BINARY NOT NULL    COMMENT '参与创作者',
    `CONTRIBUTED_TRACK` VARCHAR(128) BINARY NOT NULL     COMMENT '参与曲目',
    `REMARK` VARCHAR(128) BINARY     COMMENT '备注',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '唱片参与表演者' ;
ALTER TABLE `ALBUM_CONTRIBUTOR` ADD CONSTRAINT `PK_ALBUM_CONTRIBUTOR` PRIMARY KEY ( ALBUM_CODE ,CONTRIBUTOR ,CONTRIBUTED_TRACK ) ;


DROP TABLE IF EXISTS `UME_USER` ;
CREATE TABLE `UME_USER` (
    `USER_ID` VARCHAR(32) BINARY NOT NULL    COMMENT '用户识别ID',
    `USER_PASSWORD` VARCHAR(32) BINARY   COMMENT '用户登录密码',
    `USER_NAME` VARCHAR(256) BINARY      COMMENT '用户名',
    `USER_NICK_NAME` VARCHAR(256) BINARY     COMMENT '用户昵称',
    `USER_GENDER` INT(1)     COMMENT '用户性别',
    `USER_MOBILE` VARCHAR(16) BINARY     COMMENT '用户手机',
    `USER_EMAIL` VARCHAR(64) BINARY      COMMENT '用户邮箱',
    `USER_HEAD_IMAGE` VARCHAR(256) BINARY    COMMENT '用户头像',
    `USER_DESC` VARCHAR(256) BINARY      COMMENT '用户描述信息',
    `USER_STATUS` INT(1)     COMMENT '用户账户状态',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME用户表' ;
ALTER TABLE `UME_USER` ADD CONSTRAINT `PK_UME_USER` PRIMARY KEY ( USER_ID ) ;

DROP TABLE IF EXISTS `UME_ROLE` ;
CREATE TABLE `UME_ROLE` (
    `ROLE_ID` VARCHAR(32) BINARY NOT NULL    COMMENT '角色ID',
    `ROLE_NAME` VARCHAR(64) BINARY   COMMENT '角色名称',
    `ROLE_DESC` VARCHAR(128) BINARY      COMMENT '角色描述',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME角色定义表' ;
ALTER TABLE `UME_ROLE` ADD CONSTRAINT `PK_UME_ROLE` PRIMARY KEY ( ROLE_ID ) ;

DROP TABLE IF EXISTS `UME_USER_ROLE` ;
CREATE TABLE `UME_USER_ROLE` (
    `USER_ID` VARCHAR(32) BINARY NOT NULL    COMMENT '用户ID',
    `ROLE_ID` VARCHAR(32) BINARY NOT NULL    COMMENT '用户持有角色ID',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME用户角色关系表' ;
ALTER TABLE `UME_USER_ROLE` ADD CONSTRAINT `PK_UME_USER_ROLE` PRIMARY KEY ( USER_ID ,ROLE_ID ) ;

DROP TABLE IF EXISTS `UME_RESOURCE` ;
CREATE TABLE `UME_RESOURCE` (
    `RES_ID` VARCHAR(32) BINARY NOT NULL     COMMENT '资源ID',
    `RES_TYPE` INT(2) NOT NULL   COMMENT '资源类型',
    `RES_NAME` VARCHAR(64) BINARY    COMMENT '资源名称',
    `RES_GROUP` VARCHAR(64) BINARY   COMMENT '资源分组',
    `RES_LINK` VARCHAR(1024) BINARY      COMMENT '资源链接',
    `RES_INDEX` INT(8)   COMMENT '资源排序序号',
    `RES_STATUS` INT(1)      COMMENT '资源状态',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME资源管理表' ;
ALTER TABLE `UME_RESOURCE` ADD CONSTRAINT `PK_UME_RESOURCE` PRIMARY KEY ( RES_ID ,RES_TYPE ) ;

DROP TABLE IF EXISTS `UME_ROLE_ACL` ;
CREATE TABLE `UME_ROLE_ACL` (
    `ROLE_ID` VARCHAR(32) BINARY NOT NULL    COMMENT '角色ID',
    `ACC_RES_ID` VARCHAR(32) BINARY NOT NULL     COMMENT '角色可访问的资源ID',
    `ACC_RES_TYPE` INT(2) NOT NULL   COMMENT '角色可访问的资源ID',
    `ACC_LEVEL` INT(2) NOT NULL DEFAULT 1 COMMENT '访问级别',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME角色资源访问权限关系表' ;
ALTER TABLE `UME_ROLE_ACL` ADD CONSTRAINT `PK_UME_ROLE_ACL` PRIMARY KEY ( ROLE_ID ,ACC_RES_ID ,ACC_RES_TYPE ,ACC_LEVEL ) ;



