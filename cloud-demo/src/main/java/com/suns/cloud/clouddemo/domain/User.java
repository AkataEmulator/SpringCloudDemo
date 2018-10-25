package com.suns.cloud.clouddemo.domain;

import com.google.common.base.MoreObjects;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 见贤不思齐
 * @time 2018/10/25.
 * @desc
 */
@Entity
@Table(name = "tbUser")
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("nickname", getNickname())
                .toString();
    }
}
