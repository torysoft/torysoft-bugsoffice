package com.torysoft.bugsoffice.core.domain;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.torysoft.bugsoffice.core.domain.util.IdGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Code extends Default{
	
	@Id
	@GeneratedValue(generator = "codeid")
	@GenericGenerator(name = "codeid", strategy = "com.torysoft.bugsoffice.core.domain.util.IdGenerator", parameters = {
			@Parameter(name = IdGenerator.PREFIX, value = "CODE") })
	private String codeId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pCodeId")
	private Code pCode;
	
	@OneToMany
	@JoinColumn(name = "pCodeId")
	private List<Code> children = new LinkedList<>();
	
	private String category;
	private String codeKey;
	private String codeValue;
	private String comment;
	private String lang;
}
