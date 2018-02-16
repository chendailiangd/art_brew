/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : art_brew

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2018-01-23 22:34:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for brew_goods
-- ----------------------------
DROP TABLE IF EXISTS `brew_goods`;
CREATE TABLE `brew_goods` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) DEFAULT NULL,
  `goods_description` text,
  `goods_market_price` double DEFAULT NULL,
  `goods_brew_price` double DEFAULT NULL,
  `goods_cover_image` varchar(255) DEFAULT NULL,
  `goods_introduce_image1` varchar(255) DEFAULT NULL,
  `goods_introduce_image2` varchar(255) DEFAULT NULL,
  `goods_introduce_image3` varchar(255) DEFAULT NULL,
  `goods_introduce_image4` varchar(255) DEFAULT NULL,
  `goods_introduce_image5` varchar(255) DEFAULT NULL,
  `goods_introduce_image6` varchar(255) DEFAULT NULL,
  `goods_introduce_video` varchar(255) DEFAULT NULL,
  `goods_publish_time` datetime DEFAULT NULL,
  `goods_status` char(2) DEFAULT NULL,
  `goods_type` char(2) DEFAULT NULL,
  `goods_cart` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brew_goods
-- ----------------------------
INSERT INTO `brew_goods` VALUES ('1', '黑啤 正宗罗飞黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('2', '黑啤2', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('3', '黑啤3', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('4', '黑啤4', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('5', '黑啤5', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('6', '黑啤6', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('7', '黑啤7', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('8', '黑啤8', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('9', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('10', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('11', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('12', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('13', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('14', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('15', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', 'cart.jpg');
INSERT INTO `brew_goods` VALUES ('16', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', null);
INSERT INTO `brew_goods` VALUES ('17', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', null);
INSERT INTO `brew_goods` VALUES ('18', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', null);
INSERT INTO `brew_goods` VALUES ('19', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', null);
INSERT INTO `brew_goods` VALUES ('20', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', null);
INSERT INTO `brew_goods` VALUES ('21', '黑啤', '这个很好喝', '399', '299', 'c01.jpg', 'i01.jpg', 'i02.jpg', 'i03.jpg', 'i04.jpg', 'i05.jpg', 'i06.jpg', 'v1.mp4', '2017-12-31 18:24:11', '01', '01', null);

-- ----------------------------
-- Table structure for brew_news
-- ----------------------------
DROP TABLE IF EXISTS `brew_news`;
CREATE TABLE `brew_news` (
  `nid` int(11) NOT NULL AUTO_INCREMENT,
  `news_title` text,
  `news_content` text,
  `news_image` varchar(255) DEFAULT NULL,
  `news_video` varchar(255) DEFAULT NULL,
  `news_type` char(2) DEFAULT NULL,
  `publish_time` datetime DEFAULT NULL,
  `comment` text,
  `comment_time` datetime DEFAULT NULL,
  `reply` text,
  `reply_time` datetime DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brew_news
-- ----------------------------

-- ----------------------------
-- Table structure for brew_order
-- ----------------------------
DROP TABLE IF EXISTS `brew_order`;
CREATE TABLE `brew_order` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(255) NOT NULL,
  `order_status` char(2) DEFAULT NULL COMMENT '01:未付款，02:已付款，未发货，03:已发货，04:已收货',
  `goods_count` int(11) DEFAULT NULL,
  `receiver` varchar(255) DEFAULT NULL,
  `receiver_address` varchar(255) DEFAULT NULL,
  `receiver_phone` varchar(255) DEFAULT NULL,
  `receive_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL,
  `sent_time` datetime DEFAULT NULL,
  `finish_time` datetime DEFAULT NULL,
  `post_fee` double DEFAULT NULL,
  `coupon` double DEFAULT NULL,
  `gid_one` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `gid_two` int(11) DEFAULT NULL,
  `gid_three` int(11) DEFAULT NULL,
  `git_four` int(11) DEFAULT NULL,
  `gid_five` int(11) DEFAULT NULL,
  `goods_subtotal` double DEFAULT NULL,
  `goods_total` double DEFAULT NULL,
  PRIMARY KEY (`oid`,`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brew_order
-- ----------------------------
INSERT INTO `brew_order` VALUES ('1', 'BWATJJYQ201801112045511060988', '01', '1', '无名氏', '重庆江北', '17784323751', null, '2018-01-11 20:45:51', '2018-01-11 20:45:51', '2018-01-14 17:42:00', null, null, null, '1', 'aaa', null, null, null, null, '299', '299');
INSERT INTO `brew_order` VALUES ('2', 'BWATGRQE20180111205232424983', '01', '1', '我我', '重庆江北', '123456', null, '2018-01-11 20:52:32', '2018-01-14 17:43:06', '2018-01-14 17:43:09', null, null, null, '1', 'ccc', null, null, null, null, '299', '598');
INSERT INTO `brew_order` VALUES ('3', 'BWATGRQE20180111205232424983', '01', '1', '我我', '重庆江北', '123456', null, '2018-01-11 20:52:32', '2018-01-14 17:44:01', '2018-01-14 17:44:03', null, null, null, '2', 'ccc', null, null, null, null, '299', '598');
INSERT INTO `brew_order` VALUES ('4', 'BWATFVRM20180111223511971001', '01', '5', null, null, null, null, '2018-01-11 22:35:11', null, null, null, null, null, '1', 'fff', null, null, null, null, '1495', '2392');
INSERT INTO `brew_order` VALUES ('5', 'BWATFVRM20180111223511971001', '01', '3', null, null, null, null, '2018-01-11 22:35:11', null, null, null, null, null, '2', 'fff', null, null, null, null, '897', '2392');

-- ----------------------------
-- Table structure for brew_user
-- ----------------------------
DROP TABLE IF EXISTS `brew_user`;
CREATE TABLE `brew_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `user_status` char(2) NOT NULL COMMENT '01：未激活,02：激活，03：冻结',
  `regist_time` datetime DEFAULT NULL,
  `oid` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `user_role` char(2) NOT NULL COMMENT '01：管理员，02：普通用户,03：商家',
  `active_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brew_user
-- ----------------------------
INSERT INTO `brew_user` VALUES ('1', 'ccc', '123', 'chendailiangd@qq.com', '陈代良', '02', '2017-12-26 14:54:22', '5', null, null, '02', null);
INSERT INTO `brew_user` VALUES ('2', 'sss', 'sss', 'aaa@shop.com', null, '01', '2017-12-31 03:06:04', '5', null, null, '02', '876906');
INSERT INTO `brew_user` VALUES ('3', 'fff', 'www', 'aaa@shop.com', '傻逼', '02', '2017-12-31 17:58:10', '5', null, null, '02', '500967');
