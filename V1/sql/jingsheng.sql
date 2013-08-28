/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50155
Source Host           : localhost:3306
Source Database       : jingsheng

Target Server Type    : MYSQL
Target Server Version : 50155
File Encoding         : 65001

Date: 2013-04-20 23:34:36
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `categoryId` int(11) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(10) DEFAULT NULL,
  `categoryCreateUser` varchar(30) DEFAULT NULL,
  `categoryCreateDate` datetime DEFAULT NULL,
  `categoryUpdUser` varchar(30) DEFAULT NULL,
  `categoryUpdDate` datetime DEFAULT NULL,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO category VALUES ('1', '手机', 'purchase', '2013-04-20 19:06:49', 'purchase', '2013-04-20 19:06:49');

-- ----------------------------
-- Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `itemId` int(11) NOT NULL AUTO_INCREMENT,
  `itemNo` varchar(30) NOT NULL,
  `itemName` varchar(30) NOT NULL,
  `itemNum` int(11) NOT NULL,
  `itemPrice` decimal(10,2) NOT NULL,
  `itemVendorId` int(11) NOT NULL,
  `itemCategoryId` int(11) NOT NULL,
  `itemModel` varchar(30) NOT NULL,
  `itemCreateUser` varchar(30) DEFAULT NULL,
  `itemCreateDate` datetime DEFAULT NULL,
  `itemUpdUser` varchar(30) DEFAULT NULL,
  `itemUpdDate` datetime DEFAULT NULL,
  PRIMARY KEY (`itemId`),
  KEY `itemCategoryId` (`itemCategoryId`),
  KEY `itemVendorId` (`itemVendorId`),
  CONSTRAINT `itemCategoryId` FOREIGN KEY (`itemCategoryId`) REFERENCES `category` (`categoryId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `itemVendorId` FOREIGN KEY (`itemVendorId`) REFERENCES `vendor` (`vendorId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(30) NOT NULL,
  `userPwd` varchar(30) NOT NULL,
  `userType` varchar(10) NOT NULL,
  `userCreateUser` varchar(30) DEFAULT NULL,
  `userCreateDate` datetime DEFAULT NULL,
  `userUpdUser` varchar(30) DEFAULT NULL,
  `userUpdDate` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', 'admin', 'admin', 'ADM', 'system', '2013-02-04 00:00:00', 'system', '2013-02-11 00:00:00');
INSERT INTO user VALUES ('2', 'finance', '123456', 'FIN', 'admin', '2013-02-11 19:51:20', 'admin', '2013-02-11 19:51:20');
INSERT INTO user VALUES ('3', 'purchase', '123456', 'PUR', 'admin', '2013-02-11 20:34:31', 'admin', '2013-02-11 20:34:31');
INSERT INTO user VALUES ('4', 'purchase123', '123456', 'PUR', 'admin', '2013-02-14 14:05:05', 'admin', '2013-02-14 14:05:05');
INSERT INTO user VALUES ('5', 'guest', '123456', 'FIN', 'admin', '2013-03-03 14:28:52', 'admin', '2013-03-03 14:28:52');

-- ----------------------------
-- Table structure for `vendor`
-- ----------------------------
DROP TABLE IF EXISTS `vendor`;
CREATE TABLE `vendor` (
  `vendorId` int(11) NOT NULL,
  `vendorName` varchar(30) DEFAULT NULL,
  `vendorCategoryId` int(11) DEFAULT NULL,
  `vendorCreateUser` varchar(30) DEFAULT NULL,
  `vendorCreateDate` datetime DEFAULT NULL,
  `vendorUpdUser` varchar(30) DEFAULT NULL,
  `vendorUpdDate` datetime DEFAULT NULL,
  PRIMARY KEY (`vendorId`),
  KEY `vendorCategoryId` (`vendorCategoryId`),
  CONSTRAINT `vendorCategoryId` FOREIGN KEY (`vendorCategoryId`) REFERENCES `category` (`categoryId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vendor
-- ----------------------------
