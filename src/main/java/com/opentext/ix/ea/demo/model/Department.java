package com.opentext.ix.ea.demo.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.wordnik.swagger.annotations.ApiModelProperty;



@XmlRootElement(name = "Department")
public class Department {
  private long id;
  private String name;
  private List<String> photoUrls = new ArrayList<String>();
  private String status;

  @XmlElement(name = "id")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @XmlElement(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlElementWrapper(name = "photoUrls")
  @XmlElement(name = "photoUrl")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }


  @XmlElement(name = "status")
  @ApiModelProperty(value = "Department status", allowableValues = "active,inactive,pending")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  
  public Department (int deptId, String name, String status)
  {
	  this.id = deptId;
	  this.name = name;
	  this.status = status; 
  }
  
  public Department()
  { }
 }

