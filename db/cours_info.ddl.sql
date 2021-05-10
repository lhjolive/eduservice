-- test.cours_info definition

CREATE TABLE `cours_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cours_name` varchar(255) DEFAULT '' COMMENT '课程名称',
  `stage` varchar(255) DEFAULT '' COMMENT '阶段',
  `grade` varchar(255) DEFAULT '' COMMENT '年级',
  `cours_time` varchar(255) DEFAULT '' COMMENT '上课时间',
  `tracher` varchar(255) DEFAULT '' COMMENT '教师',
  `addr` varchar(255) DEFAULT '' COMMENT '地点',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_status` varchar(1) DEFAULT '1' COMMENT '是否有效  1.有效  2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='课程管理表';