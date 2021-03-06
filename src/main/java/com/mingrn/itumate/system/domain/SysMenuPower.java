package com.mingrn.itumate.system.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 系统菜单与功能关联表
 *
 * @author MinGRn <br > MinGRn97@gmail.com
 * @date 2020/1/23 14:12
 */
@Setter
@Getter
@ToString
@Table(name = "sys_menu_power")
public class SysMenuPower implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 菜单表主键
     */
    @Column(name = "menu_object_id")
    private Long menuObjectId;

    /**
     * 功能表主键
     */
    @Column(name = "power_object_id")
    private Long powerObjectId;

    /**
     * 删除状态：1删除 0未删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 修改用户
     */
    @Column(name = "modify_user")
    private String modifyUser;

    private static final long serialVersionUID = 1L;
}