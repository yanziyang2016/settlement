package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.google.gson.annotations.Expose;
import play.data.format.Formats;
import play.db.ebean.Model;

@Entity
@Table(name = "cblUser")
public class CblUser extends Model implements Serializable {
	@Id
	@Expose
	public Long id;
	
	@Column(length = 20)
	@Size(max = 20)
	@Expose
	public String name;
	   
	@Column(length = 20)
	@Size(max = 20)
	@Expose
	public String phone;
	
	@Expose
	public Long bsUserId;
	
	@Expose
	@Column(columnDefinition = "integer(1)")
	public int deleteStatus;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "timestamp NULL")
	@Expose
	public Date createDate;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "timestamp NULL")
	@Expose
	public Date updateDate;
	
	@Expose
	public Long createPerson;
	
	@Expose
	public Long updatePerson;
	
}
