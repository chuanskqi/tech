drop table if exists account;
CREATE TABLE IF NOT EXISTS account (
                                       id  int(11) NOT NULL AUTO_INCREMENT,
                                       email VARCHAR(255) NOT NULL COMMENT '邮箱',
                                       name VARCHAR(255) NOT NULL COMMENT '昵称',
                                       phone_number VARCHAR(20) NOT NULL COMMENT '电话号码',
                                       status VARCHAR(1) NOT NULL COMMENT '用户状态控制',
                                       password_hash VARCHAR(100) default '',
                                       photo_url VARCHAR(255) NOT NULL,
                                       create_time TIMESTAMP NOT NULL default current_timestamp,
                                       update_time TIMESTAMP NOT NULL default current_timestamp,
                                       PRIMARY KEY (id),
									   UNIQUE INDEX uk_email (email),
                                       key idx_account_phone_number (phone_number)
) ENGINE=InnoDB,COMMENT='用户表,记录用户信息';

drop table if exists pay_account;
CREATE TABLE IF NOT EXISTS pay_account (
                                       id  int(11) NOT NULL AUTO_INCREMENT,
									   account_id int(11) NOT NULL COMMENT '外键，account用户id',
                                       account_no VARCHAR(255) NOT NULL COMMENT '支付账户号',
									   account_name VARCHAR(255) NOT NULL COMMENT '支付账户户名',
                                       account_type VARCHAR(1) NOT NULL COMMENT '支付宝-1',
									   un_settled_fee Decimal(10,2) COMMENT '未结算金额',
                                       settled_fee Decimal(10,2) COMMENT '已结算金额',
                                       create_time TIMESTAMP NOT NULL default current_timestamp,
                                       update_time TIMESTAMP NOT NULL default current_timestamp,
									   PRIMARY KEY (id),
									   UNIQUE INDEX uk_account_no_account_type (account_no, account_type),
									   key idx_account_id (account_id)

)ENGINE=InnoDB,COMMENT='用户支付账户表,记录支付宝，微信等账户号';

drop table if exists share_resource;
CREATE TABLE IF NOT EXISTS share_resource (
                                       id  int(11) NOT NULL AUTO_INCREMENT,
									   account_id int(11) NOT NULL COMMENT '外键，account用户id',
									   title VARCHAR(20) NOT NULL COMMENT '资源标题',
									   resource_type VARCHAR(10) default '' COMMENT '资源类型,用户可分类',
                                       detail VARCHAR(255) NOT NULL COMMENT '资源描述,填写客服联系方式等',
									   amount Decimal(10,2) NOT NULL  COMMENT '资源出售价格/元',
									   pay_count int(11) COMMENT '购买数,已支付次数',
									   pay_url VARCHAR(255) NOT NULL COMMENT '该资源生成二维码收款链接',
									   status VARCHAR(255) NOT NULL COMMENT '上下架管理',
                                       create_time TIMESTAMP NOT NULL default current_timestamp,
                                       update_time TIMESTAMP NOT NULL default current_timestamp,
									   PRIMARY KEY (id),
									   key idx_account_id (account_id)

)ENGINE=InnoDB,COMMENT='资源表,记录用户分享记录';

drop table if exists share_resource_flow;
CREATE TABLE IF NOT EXISTS share_resource_flow (
                                       id  int(11) NOT NULL AUTO_INCREMENT,
									   account_id int(11) NOT NULL COMMENT '外键，account用户id',
									   share_resource_id int(11) NOT NULL COMMENT '资源id',
									   order_id VARCHAR(20) NOT NULL COMMENT '支付订单号',
									   account_type VARCHAR(1) NOT NULL COMMENT '支付宝-1',
									   status VARCHAR(1) NOT NULL COMMENT '待支付-0,支付成功-1',
                                       create_time TIMESTAMP NOT NULL default current_timestamp,
                                       update_time TIMESTAMP NOT NULL default current_timestamp,
									   PRIMARY KEY (id),
									   key idx_account_id (account_id),
									   key idx_order_id (order_id),
									   key idx_share_resource_id (share_resource_id)
)ENGINE=InnoDB,COMMENT='资源表订单流水表';



