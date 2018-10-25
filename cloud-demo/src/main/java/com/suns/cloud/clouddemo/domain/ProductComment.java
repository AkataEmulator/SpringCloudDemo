package com.suns.cloud.clouddemo.domain;

import com.google.common.base.MoreObjects;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 见贤不思齐
 * @time 2018/10/25.
 * @desc
 */
@Entity
@Table(name = "tbProduct_Comment")
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.MODULE)
public class ProductComment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private Long productId;

    private Long authorId;

    private String content;

    private Date created;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("productId", getProductId())
                .add("authorId", getAuthorId())
                .add("content", getContent())
                .toString();
    }
}
