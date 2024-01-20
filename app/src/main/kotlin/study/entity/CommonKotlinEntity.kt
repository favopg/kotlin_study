package study.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
open class CommonKotlinEntity {

    @Column(name = "create_user", updatable = false)
    @CreatedBy
    var createUser :String? = null

    @Column(name = "created_at", updatable = false)
    @CreatedDate
    var createdAt :LocalDateTime? = null

    @Column(name = "update_user")
    @LastModifiedBy
    var updateUser :String? = null;

    @Column(name = "updated_at")
    @LastModifiedDate
    var updatedAt :LocalDateTime? = null

    @Version
    @Column(name = "version")
    var version :Int? = null

}