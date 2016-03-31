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
@Table(name = "rechargeCardTemplate")
public class RechargeCardTemplate extends Model implements Serializable {
	@Id
	@Expose
	public Long id;
	
	@Expose
	public Long bsUserId;
	
	@Column(length = 20)
	@Size(max = 20)
	@Expose
	public String titleInfo;
	
	@Expose
	@Column(columnDefinition = "integer(5)")
	public int denomination;
	
	@Expose
	@Column(columnDefinition = "integer(10)")
	public int count;
	
	@Expose
	@Column(columnDefinition = "integer(1)")
	public int displayApp;
	
	@Expose
	@Column(columnDefinition = "integer(1)")
	public int displayRecharge;
	
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
