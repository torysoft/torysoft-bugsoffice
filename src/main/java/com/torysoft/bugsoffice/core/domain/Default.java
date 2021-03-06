package com.torysoft.bugsoffice.core.domain;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.torysoft.bugsoffice.core.code.YON;

import lombok.Data;

@MappedSuperclass
@Data
public class Default{
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date saveTime = new Date();
	
	@OneToOne
	@JoinColumn(name = "saveUser")
	private User saveUser;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;
	
	@OneToOne
	@JoinColumn(name = "updateUser")
	private User updateUser;
	
	@Enumerated(EnumType.STRING)
	private YON isDeleted;
}
