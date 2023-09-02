/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : emptest

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 02/09/2023 23:30:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for degree
-- ----------------------------
DROP TABLE IF EXISTS `degree`;
CREATE TABLE `degree`  (
  `degree_id` int NOT NULL COMMENT '学位编号',
  `degree_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学位名称',
  PRIMARY KEY (`degree_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of degree
-- ----------------------------
INSERT INTO `degree` VALUES (1, '大专');
INSERT INTO `degree` VALUES (2, '本科');
INSERT INTO `degree` VALUES (3, '研究生');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_no` int NOT NULL COMMENT '部门编号',
  `dept_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`dept_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '业务部');
INSERT INTO `dept` VALUES (2, '后勤部');
INSERT INTO `dept` VALUES (3, '人事部');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `emp_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
  `age` int NULL DEFAULT NULL COMMENT '年龄',
  `dept_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门名称',
  `emp_degree_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学历',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, '张一', '男', 25, '业务部', '本科');
INSERT INTO `emp` VALUES (2, '张二', '女', 26, '人事部', '本科');
INSERT INTO `emp` VALUES (3, '张三', '男', 27, '后勤部', '大专');
INSERT INTO `emp` VALUES (4, '张四', '女', 28, '人事部', '大专');
INSERT INTO `emp` VALUES (5, '张五', '男', 29, '后勤部', '大专');
INSERT INTO `emp` VALUES (6, '张六', '女', 29, '后勤部', '本科');
INSERT INTO `emp` VALUES (7, '张七', '男', 33, '业务部', '研究生');
INSERT INTO `emp` VALUES (8, '张八', '男', 32, '业务部', '本科');
INSERT INTO `emp` VALUES (9, '张九', '女', 33, '业务部', '大专');
INSERT INTO `emp` VALUES (10, '李一', '女', 45, '业务部', '研究生');
INSERT INTO `emp` VALUES (11, '李二', '女', 19, '人事部', '本科');
INSERT INTO `emp` VALUES (12, '李三', '男', 28, '业务部', '研究生');
INSERT INTO `emp` VALUES (13, '李四', '女', 46, '后勤部', '研究生');
INSERT INTO `emp` VALUES (14, '李五', '男', 58, '业务部', '大专');
INSERT INTO `emp` VALUES (15, '李六', '女', 22, '人事部', '研究生');
INSERT INTO `emp` VALUES (16, '李七', '男', 26, '后勤部', '大专');
INSERT INTO `emp` VALUES (17, '李八', '男', 25, '人事部', '研究生');
INSERT INTO `emp` VALUES (18, '李九', '女', 29, '后勤部', '研究生');
INSERT INTO `emp` VALUES (19, '王一', '男', 45, '后勤部', '本科');
INSERT INTO `emp` VALUES (20, '王二', '女', 21, '业务部', '本科');
INSERT INTO `emp` VALUES (21, '王三', '男', 21, '业务部', '大专');
INSERT INTO `emp` VALUES (22, '王四', '男', 23, '业务部', '大专');
INSERT INTO `emp` VALUES (23, '王五', '女', 33, '业务部', '大专');
INSERT INTO `emp` VALUES (24, '王六', '男', 45, '人事部', '本科');
INSERT INTO `emp` VALUES (25, '王七', '男', 35, '业务部', '研究生');
INSERT INTO `emp` VALUES (26, '王八', '男', 41, '后勤部', '本科');
INSERT INTO `emp` VALUES (27, '王九', '女', 25, '业务部', '大专');
INSERT INTO `emp` VALUES (28, '赵一', '男', 26, '人事部', '研究生');
INSERT INTO `emp` VALUES (29, '赵二', '男', 20, '后勤部', '本科');
INSERT INTO `emp` VALUES (30, '赵三', '女', 21, '人事部', '研究生');
INSERT INTO `emp` VALUES (31, '赵四', '男', 19, '后勤部', '研究生');
INSERT INTO `emp` VALUES (32, '赵五', '女', 35, '后勤部', '大专');
INSERT INTO `emp` VALUES (33, '赵六', '男', 24, '业务部', '研究生');
INSERT INTO `emp` VALUES (34, '赵七', '男', 29, '业务部', '大专');
INSERT INTO `emp` VALUES (35, '赵八', '女', 33, '业务部', '研究生');
INSERT INTO `emp` VALUES (36, '赵九', '男', 45, '业务部', '本科');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登录密码',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '806EE4B233E10FF1BFC0ADDB796FFFA1765977E3487ACAD932EEF1FC');

SET FOREIGN_KEY_CHECKS = 1;
